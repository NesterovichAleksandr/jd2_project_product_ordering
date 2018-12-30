package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * Description of a productTerm linked to this orderItem. This represent a commitment with a duration. Duration or name must be provided.
 */
@ApiModel(description = "Description of a productTerm linked to this orderItem. This represent a commitment with a duration. Duration or name must be provided.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class OrderTerm {
    @JsonProperty("name")
    private String name = null;

    @JsonProperty("description")
    private String description = null;

    @JsonProperty("duration")
    private Quantity duration = null;

    @JsonProperty("@type")
    private String type = null;

    public OrderTerm name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the productOrderTerm.
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of the productOrderTerm.")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrderTerm description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the productOrderTerm.
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description of the productOrderTerm.")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public OrderTerm duration(Quantity duration) {
        this.duration = duration;
        return this;
    }

    /**
     * Duration of the productOrderTerm.
     *
     * @return duration
     **/
    @ApiModelProperty(value = "Duration of the productOrderTerm.")

    @Valid

    public Quantity getDuration() {
        return duration;
    }

    public void setDuration(Quantity duration) {
        this.duration = duration;
    }

    public OrderTerm type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicated the type of Term.
     *
     * @return type
     **/
    @ApiModelProperty(value = "Indicated the type of Term.")


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
        OrderTerm orderTerm = (OrderTerm) o;
        return Objects.equals(this.name, orderTerm.name) &&
                Objects.equals(this.description, orderTerm.description) &&
                Objects.equals(this.duration, orderTerm.duration) &&
                Objects.equals(this.type, orderTerm.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, duration, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderTerm {\n");

        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
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

