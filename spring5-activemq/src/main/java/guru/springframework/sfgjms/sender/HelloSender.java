package guru.springframework.sfgjms.sender;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import guru.springframework.sfgjms.config.JmsConfig;
import guru.springframework.sfgjms.model.HelloWorldMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.Message;
import java.util.Objects;
import java.util.UUID;

@Slf4j
@RequiredArgsConstructor
@Component
public class HelloSender {

    private final JmsTemplate jmsTemplate;
    private final ObjectMapper objectMapper;

    @Scheduled(fixedRate = 2000)  //messages are sent every 2 seconds
    public void sendMessage() {
        //log.debug("I'm Sending a message");
        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello World!")
                .build();
        jmsTemplate.convertAndSend(JmsConfig.MY_QUEUE, message);
        //log.debug("Message Sent!");
    }

    @Scheduled(fixedRate = 2000)
    public void sendandReceiveMessage() throws JMSException {

        HelloWorldMessage message = HelloWorldMessage
                .builder()
                .id(UUID.randomUUID())
                .message("Hello")
                .build();

        Message receviedMsg = jmsTemplate.sendAndReceive(JmsConfig.MY_SEND_RCV_QUEUE, session -> {
            Message helloMessage;
            try {
                helloMessage = session.createTextMessage(objectMapper.writeValueAsString(message));
                helloMessage.setStringProperty("_type", "guru.springframework.sfgjms.model.HelloWorldMessage");

                log.debug("Sending Hello");
                log.debug("Sending message is :{}", helloMessage.getBody(String.class));
                return helloMessage;

            } catch (JsonProcessingException e) {
                throw new JMSException("boom");
            }
        });

        //ilk önce Hello mesajı gönderildi. sonra HelloMessageListener tarafından gönderilen mesaj  receviedMsg değişkenine atandı ve aşağıdaki satır ile  ekrana basıldı.

        if (Objects.nonNull(receviedMsg)) {
            log.debug("Received message is:{}", receviedMsg.getBody(String.class));
        } else {
            log.debug("receviedMsg is null");
        }
    }

}
