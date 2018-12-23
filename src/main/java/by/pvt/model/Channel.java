package by.pvt.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 * The channel defines the channel for selling product offerings where order has been submitted.
 */
@ApiModel(description = "The channel defines the channel for selling product offerings where order has been submitted.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class Channel   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("role")
  private String role = null;

  @JsonProperty("@type")
  private String type = null;

  public Channel id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of  the channel
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Unique identifier of  the channel")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Channel href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Unique reference of the channel
   * @return href
  **/
  @ApiModelProperty(value = "Unique reference of the channel")


  public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public Channel name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the channel
   * @return name
  **/
  @ApiModelProperty(value = "Name of the channel")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Channel role(String role) {
    this.role = role;
    return this;
  }

  /**
   * Role of the channel - could be 'initChannel', 'submitChannel' for example.
   * @return role
  **/
  @ApiModelProperty(value = "Role of the channel - could be 'initChannel', 'submitChannel' for example.")


  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public Channel type(String type) {
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
    Channel channel = (Channel) o;
    return Objects.equals(this.id, channel.id) &&
        Objects.equals(this.href, channel.href) &&
        Objects.equals(this.name, channel.name) &&
        Objects.equals(this.role, channel.role) &&
        Objects.equals(this.type, channel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, name, role, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Channel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

