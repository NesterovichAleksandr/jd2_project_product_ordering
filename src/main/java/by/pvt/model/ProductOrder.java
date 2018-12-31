package by.pvt.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.GenericGenerator;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 *
 */
@ApiModel(description = "")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")
@Entity
public class ProductOrder {

    @JsonProperty("id")
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID", strategy = "org.hibernate.id.UUIDGenerator")
    private String id = null;

    @JsonProperty("href")
    @Column
    private String href = null;

    @JsonProperty("externalId")
    @Column
    private String externalId = null;

    @JsonProperty("priority")
    @Column
    private PriorityType priority = null;

    @JsonProperty("description")
    @Column
    private String description = null;

    @JsonProperty("category")
    @Column
    private String category = null;

    @JsonProperty("state")
    @Column
    private StateType state = null;

    @JsonProperty("orderDate")
    @Column
    private OffsetDateTime orderDate = null;

    @JsonProperty("completionDate")
    @Column
    private OffsetDateTime completionDate = null;

    @JsonProperty("requestedStartDate")
    @Column
    private OffsetDateTime requestedStartDate = null;

    @JsonProperty("requestedCompletionDate")
    @Column
    private OffsetDateTime requestedCompletionDate = null;

    @JsonProperty("expectedCompletionDate")
    @Column
    private OffsetDateTime expectedCompletionDate = null;

    @JsonProperty("notificationContact")
    @Column
    private String notificationContact = null;

    @JsonProperty("@baseType")
    @Column
    private String baseType = null;

    @JsonProperty("@type")
    @Column
    private String type = null;

    @JsonProperty("@schemaLocation")
    @Column
    private String schemaLocation = null;

    @JsonProperty("Channel")
    @OneToOne
    private Channel channel = null;

    @JsonProperty("note")
    @Embedded
    private Note note = null;

    @JsonProperty("relatedParty")
    @Valid
    @OneToMany
    //@LazyCollection(LazyCollectionOption.FALSE)
    private List<RelatedPartyRef> relatedParty = null;

    @JsonProperty("payment")
    @Valid
    @OneToMany
    private List<PaymentRef> payment = null;

    @JsonProperty("billingAccount")
    @OneToOne
    private BillingAccountRef billingAccount = null;

    @JsonProperty("orderTotalPrice")
    @Valid
    @Transient
    //@ElementCollection
    //@LazyCollection(LazyCollectionOption.FALSE)
    private List<OrderPrice> orderTotalPrice = null;

    @JsonProperty("orderItem")
    @Valid
    @OneToMany
    private List<OrderItem> orderItem = new ArrayList<OrderItem>();

    public ProductOrder id(String id) {
        this.id = id;
        return this;
    }

    /**
     * ID created on repository side (OM system)
     *
     * @return id
     **/
    @ApiModelProperty(required = true, value = "ID created on repository side (OM system)")
    @NotNull


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductOrder href(String href) {
        this.href = href;
        return this;
    }

    /**
     * Hyperlink to access the order
     *
     * @return href
     **/
    @ApiModelProperty(value = "Hyperlink to access the order")


    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    public ProductOrder externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * ID given by the consumer and only understandable by him (to facilitate his searches afterwards).
     *
     * @return externalId
     **/
    @ApiModelProperty(value = "ID given by the consumer and only understandable by him (to facilitate his searches afterwards).")


    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ProductOrder priority(PriorityType priority) {
        this.priority = priority;
        return this;
    }

    /**
     * A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)
     *
     * @return priority
     **/
    @ApiModelProperty(value = "A way that can be used by consumers to prioritize orders in OM system (from 0 to 4 : 0 is the highest priority, and 4 the lowest)")

    @Valid

    public PriorityType getPriority() {
        return priority;
    }

    public void setPriority(PriorityType priority) {
        this.priority = priority;
    }

    public ProductOrder description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description of the product order
     *
     * @return description
     **/
    @ApiModelProperty(value = "Description of the product order")


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductOrder category(String category) {
        this.category = category;
        return this;
    }

    /**
     * Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...).
     *
     * @return category
     **/
    @ApiModelProperty(value = "Used to categorize the order from a business perspective that can be useful for the OM system (e.g. \"enterprise\", \"residential\", ...).")


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ProductOrder state(StateType state) {
        this.state = state;
        return this;
    }

    /**
     * Tracks the lifecycle status of the product order, such as Acknowledged, Rejected, InProgress, Pending and so on
     *
     * @return state
     **/
    @ApiModelProperty(value = "Tracks the lifecycle status of the product order, such as Acknowledged, Rejected, InProgress, Pending and so on")

    @Valid

    public StateType getState() {
        return state;
    }

    public void setState(StateType state) {
        this.state = state;
    }

    public ProductOrder orderDate(OffsetDateTime orderDate) {
        this.orderDate = orderDate;
        return this;
    }

    /**
     * Date when the order was created
     *
     * @return orderDate
     **/
    @ApiModelProperty(value = "Date when the order was created")

    @Valid

    public OffsetDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(OffsetDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public ProductOrder completionDate(OffsetDateTime completionDate) {
        this.completionDate = completionDate;
        return this;
    }

    /**
     * Date when the order was completed.
     *
     * @return completionDate
     **/
    @ApiModelProperty(value = "Date when the order was completed.")

    @Valid

    public OffsetDateTime getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(OffsetDateTime completionDate) {
        this.completionDate = completionDate;
    }

    public ProductOrder requestedStartDate(OffsetDateTime requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
        return this;
    }

    /**
     * Order start date wished by the requestor
     *
     * @return requestedStartDate
     **/
    @ApiModelProperty(value = "Order start date wished by the requestor")

    @Valid

    public OffsetDateTime getRequestedStartDate() {
        return requestedStartDate;
    }

    public void setRequestedStartDate(OffsetDateTime requestedStartDate) {
        this.requestedStartDate = requestedStartDate;
    }

    public ProductOrder requestedCompletionDate(OffsetDateTime requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
        return this;
    }

    /**
     * Requested delivery date from the requestor perspective
     *
     * @return requestedCompletionDate
     **/
    @ApiModelProperty(value = "Requested delivery date from the requestor perspective")

    @Valid

    public OffsetDateTime getRequestedCompletionDate() {
        return requestedCompletionDate;
    }

    public void setRequestedCompletionDate(OffsetDateTime requestedCompletionDate) {
        this.requestedCompletionDate = requestedCompletionDate;
    }

    public ProductOrder expectedCompletionDate(OffsetDateTime expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
        return this;
    }

    /**
     * Expected delivery date amended by the provider
     *
     * @return expectedCompletionDate
     **/
    @ApiModelProperty(value = "Expected delivery date amended by the provider")

    @Valid

    public OffsetDateTime getExpectedCompletionDate() {
        return expectedCompletionDate;
    }

    public void setExpectedCompletionDate(OffsetDateTime expectedCompletionDate) {
        this.expectedCompletionDate = expectedCompletionDate;
    }

    public ProductOrder notificationContact(String notificationContact) {
        this.notificationContact = notificationContact;
        return this;
    }

    /**
     * Contact attached to the order to send back information regarding this order
     *
     * @return notificationContact
     **/
    @ApiModelProperty(value = "Contact attached to the order to send back information regarding this order")


    public String getNotificationContact() {
        return notificationContact;
    }

    public void setNotificationContact(String notificationContact) {
        this.notificationContact = notificationContact;
    }

    public ProductOrder baseType(String baseType) {
        this.baseType = baseType;
        return this;
    }

    /**
     * Indicates the base type of the resource. Here can be 'ProductOrder'.
     *
     * @return baseType
     **/
    @ApiModelProperty(value = "Indicates the base type of the resource. Here can be 'ProductOrder'.")


    public String getBaseType() {
        return baseType;
    }

    public void setBaseType(String baseType) {
        this.baseType = baseType;
    }

    public ProductOrder type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Indicates the type of resource. Here can be 'ProductOrder'.
     *
     * @return type
     **/
    @ApiModelProperty(value = "Indicates the type of resource. Here can be 'ProductOrder'.")


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProductOrder schemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
        return this;
    }

    /**
     * A link to the schema describing this REST resource.
     *
     * @return schemaLocation
     **/
    @ApiModelProperty(value = "A link to the schema describing this REST resource.")


    public String getSchemaLocation() {
        return schemaLocation;
    }

    public void setSchemaLocation(String schemaLocation) {
        this.schemaLocation = schemaLocation;
    }

    public ProductOrder channel(Channel channel) {
        this.channel = channel;
        return this;
    }

    /**
     * Channel used to create the product order
     *
     * @return channel
     **/
    @ApiModelProperty(value = "Channel used to create the product order")

    @Valid

    public Channel getChannel() {
        return channel;
    }

    public void setChannel(Channel channel) {
        this.channel = channel;
    }

    public ProductOrder note(Note note) {
        this.note = note;
        return this;
    }

    /**
     * Extra information about the product order
     *
     * @return note
     **/
    @ApiModelProperty(value = "Extra information about the product order")

    @Valid

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }

    public ProductOrder relatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
        return this;
    }

    public ProductOrder addRelatedPartyItem(RelatedPartyRef relatedPartyItem) {
        if (this.relatedParty == null) {
            this.relatedParty = new ArrayList<RelatedPartyRef>();
        }
        this.relatedParty.add(relatedPartyItem);
        return this;
    }

    /**
     * RelatedParty reference. A related party defines party or party role linked to a specific entity
     *
     * @return relatedParty
     **/
    @ApiModelProperty(value = "RelatedParty reference. A related party defines party or party role linked to a specific entity")

    @Valid

    public List<RelatedPartyRef> getRelatedParty() {
        return relatedParty;
    }

    public void setRelatedParty(List<RelatedPartyRef> relatedParty) {
        this.relatedParty = relatedParty;
    }

    public ProductOrder payment(List<PaymentRef> payment) {
        this.payment = payment;
        return this;
    }

    public ProductOrder addPaymentItem(PaymentRef paymentItem) {
        if (this.payment == null) {
            this.payment = new ArrayList<PaymentRef>();
        }
        this.payment.add(paymentItem);
        return this;
    }

    /**
     * If an immediate payment has been done at the product order submission, the payment information are captured and stored (as a reference) in the order.
     *
     * @return payment
     **/
    @ApiModelProperty(value = "If an immediate payment has been done at the product order submission, the payment information are captured and stored (as a reference) in the order.")

    @Valid

    public List<PaymentRef> getPayment() {
        return payment;
    }

    public void setPayment(List<PaymentRef> payment) {
        this.payment = payment;
    }

    public ProductOrder billingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
        return this;
    }

    /**
     * A BillingAccount is a detailed description of a bill structure.
     *
     * @return billingAccount
     **/
    @ApiModelProperty(value = "A BillingAccount is a detailed description of a bill structure.")

    @Valid

    public BillingAccountRef getBillingAccount() {
        return billingAccount;
    }

    public void setBillingAccount(BillingAccountRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    public ProductOrder orderTotalPrice(List<OrderPrice> orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
        return this;
    }

    public ProductOrder addOrderTotalPriceItem(OrderPrice orderTotalPriceItem) {
        if (this.orderTotalPrice == null) {
            this.orderTotalPrice = new ArrayList<OrderPrice>();
        }
        this.orderTotalPrice.add(orderTotalPriceItem);
        return this;
    }

    /**
     * An amount, usually of money, that represents the actual price paid by the Customer for this item or this order.
     *
     * @return orderTotalPrice
     **/
    @ApiModelProperty(value = "An amount, usually of money, that represents the actual price paid by the Customer for this item or this order.")

    @Valid

    public List<OrderPrice> getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(List<OrderPrice> orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public ProductOrder orderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
        return this;
    }

    public ProductOrder addOrderItemItem(OrderItem orderItemItem) {
        this.orderItem.add(orderItemItem);
        return this;
    }

    /**
     * An identified part of the order. A product order is decomposed into one or more order item
     *
     * @return orderItem
     **/
    @ApiModelProperty(required = true, value = "An identified part of the order. A product order is decomposed into one or more order item")
    @NotNull

    @Valid

    public List<OrderItem> getOrderItem() {
        return orderItem;
    }

    public void setOrderItem(List<OrderItem> orderItem) {
        this.orderItem = orderItem;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProductOrder productOrder = (ProductOrder) o;
        return Objects.equals(this.id, productOrder.id) &&
                Objects.equals(this.href, productOrder.href) &&
                Objects.equals(this.externalId, productOrder.externalId) &&
                Objects.equals(this.priority, productOrder.priority) &&
                Objects.equals(this.description, productOrder.description) &&
                Objects.equals(this.category, productOrder.category) &&
                Objects.equals(this.state, productOrder.state) &&
                Objects.equals(this.orderDate, productOrder.orderDate) &&
                Objects.equals(this.completionDate, productOrder.completionDate) &&
                Objects.equals(this.requestedStartDate, productOrder.requestedStartDate) &&
                Objects.equals(this.requestedCompletionDate, productOrder.requestedCompletionDate) &&
                Objects.equals(this.expectedCompletionDate, productOrder.expectedCompletionDate) &&
                Objects.equals(this.notificationContact, productOrder.notificationContact) &&
                Objects.equals(this.baseType, productOrder.baseType) &&
                Objects.equals(this.type, productOrder.type) &&
                Objects.equals(this.schemaLocation, productOrder.schemaLocation) &&
                Objects.equals(this.channel, productOrder.channel) &&
                Objects.equals(this.note, productOrder.note) &&
                Objects.equals(this.relatedParty, productOrder.relatedParty) &&
                Objects.equals(this.payment, productOrder.payment) &&
                Objects.equals(this.billingAccount, productOrder.billingAccount) &&
                Objects.equals(this.orderTotalPrice, productOrder.orderTotalPrice) &&
                Objects.equals(this.orderItem, productOrder.orderItem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, href, externalId, priority, description, category, state, orderDate, completionDate, requestedStartDate, requestedCompletionDate, expectedCompletionDate, notificationContact, baseType, type, schemaLocation, channel, note, relatedParty, payment, billingAccount, orderTotalPrice, orderItem);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProductOrder {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    href: ").append(toIndentedString(href)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    orderDate: ").append(toIndentedString(orderDate)).append("\n");
        sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
        sb.append("    requestedStartDate: ").append(toIndentedString(requestedStartDate)).append("\n");
        sb.append("    requestedCompletionDate: ").append(toIndentedString(requestedCompletionDate)).append("\n");
        sb.append("    expectedCompletionDate: ").append(toIndentedString(expectedCompletionDate)).append("\n");
        sb.append("    notificationContact: ").append(toIndentedString(notificationContact)).append("\n");
        sb.append("    baseType: ").append(toIndentedString(baseType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
        sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    relatedParty: ").append(toIndentedString(relatedParty)).append("\n");
        sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
        sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
        sb.append("    orderTotalPrice: ").append(toIndentedString(orderTotalPrice)).append("\n");
        sb.append("    orderItem: ").append(toIndentedString(orderItem)).append("\n");
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

