package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChannelDataWebsocket;
import io.swagger.model.XConnCheckRole;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelWebsocketResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelWebsocketResponse  implements AnyOfnotificationChannelArrayItems {
  @JsonProperty("callbackURL")
  private String callbackURL = null;

  @JsonProperty("channelData")
  private ChannelDataWebsocket channelData = null;

  @JsonProperty("channelLifetime")
  private Integer channelLifetime = null;

  /**
   * Gets or Sets channelType
   */
  public enum ChannelTypeEnum {
    WEBSOCKETS("Websockets");

    private String value;

    ChannelTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ChannelTypeEnum fromValue(String text) {
      for (ChannelTypeEnum b : ChannelTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("channelType")
  private ChannelTypeEnum channelType = null;

  @JsonProperty("clientCorrelator")
  private String clientCorrelator = null;

  @JsonProperty("x-connCheckRole")
  private XConnCheckRole xConnCheckRole = null;

  @JsonProperty("resourceURL")
  private String resourceURL = null;

  public NotificationChannelWebsocketResponse callbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
    return this;
  }

  /**
   * The value that other service subscriptions point to receive the notifications from, used internally by $KANDY$. Websockets related channels contain \"ws-\" prefix, following a uuid.
   * @return callbackURL
  **/
  @ApiModelProperty(required = true, value = "The value that other service subscriptions point to receive the notifications from, used internally by $KANDY$. Websockets related channels contain \"ws-\" prefix, following a uuid.")
      @NotNull

    public String getCallbackURL() {
    return callbackURL;
  }

  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  public NotificationChannelWebsocketResponse channelData(ChannelDataWebsocket channelData) {
    this.channelData = channelData;
    return this;
  }

  /**
   * Get channelData
   * @return channelData
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ChannelDataWebsocket getChannelData() {
    return channelData;
  }

  public void setChannelData(ChannelDataWebsocket channelData) {
    this.channelData = channelData;
  }

  public NotificationChannelWebsocketResponse channelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
    return this;
  }

  /**
   * Indicates the negotiated channelLifetime value.
   * @return channelLifetime
  **/
  @ApiModelProperty(required = true, value = "Indicates the negotiated channelLifetime value.")
      @NotNull

    public Integer getChannelLifetime() {
    return channelLifetime;
  }

  public void setChannelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
  }

  public NotificationChannelWebsocketResponse channelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
    return this;
  }

  /**
   * Get channelType
   * @return channelType
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public ChannelTypeEnum getChannelType() {
    return channelType;
  }

  public void setChannelType(ChannelTypeEnum channelType) {
    this.channelType = channelType;
  }

  public NotificationChannelWebsocketResponse clientCorrelator(String clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
    return this;
  }

  /**
   * Get clientCorrelator
   * @return clientCorrelator
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public String getClientCorrelator() {
    return clientCorrelator;
  }

  public void setClientCorrelator(String clientCorrelator) {
    this.clientCorrelator = clientCorrelator;
  }

  public NotificationChannelWebsocketResponse xConnCheckRole(XConnCheckRole xConnCheckRole) {
    this.xConnCheckRole = xConnCheckRole;
    return this;
  }

  /**
   * Get xConnCheckRole
   * @return xConnCheckRole
  **/
  @ApiModelProperty(value = "")
  
    @Valid
    public XConnCheckRole getXConnCheckRole() {
    return xConnCheckRole;
  }

  public void setXConnCheckRole(XConnCheckRole xConnCheckRole) {
    this.xConnCheckRole = xConnCheckRole;
  }

  public NotificationChannelWebsocketResponse resourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
    return this;
  }

  /**
   * Relative path of the websocket notification channel resource object.
   * @return resourceURL
  **/
  @ApiModelProperty(required = true, value = "Relative path of the websocket notification channel resource object.")
      @NotNull

    public String getResourceURL() {
    return resourceURL;
  }

  public void setResourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelWebsocketResponse notificationChannelWebsocketResponse = (NotificationChannelWebsocketResponse) o;
    return Objects.equals(this.callbackURL, notificationChannelWebsocketResponse.callbackURL) &&
        Objects.equals(this.channelData, notificationChannelWebsocketResponse.channelData) &&
        Objects.equals(this.channelLifetime, notificationChannelWebsocketResponse.channelLifetime) &&
        Objects.equals(this.channelType, notificationChannelWebsocketResponse.channelType) &&
        Objects.equals(this.clientCorrelator, notificationChannelWebsocketResponse.clientCorrelator) &&
        Objects.equals(this.xConnCheckRole, notificationChannelWebsocketResponse.xConnCheckRole) &&
        Objects.equals(this.resourceURL, notificationChannelWebsocketResponse.resourceURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackURL, channelData, channelLifetime, channelType, clientCorrelator, xConnCheckRole, resourceURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelWebsocketResponse {\n");
    
    sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
    sb.append("    channelData: ").append(toIndentedString(channelData)).append("\n");
    sb.append("    channelLifetime: ").append(toIndentedString(channelLifetime)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
    sb.append("    xConnCheckRole: ").append(toIndentedString(xConnCheckRole)).append("\n");
    sb.append("    resourceURL: ").append(toIndentedString(resourceURL)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
