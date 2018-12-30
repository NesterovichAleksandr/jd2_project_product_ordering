package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.*;

/**
 *
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class Quantity {
    @JsonProperty("value")
    private Float value = null;

    @JsonProperty("unit")
    private String unit = null;

    public Quantity value(Float value) {
        this.value = value;
        return this;
    }

    /**
     * @return value
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Quantity unit(String unit) {
        this.unit = unit;
        return this;
    }

    /**
     * @return unit
     **/
    @ApiModelProperty(required = true, value = "")
    @NotNull


    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Quantity quantity = (Quantity) o;
        return Objects.equals(this.value, quantity.value) &&
                Objects.equals(this.unit, quantity.unit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, unit);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Quantity {\n");

        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
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

