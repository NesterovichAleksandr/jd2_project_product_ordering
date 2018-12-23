package by.pvt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * ProductSpecification description could be done with schema use. This information allows to retrieve schema type and location.
 */
@ApiModel(description = "ProductSpecification description could be done with schema use. This information allows to retrieve schema type and location.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class ProductSpecificationSchemaRef   {
  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public ProductSpecificationSchemaRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of resource. Here it will be a product specification.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Indicates the type of resource. Here it will be a product specification.")
  @NotNull


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ProductSpecificationSchemaRef schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * URL to get to the schema description file.
   * @return schemaLocation
  **/
  @ApiModelProperty(required = true, value = "URL to get to the schema description file.")
  @NotNull


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
    ProductSpecificationSchemaRef productSpecificationSchemaRef = (ProductSpecificationSchemaRef) o;
    return Objects.equals(this.type, productSpecificationSchemaRef.type) &&
        Objects.equals(this.schemaLocation, productSpecificationSchemaRef.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductSpecificationSchemaRef {\n");
    
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

