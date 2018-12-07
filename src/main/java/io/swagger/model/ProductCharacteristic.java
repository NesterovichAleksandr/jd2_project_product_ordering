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
 * Characteristics of the product to instantiate or to modify.
 */
@ApiModel(description = "Characteristics of the product to instantiate or to modify.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class ProductCharacteristic   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public ProductCharacteristic name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the characteristic.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the characteristic.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductCharacteristic value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Value of the characteristic.
   * @return value
  **/
  @ApiModelProperty(required = true, value = "Value of the characteristic.")
  @NotNull


  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ProductCharacteristic type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of resource
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of resource")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductCharacteristic schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * This field provided a link to the schema describing this REST resource.
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "This field provided a link to the schema describing this REST resource.")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductCharacteristic productCharacteristic = (ProductCharacteristic) o;
    return Objects.equals(this.name, productCharacteristic.name) &&
        Objects.equals(this.value, productCharacteristic.value) &&
        Objects.equals(this.type, productCharacteristic.type) &&
        Objects.equals(this.schemaLocation, productCharacteristic.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, value, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductCharacteristic {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
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

