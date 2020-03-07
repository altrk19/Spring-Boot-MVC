package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ChannelDataWebhooks;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelWebhooksResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelWebhooksResponse   {
  @JsonProperty("callbackURL")
  private String callbackURL = null;

  @JsonProperty("channelData")
  private ChannelDataWebhooks channelData = null;

  /**
   * Gets or Sets channelType
   */
  public enum ChannelTypeEnum {
    WEBHOOKS("Webhooks");

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

  @JsonProperty("resourceURL")
  private String resourceURL = null;

  public NotificationChannelWebhooksResponse callbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
    return this;
  }

  /**
   * The value that other service subscriptions point to receive the notifications from, used internally by $KANDY$. Webhooks related channels contain \"wh-\" prefix, following a uuid.
   * @return callbackURL
  **/
  @ApiModelProperty(required = true, value = "The value that other service subscriptions point to receive the notifications from, used internally by $KANDY$. Webhooks related channels contain \"wh-\" prefix, following a uuid.")
      @NotNull

    public String getCallbackURL() {
    return callbackURL;
  }

  public void setCallbackURL(String callbackURL) {
    this.callbackURL = callbackURL;
  }

  public NotificationChannelWebhooksResponse channelData(ChannelDataWebhooks channelData) {
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
    public ChannelDataWebhooks getChannelData() {
    return channelData;
  }

  public void setChannelData(ChannelDataWebhooks channelData) {
    this.channelData = channelData;
  }

  public NotificationChannelWebhooksResponse channelType(ChannelTypeEnum channelType) {
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

  public NotificationChannelWebhooksResponse clientCorrelator(String clientCorrelator) {
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

  public NotificationChannelWebhooksResponse resourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
    return this;
  }

  /**
   * Get resourceURL
   * @return resourceURL
  **/
  @ApiModelProperty(required = true, value = "")
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
    NotificationChannelWebhooksResponse notificationChannelWebhooksResponse = (NotificationChannelWebhooksResponse) o;
    return Objects.equals(this.callbackURL, notificationChannelWebhooksResponse.callbackURL) &&
        Objects.equals(this.channelData, notificationChannelWebhooksResponse.channelData) &&
        Objects.equals(this.channelType, notificationChannelWebhooksResponse.channelType) &&
        Objects.equals(this.clientCorrelator, notificationChannelWebhooksResponse.clientCorrelator) &&
        Objects.equals(this.resourceURL, notificationChannelWebhooksResponse.resourceURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackURL, channelData, channelType, clientCorrelator, resourceURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelWebhooksResponse {\n");
    
    sb.append("    callbackURL: ").append(toIndentedString(callbackURL)).append("\n");
    sb.append("    channelData: ").append(toIndentedString(channelData)).append("\n");
    sb.append("    channelType: ").append(toIndentedString(channelType)).append("\n");
    sb.append("    clientCorrelator: ").append(toIndentedString(clientCorrelator)).append("\n");
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
