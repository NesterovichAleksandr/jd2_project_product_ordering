package by.pvt.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum PriceType {
  
  RECURING("recuring"),
  
  ONETIME("oneTime"),
  
  USAGE("usage");

  private String value;

  PriceType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static PriceType fromValue(String text) {
    for (PriceType b : PriceType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

