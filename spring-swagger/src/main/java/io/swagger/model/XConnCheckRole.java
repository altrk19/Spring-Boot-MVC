package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * Optional param, indicates if client wants to use application level websocket ping-pong (connCheck-connAck), and in which role the client desires to take.
 */
public enum XConnCheckRole {
  CLIENT("client"),
    SERVER("server");

  private String value;

  XConnCheckRole(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static XConnCheckRole fromValue(String text) {
    for (XConnCheckRole b : XConnCheckRole.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}
