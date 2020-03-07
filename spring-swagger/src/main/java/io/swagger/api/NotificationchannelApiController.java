package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.InlineResponse200;
import io.swagger.model.NotificationChannelLifetimeRequestPayload;
import io.swagger.model.NotificationChannelLifetimeResponsePayload;
import io.swagger.model.NotificationChannelListResponsePayload;
import io.swagger.model.RequestErrorPayload;
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
public class NotificationchannelApiController implements NotificationchannelApi {

    private static final Logger log = LoggerFactory.getLogger(NotificationchannelApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public NotificationchannelApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<InlineResponse200> createChannel(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body
,@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("\"\"", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<InlineResponse200> getChannel(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<InlineResponse200>(objectMapper.readValue("\"\"", InlineResponse200.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<InlineResponse200>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<InlineResponse200>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<NotificationChannelListResponsePayload> getChannels(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "Filter channels with matching clientCorrelator provided") @Valid @RequestParam(value = "clientCorrelator", required = false) String clientCorrelator
,@ApiParam(value = "Filter channels with matching type provided", allowableValues = "Websockets, OMAPush, Webhooks") @Valid @RequestParam(value = "channelType", required = false) String channelType
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<NotificationChannelListResponsePayload>(objectMapper.readValue("{\n  \"notificationChannelList\" : {\n    \"resourceURL\" : \"/cpaas/notificationchannel/v1/e33c51d7-6585-4aee-88ae-005dfae1fd3b/channels\",\n    \"notificationChannel\" : [ \"\", \"\" ]\n  }\n}", NotificationChannelListResponsePayload.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<NotificationChannelListResponsePayload>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<NotificationChannelListResponsePayload>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> getChannels(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<NotificationChannelLifetimeResponsePayload> refreshChannel(@ApiParam(value = "" ,required=true )  @Valid @RequestBody NotificationChannelLifetimeRequestPayload body
,@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<NotificationChannelLifetimeResponsePayload>(objectMapper.readValue("{\n  \"notificationChannelLifetime\" : {\n    \"channelLifetime\" : 0\n  }\n}", NotificationChannelLifetimeResponsePayload.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<NotificationChannelLifetimeResponsePayload>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<NotificationChannelLifetimeResponsePayload>(HttpStatus.NOT_IMPLEMENTED);
    }

}
