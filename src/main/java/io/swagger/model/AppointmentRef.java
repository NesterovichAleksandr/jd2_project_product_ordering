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
 * If the product order item requires an appointment between the service provider and the customer.
 */
@ApiModel(description = "If the product order item requires an appointment between the service provider and the customer.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class AppointmentRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("@type")
  private String type = null;

  public AppointmentRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * id of the appointment
   * @return id
  **/
  @ApiModelProperty(required = true, value = "id of the appointment")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AppointmentRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Hyperlink to access the appointment
   * @return href
  **/
  @ApiModelProperty(required = true, value = "Hyperlink to access the appointment")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public AppointmentRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the (class) type of resource.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the (class) type of resource.")


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
    AppointmentRef appointmentRef = (AppointmentRef) o;
    return Objects.equals(this.id, appointmentRef.id) &&
        Objects.equals(this.href, appointmentRef.href) &&
        Objects.equals(this.type, appointmentRef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppointmentRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
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

