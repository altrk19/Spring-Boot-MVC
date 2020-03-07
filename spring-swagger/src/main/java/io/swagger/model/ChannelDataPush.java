package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ChannelDataPush
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ChannelDataPush   {
  @JsonProperty("appId")
  private String appId = null;

  @JsonProperty("x-deviceToken")
  private String xDeviceToken = null;

  /**
   * Indicates which Push provider to be used
   */
  public enum XProviderEnum {
    APNS("apns"),
    
    FCM("fcm");

    private String value;

    XProviderEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static XProviderEnum fromValue(String text) {
      for (XProviderEnum b : XProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("x-provider")
  private XProviderEnum xProvider = null;

  public ChannelDataPush appId(String appId) {
    this.appId = appId;
    return this;
  }

  /**
   * Defines application bundle ID on FCM\\APNS
   * @return appId
  **/
  @ApiModelProperty(required = true, value = "Defines application bundle ID on FCM\\APNS")
      @NotNull

    public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public ChannelDataPush xDeviceToken(String xDeviceToken) {
    this.xDeviceToken = xDeviceToken;
    return this;
  }

  /**
   * Indicates the token provided by Push provider (FCM\\APNs)
   * @return xDeviceToken
  **/
  @ApiModelProperty(required = true, value = "Indicates the token provided by Push provider (FCM\\APNs)")
      @NotNull

    public String getXDeviceToken() {
    return xDeviceToken;
  }

  public void setXDeviceToken(String xDeviceToken) {
    this.xDeviceToken = xDeviceToken;
  }

  public ChannelDataPush xProvider(XProviderEnum xProvider) {
    this.xProvider = xProvider;
    return this;
  }

  /**
   * Indicates which Push provider to be used
   * @return xProvider
  **/
  @ApiModelProperty(required = true, value = "Indicates which Push provider to be used")
      @NotNull

    public XProviderEnum getXProvider() {
    return xProvider;
  }

  public void setXProvider(XProviderEnum xProvider) {
    this.xProvider = xProvider;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChannelDataPush channelDataPush = (ChannelDataPush) o;
    return Objects.equals(this.appId, channelDataPush.appId) &&
        Objects.equals(this.xDeviceToken, channelDataPush.xDeviceToken) &&
        Objects.equals(this.xProvider, channelDataPush.xProvider);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, xDeviceToken, xProvider);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChannelDataPush {\n");
    
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    xDeviceToken: ").append(toIndentedString(xDeviceToken)).append("\n");
    sb.append("    xProvider: ").append(toIndentedString(xProvider)).append("\n");
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
