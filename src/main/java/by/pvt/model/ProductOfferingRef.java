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

/**
 * A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.
 */
@ApiModel(description = "A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class ProductOfferingRef {

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

    @JsonProperty("@type")
    @Column
    private String type = null;

    public ProductOfferingRef id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the product offering.
     *
     * @return id
     **/
    @ApiModelProperty(value = "Unique identifier of the product offering.")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductOfferingRef href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Reference of the product offering.
     *
     * @return href
     **/
    @ApiModelProperty(value = "Reference of the product offering.")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductOfferingRef name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the product offering.
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of the product offering.")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProductOfferingRef type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicate the class (type) of product offering.
     *
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
        ProductOfferingRef productOfferingRef = (ProductOfferingRef) o;
        return Objects.equals(this.id, productOfferingRef.id) &&
                Objects.equals(this.href, productOfferingRef.href) &&
                Objects.equals(this.name, productOfferingRef.name) &&
                Objects.equals(this.type, productOfferingRef.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOfferingRef {\n");

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

