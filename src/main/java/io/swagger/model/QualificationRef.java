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
 * It could be a serviceQualification or a productOfferingQualification that has been executed previously and captured in the productOrder to provide &#39;eligibility&#39; information.
 */
@ApiModel(description = "It could be a serviceQualification or a productOfferingQualification that has been executed previously and captured in the productOrder to provide 'eligibility' information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class QualificationRef   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("qualificationItemId")
  private String qualificationItemId = null;

  @JsonProperty("@type")
  private String type = null;

  public QualificationRef id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of a pre-existing qualification.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of a pre-existing qualification.")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public QualificationRef href(String href) {
    this.href = href;
    return this;
  }

  /**
   * href of the qualification.
   * @return href
  **/
  @ApiModelProperty(required = true, value = "href of the qualification.")
  @NotNull


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public QualificationRef qualificationItemId(String qualificationItemId) {
    this.qualificationItemId = qualificationItemId;
    return this;
  }

  /**
   * Id of an item of a qualification.
   * @return qualificationItemId
  **/
  @ApiModelProperty(value = "Id of an item of a qualification.")


  public String getQualificationItemId() {
    return qualificationItemId;
  }

  public void setQualificationItemId(String qualificationItemId) {
    this.qualificationItemId = qualificationItemId;
  }

  public QualificationRef type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of resource. Here it can be a type of qualification. (could a service qualification or a product offering qualification).
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of resource. Here it can be a type of qualification. (could a service qualification or a product offering qualification).")


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
    QualificationRef qualificationRef = (QualificationRef) o;
    return Objects.equals(this.id, qualificationRef.id) &&
        Objects.equals(this.href, qualificationRef.href) &&
        Objects.equals(this.qualificationItemId, qualificationRef.qualificationItemId) &&
        Objects.equals(this.type, qualificationRef.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, qualificationItemId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualificationRef {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    qualificationItemId: ").append(toIndentedString(qualificationItemId)).append("\n");
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

