package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NotificationChannelLifetimeRequestPayloadNotificationChannelLifetime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelLifetimeRequestPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelLifetimeRequestPayload   {
  @JsonProperty("notificationChannelLifetime")
  private NotificationChannelLifetimeRequestPayloadNotificationChannelLifetime notificationChannelLifetime = null;

  public NotificationChannelLifetimeRequestPayload notificationChannelLifetime(NotificationChannelLifetimeRequestPayloadNotificationChannelLifetime notificationChannelLifetime) {
    this.notificationChannelLifetime = notificationChannelLifetime;
    return this;
  }

  /**
   * Get notificationChannelLifetime
   * @return notificationChannelLifetime
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NotificationChannelLifetimeRequestPayloadNotificationChannelLifetime getNotificationChannelLifetime() {
    return notificationChannelLifetime;
  }

  public void setNotificationChannelLifetime(NotificationChannelLifetimeRequestPayloadNotificationChannelLifetime notificationChannelLifetime) {
    this.notificationChannelLifetime = notificationChannelLifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelLifetimeRequestPayload notificationChannelLifetimeRequestPayload = (NotificationChannelLifetimeRequestPayload) o;
    return Objects.equals(this.notificationChannelLifetime, notificationChannelLifetimeRequestPayload.notificationChannelLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationChannelLifetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelLifetimeRequestPayload {\n");
    
    sb.append("    notificationChannelLifetime: ").append(toIndentedString(notificationChannelLifetime)).append("\n");
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
