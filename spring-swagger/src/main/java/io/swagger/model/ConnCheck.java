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
 * ConnCheck
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ConnCheck   {
  @JsonProperty("interval")
  private Integer interval = null;

  @JsonProperty("newChannelLifetime")
  private Integer newChannelLifetime = null;

  public ConnCheck interval(Integer interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Time interval in seconds after which the sender of the connCheck message intends to send the next connCheck message.
   * @return interval
  **/
  @ApiModelProperty(required = true, value = "Time interval in seconds after which the sender of the connCheck message intends to send the next connCheck message.")
      @NotNull

    public Integer getInterval() {
    return interval;
  }

  public void setInterval(Integer interval) {
    this.interval = interval;
  }

  public ConnCheck newChannelLifetime(Integer newChannelLifetime) {
    this.newChannelLifetime = newChannelLifetime;
    return this;
  }

  /**
   * New channel lifetime offered in seconds. MUST NOT be sent by client, only $KANDY$ provides this param for the *server* role.
   * @return newChannelLifetime
  **/
  @ApiModelProperty(value = "New channel lifetime offered in seconds. MUST NOT be sent by client, only $KANDY$ provides this param for the *server* role.")
  
    public Integer getNewChannelLifetime() {
    return newChannelLifetime;
  }

  public void setNewChannelLifetime(Integer newChannelLifetime) {
    this.newChannelLifetime = newChannelLifetime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnCheck connCheck = (ConnCheck) o;
    return Objects.equals(this.interval, connCheck.interval) &&
        Objects.equals(this.newChannelLifetime, connCheck.newChannelLifetime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, newChannelLifetime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnCheck {\n");
    
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    newChannelLifetime: ").append(toIndentedString(newChannelLifetime)).append("\n");
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
