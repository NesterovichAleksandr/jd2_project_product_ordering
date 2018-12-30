package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class ProductRelationship {
    @JsonProperty("type")
    private RelationShipType type = null;

    @JsonProperty("product")
    private Product product = null;

    public ProductRelationship type(RelationShipType type) {
        this.type = type;
        return this;
    }

    /**
     * @return type
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public RelationShipType getType() {
        return type;
    }

    public void setType(RelationShipType type) {
        this.type = type;
    }

    public ProductRelationship product(Product product) {
        this.product = product;
        return this;
    }

    /**
     * @return product
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull

    @Valid

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductRelationship productRelationship = (ProductRelationship) o;
        return Objects.equals(this.type, productRelationship.type) &&
                Objects.equals(this.product, productRelationship.product);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, product);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductRelationship {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
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

