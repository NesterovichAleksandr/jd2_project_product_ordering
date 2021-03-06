package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * Place defines the places where the products are sold or delivered.
 */
@ApiModel(description = "Place defines the places where the products are sold or delivered.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class Place {

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("role")
    @Column
    private String role = null;

    @JsonProperty("@type")
    @Column
    private String type = null;

    @JsonProperty("@schemaLocation")
    @Column
    private String schemaLocation = null;

    public Place id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the place
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of the place")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Place href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Unique reference of the place
     *
     * @return href
     **/
    @ApiModelProperty(value = "Unique reference of the place")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Place name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A user-friendly name for the place, such as \"Paris Store\", \"London Store\", \"Main Home\".
     *
     * @return name
     **/
    @ApiModelProperty(value = "A user-friendly name for the place, such as \"Paris Store\", \"London Store\", \"Main Home\".")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Place role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Role of the place
     *
     * @return role
     **/
    @ApiModelProperty(required = true, value = "Role of the place")
    @NotNull


    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Place type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type of Place.
     *
     * @return type
     **/
    @ApiModelProperty(value = "Type of Place.")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Place schemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * Link to the schema describing this REST resource.
     *
     * @return schemaLocation
     **/
    @ApiModelProperty(value = "Link to the schema describing this REST resource.")


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
        Place place = (Place) o;
        return Objects.equals(this.id, place.id) &&
                Objects.equals(this.href, place.href) &&
                Objects.equals(this.name, place.name) &&
                Objects.equals(this.role, place.role) &&
                Objects.equals(this.type, place.type) &&
                Objects.equals(this.schemaLocation, place.schemaLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, name, role, type, schemaLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Place {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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

