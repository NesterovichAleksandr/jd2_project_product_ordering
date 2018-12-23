package by.pvt.model;

import com.fasterxml.jackson.annotation.JsonValue;

import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * 
 */
public enum RelationShipType {
  
  RELIESON("reliesOn"),
  
  BRINGS("brings"),
  
  HASPARENT("hasParent"),
  
  HASCHILD("hasChild");

  private String value;

  RelationShipType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static RelationShipType fromValue(String text) {
    for (RelationShipType b : RelationShipType.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }
}

