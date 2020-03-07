package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.XConnCheckRole;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelWebsocketRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelWebsocketRequest   {
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

  public NotificationChannelWebsocketRequest channelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
    return this;
  }

  /**
   * Indicates the channelLifetime value requested, in seconds.
   * @return channelLifetime
  **/
  @ApiModelProperty(value = "Indicates the channelLifetime value requested, in seconds.")
  
    public Integer getChannelLifetime() {
    return channelLifetime;
  }

  public void setChannelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
  }

  public NotificationChannelWebsocketRequest channelType(ChannelTypeEnum channelType) {
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

  public NotificationChannelWebsocketRequest clientCorrelator(String clientCorrelator) {
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

  public NotificationChannelWebsocketRequest xConnCheckRole(XConnCheckRole xConnCheckRole) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelWebsocketRequest notificationChannelWebsocketRequest = (NotificationChannelWebsocketRequest) o;
    return Objects.equals(this.channelLifetime, notificationChannelWebsocketRequest.channelLifetime) &&
        Objects.equals(this.channelType, notificationChannelWebsocketRequest.channelType) &&
        Objects.equals(this.clientCorrelator, notificationChannelWebsocketRequest.clientCorrelator) &&
        Objects.equals(this.xConnCheckRole, notificationChannelWebsocketRequest.xConnCheckRole);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLifetime, channelType, clientCorrelator, xConnCheckRole);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelWebsocketRequest {\n");
    
    sb.append("    channelLifetime: ").append(toIndentedString(channelLifetime)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
    sb.append("    xConnCheckRole: ").append(toIndentedString(xConnCheckRole)).append("\n");
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
