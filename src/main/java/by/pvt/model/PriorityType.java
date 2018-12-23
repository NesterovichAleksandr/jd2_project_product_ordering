package by.pvt.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum PriorityType {
  
  _0("0"),
  
  _1("1"),
  
  _2("2"),
  
  _3("3"),
  
  _4("4");

  private String value;

  PriorityType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriorityType fromValue(String text) {
    for (PriorityType b : PriorityType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

