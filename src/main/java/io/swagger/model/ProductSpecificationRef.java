package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ProductSpecificationSchemaRef;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.
 */
@ApiModel(description = "A ProductSpecification is a detailed description of a tangible or intangible object made available externally in the form of a ProductOffering to customers or other parties playing a party role.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class ProductSpecificationRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("version")
  private String version = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("describing")
  private ProductSpecificationSchemaRef describing = null;

  public ProductSpecificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the product specification.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of the product specification.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ProductSpecificationRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Reference of the product specification.
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Reference of the product specification.")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public ProductSpecificationRef version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Version of the product specification.
   * @return version
  **/
  @ApiModelProperty(value = "Version of the product specification.")


  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public ProductSpecificationRef name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the product specification.
   * @return name
  **/
  @ApiModelProperty(value = "Name of the product specification.")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ProductSpecificationRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of resource (here product specification).
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of resource (here product specification).")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductSpecificationRef describing(ProductSpecificationSchemaRef describing) {
    this.describing = describing;
    return this;
  }

  /**
   * ProductSpecification description could be done with schema use. This information allows to retrieve schema type and location.
   * @return describing
  **/
  @ApiModelProperty(value = "ProductSpecification description could be done with schema use. This information allows to retrieve schema type and location.")

  @Valid

  public ProductSpecificationSchemaRef getDescribing() {
    return describing;
  }

  public void setDescribing(ProductSpecificationSchemaRef describing) {
    this.describing = describing;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductSpecificationRef productSpecificationRef = (ProductSpecificationRef) o;
    return Objects.equals(this.id, productSpecificationRef.id) &&
        Objects.equals(this.href, productSpecificationRef.href) &&
        Objects.equals(this.version, productSpecificationRef.version) &&
        Objects.equals(this.name, productSpecificationRef.name) &&
        Objects.equals(this.type, productSpecificationRef.type) &&
        Objects.equals(this.describing, productSpecificationRef.describing);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, version, name, type, describing);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    describing: ").append(toIndentedString(describing)).append("\n");
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

