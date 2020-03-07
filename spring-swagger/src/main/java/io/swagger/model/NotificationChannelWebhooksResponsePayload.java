package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NotificationChannelWebhooksResponse;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelWebhooksResponsePayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelWebhooksResponsePayload  implements OneOfinlineResponse200 {
  @JsonProperty("notificationChannel")
  private NotificationChannelWebhooksResponse notificationChannel = null;

  public NotificationChannelWebhooksResponsePayload notificationChannel(NotificationChannelWebhooksResponse notificationChannel) {
    this.notificationChannel = notificationChannel;
    return this;
  }

  /**
   * Get notificationChannel
   * @return notificationChannel
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NotificationChannelWebhooksResponse getNotificationChannel() {
    return notificationChannel;
  }

  public void setNotificationChannel(NotificationChannelWebhooksResponse notificationChannel) {
    this.notificationChannel = notificationChannel;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelWebhooksResponsePayload notificationChannelWebhooksResponsePayload = (NotificationChannelWebhooksResponsePayload) o;
    return Objects.equals(this.notificationChannel, notificationChannelWebhooksResponsePayload.notificationChannel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationChannel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelWebhooksResponsePayload {\n");
    
    sb.append("    notificationChannel: ").append(toIndentedString(notificationChannel)).append("\n");
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
