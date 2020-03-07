package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime   {
  @JsonProperty("channelLifetime")
  private Integer channelLifetime = null;

  public NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime channelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
    return this;
  }

  /**
   * Requested channel lifetime in seconds
   * @return channelLifetime
  **/
  @ApiModelProperty(required = true, value = "Requested channel lifetime in seconds")
      @NotNull

    public Integer getChannelLifetime() {
    return channelLifetime;
  }

  public void setChannelLifetime(Integer channelLifetime) {
    this.channelLifetime = channelLifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime notificationChannelLifetimeResponsePayloadNotificationChannelLifetime = (NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime) o;
    return Objects.equals(this.channelLifetime, notificationChannelLifetimeResponsePayloadNotificationChannelLifetime.channelLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelLifetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelLifetimeResponsePayloadNotificationChannelLifetime {\n");
    
    sb.append("    channelLifetime: ").append(toIndentedString(channelLifetime)).append("\n");
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
