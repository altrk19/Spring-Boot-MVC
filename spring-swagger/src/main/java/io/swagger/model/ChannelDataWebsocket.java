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
 * ChannelDataWebsocket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ChannelDataWebsocket   {
  @JsonProperty("channelURL")
  private String channelURL = null;

  public ChannelDataWebsocket channelURL(String channelURL) {
    this.channelURL = channelURL;
    return this;
  }

  /**
   * Relative path of the channelURL. For websocket channels, it is used to setup the websocket channel, with GET request having \"ws\" or \"wss\" schema.
   * @return channelURL
  **/
  @ApiModelProperty(required = true, value = "Relative path of the channelURL. For websocket channels, it is used to setup the websocket channel, with GET request having \"ws\" or \"wss\" schema.")
      @NotNull

    public String getChannelURL() {
    return channelURL;
  }

  public void setChannelURL(String channelURL) {
    this.channelURL = channelURL;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDataWebsocket channelDataWebsocket = (ChannelDataWebsocket) o;
    return Objects.equals(this.channelURL, channelDataWebsocket.channelURL);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channelURL);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDataWebsocket {\n");
    
    sb.append("    channelURL: ").append(toIndentedString(channelURL)).append("\n");
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
