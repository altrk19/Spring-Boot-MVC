package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.OneOfRequestErrorPayloadRequestError;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RequestErrorPayload
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-01-04T20:50:49.881Z[GMT]")
public class RequestErrorPayload   {
  @JsonProperty("requestError")
  private OneOfRequestErrorPayloadRequestError requestError = null;

  public RequestErrorPayload requestError(OneOfRequestErrorPayloadRequestError requestError) {
    this.requestError = requestError;
    return this;
  }

  /**
   * Get requestError
   * @return requestError
  **/
  @ApiModelProperty(value = "")
  
    public OneOfRequestErrorPayloadRequestError getRequestError() {
    return requestError;
  }

  public void setRequestError(OneOfRequestErrorPayloadRequestError requestError) {
    this.requestError = requestError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestErrorPayload requestErrorPayload = (RequestErrorPayload) o;
    return Objects.equals(this.requestError, requestErrorPayload.requestError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestErrorPayload {\n");
    
    sb.append("    requestError: ").append(toIndentedString(requestError)).append("\n");
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
