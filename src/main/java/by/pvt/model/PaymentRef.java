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
 * If an immediate payment has been done at the product order submission, the payment information are captured and stored (as a reference) in the order.
 */
@ApiModel(description = "If an immediate payment has been done at the product order submission, the payment information are captured and stored (as a reference) in the order.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class PaymentRef {

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

    public PaymentRef id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Identifier of a payment.
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "Identifier of a payment.")
    @NotNull


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PaymentRef href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Hyperlink to access to a payment.
     *
     * @return href
     **/
    @ApiModelProperty(required = true, value = "Hyperlink to access to a payment.")
    @NotNull


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public PaymentRef name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of a payment.
     *
     * @return name
     **/
    @ApiModelProperty(value = "Name of a payment.")


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentRef type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates the type of resource. Here can be 'cash', 'BankCard', ‘Check’, etc...
     *
     * @return type
     **/
    @ApiModelProperty(value = "Indicates the type of resource. Here can be 'cash', 'BankCard', ‘Check’, etc...")


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
        PaymentRef paymentRef = (PaymentRef) o;
        return Objects.equals(this.id, paymentRef.id) &&
                Objects.equals(this.href, paymentRef.href) &&
                Objects.equals(this.name, paymentRef.name) &&
                Objects.equals(this.type, paymentRef.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, name, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PaymentRef {\n");

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

