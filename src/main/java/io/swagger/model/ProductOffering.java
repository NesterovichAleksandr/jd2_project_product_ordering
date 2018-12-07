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
 * A product offering represents entities that are order-able from the provider of the catalog, this resource includes pricing information.
 */
@ApiModel(description = "A product offering represents entities that are order-able from the provider of the catalog, this resource includes pricing information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class ProductOffering   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@type")
  private String type = null;

  public ProductOffering id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the product offering.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the product offering.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductOffering href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the product offering.
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Reference of the product offering.")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductOffering name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product offering.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the product offering.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductOffering type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicate the class (type) of product offering.
   * @return type
  **/
  @ApiModelProperty(value = "Indicate the class (type) of product offering.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductOffering productOffering = (ProductOffering) o;
    return Objects.equals(this.id, productOffering.id) &&
        Objects.equals(this.href, productOffering.href) &&
        Objects.equals(this.name, productOffering.name) &&
        Objects.equals(this.type, productOffering.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductOffering {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

