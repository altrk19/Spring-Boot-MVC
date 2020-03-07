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
 * ChannelDataWebhooks
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ChannelDataWebhooks   {
  @JsonProperty("x-webhookURL")
  private String xWebhookURL = null;

  @JsonProperty("x-authorization")
  private String xAuthorization = null;

  public ChannelDataWebhooks xWebhookURL(String xWebhookURL) {
    this.xWebhookURL = xWebhookURL;
    return this;
  }

  /**
   * HTTPs URL that notifications should be sent to
   * @return xWebhookURL
  **/
  @ApiModelProperty(required = true, value = "HTTPs URL that notifications should be sent to")
      @NotNull

    public String getXWebhookURL() {
    return xWebhookURL;
  }

  public void setXWebhookURL(String xWebhookURL) {
    this.xWebhookURL = xWebhookURL;
  }

  public ChannelDataWebhooks xAuthorization(String xAuthorization) {
    this.xAuthorization = xAuthorization;
    return this;
  }

  /**
   * HTTP Authorization header content that webhook server expects within the notifications (POST body)
   * @return xAuthorization
  **/
  @ApiModelProperty(value = "HTTP Authorization header content that webhook server expects within the notifications (POST body)")
  
    public String getXAuthorization() {
    return xAuthorization;
  }

  public void setXAuthorization(String xAuthorization) {
    this.xAuthorization = xAuthorization;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDataWebhooks channelDataWebhooks = (ChannelDataWebhooks) o;
    return Objects.equals(this.xWebhookURL, channelDataWebhooks.xWebhookURL) &&
        Objects.equals(this.xAuthorization, channelDataWebhooks.xAuthorization);
  }

  @Override
  public int hashCode() {
    return Objects.hash(xWebhookURL, xAuthorization);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDataWebhooks {\n");
    
    sb.append("    xWebhookURL: ").append(toIndentedString(xWebhookURL)).append("\n");
    sb.append("    xAuthorization: ").append(toIndentedString(xAuthorization)).append("\n");
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
