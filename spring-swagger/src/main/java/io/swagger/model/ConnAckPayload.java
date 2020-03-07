package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConnAck;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnAckPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ConnAckPayload   {
  @JsonProperty("connAck")
  private ConnAck connAck = null;

  public ConnAckPayload connAck(ConnAck connAck) {
    this.connAck = connAck;
    return this;
  }

  /**
   * Get connAck
   * @return connAck
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ConnAck getConnAck() {
    return connAck;
  }

  public void setConnAck(ConnAck connAck) {
    this.connAck = connAck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnAckPayload connAckPayload = (ConnAckPayload) o;
    return Objects.equals(this.connAck, connAckPayload.connAck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connAck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnAckPayload {\n");
    
    sb.append("    connAck: ").append(toIndentedString(connAck)).append("\n");
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
