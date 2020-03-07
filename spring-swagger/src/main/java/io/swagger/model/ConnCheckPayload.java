package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ConnCheck;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConnCheckPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class ConnCheckPayload   {
  @JsonProperty("connCheck")
  private ConnCheck connCheck = null;

  public ConnCheckPayload connCheck(ConnCheck connCheck) {
    this.connCheck = connCheck;
    return this;
  }

  /**
   * Get connCheck
   * @return connCheck
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public ConnCheck getConnCheck() {
    return connCheck;
  }

  public void setConnCheck(ConnCheck connCheck) {
    this.connCheck = connCheck;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConnCheckPayload connCheckPayload = (ConnCheckPayload) o;
    return Objects.equals(this.connCheck, connCheckPayload.connCheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(connCheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConnCheckPayload {\n");
    
    sb.append("    connCheck: ").append(toIndentedString(connCheck)).append("\n");
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
