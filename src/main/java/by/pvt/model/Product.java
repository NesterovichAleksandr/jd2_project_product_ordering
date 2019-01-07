package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted.
 */
@ApiModel(description = "Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class Product {

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

    @JsonProperty("place")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<Place> place = null;

    @JsonProperty("characteristic")
    @Valid
    @ElementCollection
    private List<ProductCharacteristic> characteristic = null;

    @JsonProperty("relatedParty")
    @Valid
    @OneToMany(cascade = CascadeType.ALL)
    @LazyCollection(LazyCollectionOption.FALSE)
    private List<RelatedPartyRef> relatedParty = null;

    @JsonProperty("productRelationship")
    @Valid
    @ElementCollection
    private List<ProductRelationship> productRelationship = null;

    @JsonProperty("productSpecification")
    @OneToOne(cascade = CascadeType.ALL)
    private ProductSpecificationRef productSpecification = null;

    public Product id(String id) {
        this.id = id;
        return this;
    }

    /**
     * @return id
     **/
    @ApiModelProperty(value = "")


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Product href(String href) {
        this.href = href;
        return this;
    }

    /**
     * @return href
     **/
    @ApiModelProperty(value = "")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    /**
     * @return name
     **/
    @ApiModelProperty(value = "")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Product place(List<Place> place) {
        this.place = place;
        return this;
    }

    public Product addPlaceItem(Place placeItem) {
        if (this.place == null) {
            this.place = new ArrayList<Place>();
        }
        this.place.add(placeItem);
        return this;
    }

    /**
     * @return place
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<Place> getPlace() {
        return place;
    }

    public void setPlace(List<Place> place) {
        this.place = place;
    }

    public Product characteristic(List<ProductCharacteristic> characteristic) {
        this.characteristic = characteristic;
        return this;
    }

    public Product addCharacteristicItem(ProductCharacteristic characteristicItem) {
        if (this.characteristic == null) {
            this.characteristic = new ArrayList<ProductCharacteristic>();
        }
        this.characteristic.add(characteristicItem);
        return this;
    }

    /**
     * @return characteristic
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductCharacteristic> getCharacteristic() {
        return characteristic;
    }

    public void setCharacteristic(List<ProductCharacteristic> characteristic) {
        this.characteristic = characteristic;
    }

    public Product relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public Product addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
        if (this.relatedParty == null) {
            this.relatedParty = new ArrayList<RelatedPartyRef>();
        }
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * @return relatedParty
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<RelatedPartyRef> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
    }

    public Product productRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
        return this;
    }

    public Product addProductRelationshipItem(ProductRelationship productRelationshipItem) {
        if (this.productRelationship == null) {
            this.productRelationship = new ArrayList<ProductRelationship>();
        }
        this.productRelationship.add(productRelationshipItem);
        return this;
    }

    /**
     * @return productRelationship
     **/
    @ApiModelProperty(value = "")

    @Valid

    public List<ProductRelationship> getProductRelationship() {
        return productRelationship;
    }

    public void setProductRelationship(List<ProductRelationship> productRelationship) {
        this.productRelationship = productRelationship;
    }

    public Product productSpecification(ProductSpecificationRef productSpecification) {
        this.productSpecification = productSpecification;
        return this;
    }

    /**
     * @return productSpecification
     **/
    @ApiModelProperty(value = "")

    @Valid

    public ProductSpecificationRef getProductSpecification() {
        return productSpecification;
    }

    public void setProductSpecification(ProductSpecificationRef productSpecification) {
        this.productSpecification = productSpecification;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Product product = (Product) o;
        return Objects.equals(this.id, product.id) &&
                Objects.equals(this.href, product.href) &&
                Objects.equals(this.name, product.name) &&
                Objects.equals(this.place, product.place) &&
                Objects.equals(this.characteristic, product.characteristic) &&
                Objects.equals(this.relatedParty, product.relatedParty) &&
                Objects.equals(this.productRelationship, product.productRelationship) &&
                Objects.equals(this.productSpecification, product.productSpecification);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, name, place, characteristic, relatedParty, productRelationship, productSpecification);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Product {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    place: ").append(toIndentedString(place)).append("\n");
        sb.append("    characteristic: ").append(toIndentedString(characteristic)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    productRelationship: ").append(toIndentedString(productRelationship)).append("\n");
        sb.append("    productSpecification: ").append(toIndentedString(productSpecification)).append("\n");
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

