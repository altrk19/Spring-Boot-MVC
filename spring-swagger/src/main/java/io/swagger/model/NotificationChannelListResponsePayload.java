package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.NotificationChannelList;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * NotificationChannelListResponsePayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class NotificationChannelListResponsePayload   {
  @JsonProperty("notificationChannelList")
  private NotificationChannelList notificationChannelList = null;

  public NotificationChannelListResponsePayload notificationChannelList(NotificationChannelList notificationChannelList) {
    this.notificationChannelList = notificationChannelList;
    return this;
  }

  /**
   * Get notificationChannelList
   * @return notificationChannelList
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public NotificationChannelList getNotificationChannelList() {
    return notificationChannelList;
  }

  public void setNotificationChannelList(NotificationChannelList notificationChannelList) {
    this.notificationChannelList = notificationChannelList;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NotificationChannelListResponsePayload notificationChannelListResponsePayload = (NotificationChannelListResponsePayload) o;
    return Objects.equals(this.notificationChannelList, notificationChannelListResponsePayload.notificationChannelList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notificationChannelList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificationChannelListResponsePayload {\n");
    
    sb.append("    notificationChannelList: ").append(toIndentedString(notificationChannelList)).append("\n");
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
