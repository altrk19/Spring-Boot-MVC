package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NotificationChannelArray;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelList
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelList   {
  @JsonProperty("notificationChannel")
  private NotificationChannelArray notificationChannel = null;

  @JsonProperty("resourceURL")
  private String resourceURL = null;

  public NotificationChannelList notificationChannel(NotificationChannelArray notificationChannel) {
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
    public NotificationChannelArray getNotificationChannel() {
    return notificationChannel;
  }

  public void setNotificationChannel(NotificationChannelArray notificationChannel) {
    this.notificationChannel = notificationChannel;
  }

  public NotificationChannelList resourceURL(String resourceURL) {
    this.resourceURL = resourceURL;
    return this;
  }

  /**
   * Get resourceURL
   * @return resourceURL
  **/
  @ApiModelProperty(example = "/cpaas/notificationchannel/v1/e33c51d7-6585-4aee-88ae-005dfae1fd3b/channels", required = true, value = "")
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
    NotificationChannelList notificationChannelList = (NotificationChannelList) o;
    return Objects.equals(this.notificationChannel, notificationChannelList.notificationChannel) &&
        Objects.equals(this.resourceURL, notificationChannelList.resourceURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationChannel, resourceURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelList {\n");
    
    sb.append("    notificationChannel: ").append(toIndentedString(notificationChannel)).append("\n");
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
