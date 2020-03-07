package io.swagger.api;

import io.swagger.model.ConnAckPayload;
import io.swagger.model.ConnCheckPayload;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
@Controller
public class WebsocketApiController implements WebsocketApi {

    private static final Logger log = LoggerFactory.getLogger(WebsocketApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public WebsocketApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ConnAckPayload> websocketPost(@ApiParam(value = "Websocket JSON message body for connCheck, sent by $KANDY$ as negotiated x-connCheckRole = server" ,required=true )  @Valid @RequestBody ConnCheckPayload body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConnAckPayload>(objectMapper.readValue("{\n  \"connAck\" : {\n    \"channelLifetime\" : 0\n  }\n}", ConnAckPayload.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConnAckPayload>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConnAckPayload>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<ConnCheckPayload> websocketPut(@ApiParam(value = "Websocket JSON message body for connAck in response to connCheck, sent by $KANDY$ as negotiated x-connCheckRole = client" ,required=true )  @Valid @RequestBody ConnAckPayload body
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ConnCheckPayload>(objectMapper.readValue("{\n  \"connCheck\" : {\n    \"newChannelLifetime\" : 6,\n    \"interval\" : 0\n  }\n}", ConnCheckPayload.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ConnCheckPayload>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ConnCheckPayload>(HttpStatus.NOT_IMPLEMENTED);
    }

}
