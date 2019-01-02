package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An amount, usually of money, that represents the actual price paid by the Customer for this item or this order.
 */
@ApiModel(description = "An amount, usually of money, that represents the actual price paid by the Customer for this item or this order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class OrderPrice extends BasePojo {

    @JsonProperty("name")
    @Column
    private String name = null;

    @JsonProperty("description")
    @Column
    private String description = null;

    @JsonProperty("priceType")
    @Column
    @Enumerated
    private PriceType priceType = null;

    @JsonProperty("unitOfMeasure")
    @Column
    private String unitOfMeasure = null;

    @JsonProperty("recurringChargePeriod")
    @Column
    private String recurringChargePeriod = null;

    @JsonProperty("@type")
    @Column
    private String type = null;

    @JsonProperty("@schemaLocation")
    @Column
    private String schemaLocation = null;

    @JsonProperty("price")
    @OneToOne
    private Price price = null;

    @JsonProperty("priceAlteration")
    @Valid
    @ElementCollection
    private List<PriceAlteration> priceAlteration = null;

    @JsonProperty("billingAccount")
    @OneToOne
    private BillingAccountRef billingAccount = null;

    public OrderPrice name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A short descriptive name such as \"Subscription price\".
     *
     * @return name
     **/
    @ApiModelProperty(value = "A short descriptive name such as \"Subscription price\".")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderPrice description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A narrative that explains in detail the semantics of this order item price
     *
     * @return description
     **/
    @ApiModelProperty(value = "A narrative that explains in detail the semantics of this order item price")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderPrice priceType(PriceType priceType) {
        this.priceType = priceType;
        return this;
    }

    /**
     * A category that describes the price, such as recurring, discount, allowance, penalty and so forth
     *
     * @return priceType
     **/
    @ApiModelProperty(required = true, value = "A category that describes the price, such as recurring, discount, allowance, penalty and so forth")
    @NotNull

    @Valid

    public PriceType getPriceType() {
        return priceType;
    }

    public void setPriceType(PriceType priceType) {
        this.priceType = priceType;
    }

    public OrderPrice unitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
        return this;
    }

    /**
     * Could be minutes, gigaBytes,...
     *
     * @return unitOfMeasure
     **/
    @ApiModelProperty(value = "Could be minutes, gigaBytes,...")


    public String getUnitOfMeasure() {
        return unitOfMeasure;
    }

    public void setUnitOfMeasure(String unitOfMeasure) {
        this.unitOfMeasure = unitOfMeasure;
    }

    public OrderPrice recurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
        return this;
    }

    /**
     * Could be month, week,...
     *
     * @return recurringChargePeriod
     **/
    @ApiModelProperty(value = "Could be month, week,...")


    public String getRecurringChargePeriod() {
        return recurringChargePeriod;
    }

    public void setRecurringChargePeriod(String recurringChargePeriod) {
        this.recurringChargePeriod = recurringChargePeriod;
    }

    public OrderPrice type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicate the type of orderPrice.
     *
     * @return type
     **/
    @ApiModelProperty(value = "Indicate the type of orderPrice.")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public OrderPrice schemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * A link to the schema describing this orderPrice extension.
     *
     * @return schemaLocation
     **/
    @ApiModelProperty(value = "A link to the schema describing this orderPrice extension.")


    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public OrderPrice price(Price price) {
        this.price = price;
        return this;
    }

    /**
     * Provides all amounts (tax included, tax excluded and tax rate), used currency code and percentage to apply for the price
     *
     * @return price
     **/
    @ApiModelProperty(required = true, value = "Provides all amounts (tax included, tax excluded and tax rate), used currency code and percentage to apply for the price")
    @NotNull

    @Valid

    public Price getPrice() {
        return price;
    }

    public void setPrice(Price price) {
        this.price = price;
    }

    public OrderPrice priceAlteration(List<PriceAlteration> priceAlteration) {
        this.priceAlteration = priceAlteration;
        return this;
    }

    public OrderPrice addPriceAlterationItem(PriceAlteration priceAlterationItem) {
        if (this.priceAlteration == null) {
            this.priceAlteration = new ArrayList<PriceAlteration>();
        }
        this.priceAlteration.add(priceAlterationItem);
        return this;
    }

    /**
     * An amount, usually of money, that modifies the price charged for this order item
     *
     * @return priceAlteration
     **/
    @ApiModelProperty(value = "An amount, usually of money, that modifies the price charged for this order item")

    @Valid

    public List<PriceAlteration> getPriceAlteration() {
        return priceAlteration;
    }

    public void setPriceAlteration(List<PriceAlteration> priceAlteration) {
        this.priceAlteration = priceAlteration;
    }

    public OrderPrice billingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
        return this;
    }

    /**
     * @return billingAccount
     **/
    @ApiModelProperty(value = "")

    @Valid

    public BillingAccountRef getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrderPrice orderPrice = (OrderPrice) o;
        return Objects.equals(this.name, orderPrice.name) &&
                Objects.equals(this.description, orderPrice.description) &&
                Objects.equals(this.priceType, orderPrice.priceType) &&
                Objects.equals(this.unitOfMeasure, orderPrice.unitOfMeasure) &&
                Objects.equals(this.recurringChargePeriod, orderPrice.recurringChargePeriod) &&
                Objects.equals(this.type, orderPrice.type) &&
                Objects.equals(this.schemaLocation, orderPrice.schemaLocation) &&
                Objects.equals(this.price, orderPrice.price) &&
                Objects.equals(this.priceAlteration, orderPrice.priceAlteration) &&
                Objects.equals(this.billingAccount, orderPrice.billingAccount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, priceType, unitOfMeasure, recurringChargePeriod, type, schemaLocation, price, priceAlteration, billingAccount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderPrice {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priceType: ").append(toIndentedString(priceType)).append("\n");
        sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
        sb.append("    recurringChargePeriod: ").append(toIndentedString(recurringChargePeriod)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    price: ").append(toIndentedString(price)).append("\n");
        sb.append("    priceAlteration: ").append(toIndentedString(priceAlteration)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
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

