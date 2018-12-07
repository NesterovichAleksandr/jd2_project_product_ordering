package io.swagger.model;

import java.util.Objects;
import io.swagger.annotations.ApiModel;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum StateType {
  
  ACKNOWLEDGED("acknowledged"),
  
  INPROGRESS("inProgress"),
  
  CANCELLED("cancelled"),
  
  COMPLETED("completed"),
  
  REJECTED("rejected"),
  
  PENDING("pending"),
  
  HELD("held"),
  
  FAILED("failed"),
  
  PARTIAL("partial");

  private String value;

  StateType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static StateType fromValue(String text) {
    for (StateType b : StateType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

