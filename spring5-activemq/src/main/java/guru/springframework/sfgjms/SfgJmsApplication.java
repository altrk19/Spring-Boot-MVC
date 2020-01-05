package guru.springframework.sfgjms;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.artemis.core.config.impl.ConfigurationImpl;
import org.apache.activemq.artemis.core.server.ActiveMQServer;
import org.apache.activemq.artemis.core.server.ActiveMQServers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SfgJmsApplication {
    public static void main(String[] args) {
        try {
            ActiveMQServer server = ActiveMQServers.newActiveMQServer(new ConfigurationImpl()
                    .setPersistenceEnabled(false)
                    .setJournalDirectory("target/data/journal")
                    .setSecurityEnabled(false)
                    .addAcceptorConfiguration("invm", "vm://0"));

            server.start();
        } catch (Exception ex) {
            log.error("Error occurred", ex);
        }
        SpringApplication.run(SfgJmsApplication.class, args);
    }
}
