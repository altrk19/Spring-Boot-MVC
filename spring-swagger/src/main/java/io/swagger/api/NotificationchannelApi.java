/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.15).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.Body;
import io.swagger.model.InlineResponse200;
import io.swagger.model.NotificationChannelLifetimeRequestPayload;
import io.swagger.model.NotificationChannelLifetimeResponsePayload;
import io.swagger.model.NotificationChannelListResponsePayload;
import io.swagger.model.RequestErrorPayload;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.CookieValue;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
@Api(value = "notificationchannel", description = "the notificationchannel API")
public interface NotificationchannelApi {

    @ApiOperation(value = "Create a new channel", nickname = "createChannel", notes = "Creates a new notifictaion channel, either WebSockets or OMAPush or Webhooks type", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            }),
@Authorization(value = "oAuth2Password", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            })    }, tags={ "Websockets, OMAPush, Webhooks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class),
        @ApiResponse(code = 201, message = "Created", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Request Error", response = RequestErrorPayload.class) })
    @RequestMapping(value = "/notificationchannel/v1/{userId}/channels",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<InlineResponse200> createChannel(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Body body
,@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
);


    @ApiOperation(value = "Retrieve the info of a channel", nickname = "getChannel", notes = "Returns the requested active notification channels for this user ", response = InlineResponse200.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            }),
@Authorization(value = "oAuth2Password", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            })    }, tags={ "Websockets, OMAPush, Webhooks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = InlineResponse200.class),
        @ApiResponse(code = 200, message = "Request Error", response = RequestErrorPayload.class) })
    @RequestMapping(value = "/notificationchannel/v1/{userId}/channels/{channelId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<InlineResponse200> getChannel(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
);


    @ApiOperation(value = "Retrieve the list of channels", nickname = "getChannels", notes = "Returns the list of active notification channels for this user ", response = NotificationChannelListResponsePayload.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            }),
@Authorization(value = "oAuth2Password", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            })    }, tags={ "Websockets, OMAPush, Webhooks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationChannelListResponsePayload.class),
        @ApiResponse(code = 200, message = "Request Error", response = RequestErrorPayload.class) })
    @RequestMapping(value = "/notificationchannel/v1/{userId}/channels",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<NotificationChannelListResponsePayload> getChannels(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "Filter channels with matching clientCorrelator provided") @Valid @RequestParam(value = "clientCorrelator", required = false) String clientCorrelator
,@ApiParam(value = "Filter channels with matching type provided", allowableValues = "Websockets, OMAPush, Webhooks") @Valid @RequestParam(value = "channelType", required = false) String channelType
);


    @ApiOperation(value = "Remove the channel", nickname = "getChannels", notes = "Removes the notification channel ", authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            }),
@Authorization(value = "oAuth2Password", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            })    }, tags={ "Websockets, OMAPush, Webhooks", })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "No Content"),
        @ApiResponse(code = 200, message = "Request Error", response = RequestErrorPayload.class) })
    @RequestMapping(value = "/notificationchannel/v1/{userId}/channels/{channelId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> getChannels(@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
);


    @ApiOperation(value = "Refresh the websocket channel lifetime", nickname = "refreshChannel", notes = "", response = NotificationChannelLifetimeResponsePayload.class, authorizations = {
        @Authorization(value = "oAuth2ClientCredentials", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            }),
@Authorization(value = "oAuth2Password", scopes = { 
            @AuthorizationScope(scope = "openid", description = "retrieve ID token")
            })    }, tags={ "Websockets", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = NotificationChannelLifetimeResponsePayload.class),
        @ApiResponse(code = 200, message = "Request Error", response = RequestErrorPayload.class) })
    @RequestMapping(value = "/notificationchannel/v1/{userId}/channels/{channelId}/channelLifetime",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<NotificationChannelLifetimeResponsePayload> refreshChannel(@ApiParam(value = "" ,required=true )  @Valid @RequestBody NotificationChannelLifetimeRequestPayload body
,@ApiParam(value = "$KANDY$ ID of the user. It can be obtained from `id_token` or `access_token`, which are both JWT tokens and exist in the response of access token request, by extracting `preferred_username` from it.",required=true) @PathVariable("userId") String userId
,@ApiParam(value = "The channelId provided by $KANDY$ after creation.",required=true) @PathVariable("channelId") String channelId
);

}
