package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;

/**
 * Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.
 */
@ApiModel(description = "Provides all amounts (tax included, duty free, tax rate), used currency and percentage to apply for Price Alteration.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class Price extends BasePojo {

    @JsonProperty("taxIncludedAmount")
    @Transient
    private Money taxIncludedAmount = null;

    @JsonProperty("dutyFreeAmount")
    @Transient
    private Money dutyFreeAmount = null;

    @JsonProperty("taxRate")
    @Column
    private Float taxRate = null;

    @JsonProperty("percentage")
    @Column
    private Float percentage = null;

    @JsonProperty("@type")
    @Column
    private String type = null;

    @JsonProperty("@schemaLocation")
    @Column
    private String schemaLocation = null;

    public Price taxIncludedAmount(Money taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
        return this;
    }

    /**
     * All taxes included amount (expressed in the given currency).
     *
     * @return taxIncludedAmount
     **/
    @ApiModelProperty(value = "All taxes included amount (expressed in the given currency).")

    @Valid

    public Money getTaxIncludedAmount() {
        return taxIncludedAmount;
    }

    public void setTaxIncludedAmount(Money taxIncludedAmount) {
        this.taxIncludedAmount = taxIncludedAmount;
    }

    public Price dutyFreeAmount(Money dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
        return this;
    }

    /**
     * All taxes excluded amount (expressed in the given currency).
     *
     * @return dutyFreeAmount
     **/
    @ApiModelProperty(value = "All taxes excluded amount (expressed in the given currency).")

    @Valid

    public Money getDutyFreeAmount() {
        return dutyFreeAmount;
    }

    public void setDutyFreeAmount(Money dutyFreeAmount) {
        this.dutyFreeAmount = dutyFreeAmount;
    }

    public Price taxRate(Float taxRate) {
        this.taxRate = taxRate;
        return this;
    }

    /**
     * Tax rate.
     *
     * @return taxRate
     **/
    @ApiModelProperty(value = "Tax rate.")


    public Float getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(Float taxRate) {
        this.taxRate = taxRate;
    }

    public Price percentage(Float percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Percentage to apply for ProdOfferPriceAlteration.
     *
     * @return percentage
     **/
    @ApiModelProperty(value = "Percentage to apply for ProdOfferPriceAlteration.")


    public Float getPercentage() {
        return percentage;
    }

    public void setPercentage(Float percentage) {
        this.percentage = percentage;
    }

    public Price type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates the (class) type of the price.
     *
     * @return type
     **/
    @ApiModelProperty(value = "Indicates the (class) type of the price.")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Price schemaLocation(String schemaLocation) {
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
        Price price = (Price) o;
        return Objects.equals(this.taxIncludedAmount, price.taxIncludedAmount) &&
                Objects.equals(this.dutyFreeAmount, price.dutyFreeAmount) &&
                Objects.equals(this.taxRate, price.taxRate) &&
                Objects.equals(this.percentage, price.percentage) &&
                Objects.equals(this.type, price.type) &&
                Objects.equals(this.schemaLocation, price.schemaLocation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(taxIncludedAmount, dutyFreeAmount, taxRate, percentage, type, schemaLocation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Price {\n");

        sb.append("    taxIncludedAmount: ").append(toIndentedString(taxIncludedAmount)).append("\n");
        sb.append("    dutyFreeAmount: ").append(toIndentedString(dutyFreeAmount)).append("\n");
        sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
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

