package by.pvt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Is an amount, usually of money, that modifies the price charged for an order item.
 */
@ApiModel(description = "Is an amount, usually of money, that modifies the price charged for an order item.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class PriceAlteration   {
  @JsonProperty("name")
  private String name = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("priceType")
  private PriceType priceType = null;

  @JsonProperty("unitOfMeasure")
  private String unitOfMeasure = null;

  @JsonProperty("recurringChargePeriod")
  private String recurringChargePeriod = null;

  @JsonProperty("applicationDuration")
  private String applicationDuration = null;

  @JsonProperty("priority")
  private Integer priority = null;

  @JsonProperty("price")
  private Price price = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  public PriceAlteration name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 
   * @return name
  **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PriceAlteration description(String description) {
    this.description = description;
    return this;
  }

  /**
   * 
   * @return description
  **/
  @ApiModelProperty(value = "")


  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PriceAlteration priceType(PriceType priceType) {
    this.priceType = priceType;
    return this;
  }

  /**
   * 
   * @return priceType
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public PriceType getPriceType() {
    return priceType;
  }

  public void setPriceType(PriceType priceType) {
    this.priceType = priceType;
  }

  public PriceAlteration unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  /**
   * 
   * @return unitOfMeasure
  **/
  @ApiModelProperty(value = "")


  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public PriceAlteration recurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
    return this;
  }

  /**
   * 
   * @return recurringChargePeriod
  **/
  @ApiModelProperty(value = "")


  public String getRecurringChargePeriod() {
    return recurringChargePeriod;
  }

  public void setRecurringChargePeriod(String recurringChargePeriod) {
    this.recurringChargePeriod = recurringChargePeriod;
  }

  public PriceAlteration applicationDuration(String applicationDuration) {
    this.applicationDuration = applicationDuration;
    return this;
  }

  /**
   * 
   * @return applicationDuration
  **/
  @ApiModelProperty(value = "")


  public String getApplicationDuration() {
    return applicationDuration;
  }

  public void setApplicationDuration(String applicationDuration) {
    this.applicationDuration = applicationDuration;
  }

  public PriceAlteration priority(Integer priority) {
    this.priority = priority;
    return this;
  }

  /**
   * 
   * @return priority
  **/
  @ApiModelProperty(value = "")


  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  public PriceAlteration price(Price price) {
    this.price = price;
    return this;
  }

  /**
   * 
   * @return price
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Price getPrice() {
    return price;
  }

  public void setPrice(Price price) {
    this.price = price;
  }

  public PriceAlteration type(String type) {
    this.type = type;
    return this;
  }

  /**
   * 
   * @return type
  **/
  @ApiModelProperty(value = "")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PriceAlteration schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * 
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "")


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
    PriceAlteration priceAlteration = (PriceAlteration) o;
    return Objects.equals(this.name, priceAlteration.name) &&
        Objects.equals(this.description, priceAlteration.description) &&
        Objects.equals(this.priceType, priceAlteration.priceType) &&
        Objects.equals(this.unitOfMeasure, priceAlteration.unitOfMeasure) &&
        Objects.equals(this.recurringChargePeriod, priceAlteration.recurringChargePeriod) &&
        Objects.equals(this.applicationDuration, priceAlteration.applicationDuration) &&
        Objects.equals(this.priority, priceAlteration.priority) &&
        Objects.equals(this.price, priceAlteration.price) &&
        Objects.equals(this.type, priceAlteration.type) &&
        Objects.equals(this.schemaLocation, priceAlteration.schemaLocation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, priceType, unitOfMeasure, recurringChargePeriod, applicationDuration, priority, price, type, schemaLocation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PriceAlteration {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
    sb.append("    applicationDuration: ").append(toIndentedString(applicationDuration)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

