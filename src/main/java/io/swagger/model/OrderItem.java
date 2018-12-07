package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ActionType;
import io.swagger.model.AppointmentRef;
import io.swagger.model.BillingAccountRef;
import io.swagger.model.OrderItem;
import io.swagger.model.OrderItemRelationShip;
import io.swagger.model.OrderPrice;
import io.swagger.model.OrderTerm;
import io.swagger.model.PaymentRef;
import io.swagger.model.Product;
import io.swagger.model.ProductOffering;
import io.swagger.model.QualificationRef;
import io.swagger.model.StateType;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * An identified part of the order. A product order is decomposed into one or more order items.
 */
@ApiModel(description = "An identified part of the order. A product order is decomposed into one or more order items.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-12-07T17:53:15.346+03:00")

public class OrderItem   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("action")
  private ActionType action = null;

  @JsonProperty("state")
  private StateType state = null;

  @JsonProperty("quantity")
  private Long quantity = null;

  @JsonProperty("@type")
  private String type = null;

  @JsonProperty("@schemaLocation")
  private String schemaLocation = null;

  @JsonProperty("appointment")
  private AppointmentRef appointment = null;

  @JsonProperty("billingAccount")
  private BillingAccountRef billingAccount = null;

  @JsonProperty("itemPrice")
  @Valid
  private List<OrderPrice> itemPrice = null;

  @JsonProperty("itemTotalPrice")
  @Valid
  private List<OrderPrice> itemTotalPrice = null;

  @JsonProperty("productOffering")
  private ProductOffering productOffering = null;

  @JsonProperty("product")
  private Product product = null;

  @JsonProperty("orderItemRelationship")
  @Valid
  private List<OrderItemRelationShip> orderItemRelationship = null;

  @JsonProperty("qualification")
  @Valid
  private List<QualificationRef> qualification = null;

  @JsonProperty("payment")
  @Valid
  private List<PaymentRef> payment = null;

  @JsonProperty("itemTerm")
  @Valid
  private List<OrderTerm> itemTerm = null;

  @JsonProperty("orderItem")
  @Valid
  private List<OrderItem> orderItem = null;

  public OrderItem id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)
   * @return id
  **/
  @ApiModelProperty(required = true, value = "Identifier of the line item (generally it is a sequence number 01, 02, 03, ...)")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrderItem action(ActionType action) {
    this.action = action;
    return this;
  }

  /**
   * Can be \"add\" / \"modify\" / \"no_change\"/ \"delete\"
   * @return action
  **/
  @ApiModelProperty(required = true, value = "Can be \"add\" / \"modify\" / \"no_change\"/ \"delete\"")
  @NotNull

  @Valid

  public ActionType getAction() {
    return action;
  }

  public void setAction(ActionType action) {
    this.action = action;
  }

  public OrderItem state(StateType state) {
    this.state = state;
    return this;
  }

  /**
   * State of the order item : described in the state machine diagram
   * @return state
  **/
  @ApiModelProperty(value = "State of the order item : described in the state machine diagram")

  @Valid

  public StateType getState() {
    return state;
  }

  public void setState(StateType state) {
    this.state = state;
  }

  public OrderItem quantity(Long quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Quantity ordered
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity ordered")


  public Long getQuantity() {
    return quantity;
  }

  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }

  public OrderItem type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Indicates the type of resource. Here it can be a type of productOrderItem.
   * @return type
  **/
  @ApiModelProperty(value = "Indicates the type of resource. Here it can be a type of productOrderItem.")


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public OrderItem schemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
    return this;
  }

  /**
   * An URL to the schema describing this REST resource.
   * @return schemaLocation
  **/
  @ApiModelProperty(value = "An URL to the schema describing this REST resource.")


  public String getSchemaLocation() {
    return schemaLocation;
  }

  public void setSchemaLocation(String schemaLocation) {
    this.schemaLocation = schemaLocation;
  }

  public OrderItem appointment(AppointmentRef appointment) {
    this.appointment = appointment;
    return this;
  }

  /**
   * Used to precise that an appointment was set up with a related party for this order item
   * @return appointment
  **/
  @ApiModelProperty(value = "Used to precise that an appointment was set up with a related party for this order item")

  @Valid

  public AppointmentRef getAppointment() {
    return appointment;
  }

  public void setAppointment(AppointmentRef appointment) {
    this.appointment = appointment;
  }

  public OrderItem billingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
    return this;
  }

  /**
   * A list of billing accounts
   * @return billingAccount
  **/
  @ApiModelProperty(value = "A list of billing accounts")

  @Valid

  public BillingAccountRef getBillingAccount() {
    return billingAccount;
  }

  public void setBillingAccount(BillingAccountRef billingAccount) {
    this.billingAccount = billingAccount;
  }

  public OrderItem itemPrice(List<OrderPrice> itemPrice) {
    this.itemPrice = itemPrice;
    return this;
  }

  public OrderItem addItemPriceItem(OrderPrice itemPriceItem) {
    if (this.itemPrice == null) {
      this.itemPrice = new ArrayList<OrderPrice>();
    }
    this.itemPrice.add(itemPriceItem);
    return this;
  }

  /**
   * An amount, usually of money, that represents the actual price paid by the Customer for this item
   * @return itemPrice
  **/
  @ApiModelProperty(value = "An amount, usually of money, that represents the actual price paid by the Customer for this item")

  @Valid

  public List<OrderPrice> getItemPrice() {
    return itemPrice;
  }

  public void setItemPrice(List<OrderPrice> itemPrice) {
    this.itemPrice = itemPrice;
  }

  public OrderItem itemTotalPrice(List<OrderPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
    return this;
  }

  public OrderItem addItemTotalPriceItem(OrderPrice itemTotalPriceItem) {
    if (this.itemTotalPrice == null) {
      this.itemTotalPrice = new ArrayList<OrderPrice>();
    }
    this.itemTotalPrice.add(itemTotalPriceItem);
    return this;
  }

  /**
   * 
   * @return itemTotalPrice
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<OrderPrice> getItemTotalPrice() {
    return itemTotalPrice;
  }

  public void setItemTotalPrice(List<OrderPrice> itemTotalPrice) {
    this.itemTotalPrice = itemTotalPrice;
  }

  public OrderItem productOffering(ProductOffering productOffering) {
    this.productOffering = productOffering;
    return this;
  }

  /**
   * A product offering reference (ProductOfferingRef). A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information
   * @return productOffering
  **/
  @ApiModelProperty(value = "A product offering reference (ProductOfferingRef). A product offering represents entities that are orderable from the provider of the catalog, this resource includes pricing information")

  @Valid

  public ProductOffering getProductOffering() {
    return productOffering;
  }

  public void setProductOffering(ProductOffering productOffering) {
    this.productOffering = productOffering;
  }

  public OrderItem product(Product product) {
    this.product = product;
    return this;
  }

  /**
   * A product reference (ProductRef). Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted May be a bundle product instantiation, in this case, it will contain the list of bundled product to instantiate Nota : Each product to instantiate corresponds to a purchased productOffering. In case of bundles, the order of the list in the productOffering bundle must match the order of the list in the product instance bundle to deliver.
   * @return product
  **/
  @ApiModelProperty(value = "A product reference (ProductRef). Configure the product characteristics (only configurable characteristics and necessary only if a non default value is selected) and/or identify the product that needs to be modified/deleted May be a bundle product instantiation, in this case, it will contain the list of bundled product to instantiate Nota : Each product to instantiate corresponds to a purchased productOffering. In case of bundles, the order of the list in the productOffering bundle must match the order of the list in the product instance bundle to deliver.")

  @Valid

  public Product getProduct() {
    return product;
  }

  public void setProduct(Product product) {
    this.product = product;
  }

  public OrderItem orderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
    return this;
  }

  public OrderItem addOrderItemRelationshipItem(OrderItemRelationShip orderItemRelationshipItem) {
    if (this.orderItemRelationship == null) {
      this.orderItemRelationship = new ArrayList<OrderItemRelationShip>();
    }
    this.orderItemRelationship.add(orderItemRelationshipItem);
    return this;
  }

  /**
   * Realtionships between order items
   * @return orderItemRelationship
  **/
  @ApiModelProperty(value = "Realtionships between order items")

  @Valid

  public List<OrderItemRelationShip> getOrderItemRelationship() {
    return orderItemRelationship;
  }

  public void setOrderItemRelationship(List<OrderItemRelationShip> orderItemRelationship) {
    this.orderItemRelationship = orderItemRelationship;
  }

  public OrderItem qualification(List<QualificationRef> qualification) {
    this.qualification = qualification;
    return this;
  }

  public OrderItem addQualificationItem(QualificationRef qualificationItem) {
    if (this.qualification == null) {
      this.qualification = new ArrayList<QualificationRef>();
    }
    this.qualification.add(qualificationItem);
    return this;
  }

  /**
   * It could be a serviceQualification or a productOfferingQualification that has been executed previously and captured in the productOrder to provide 'eligibility' information.
   * @return qualification
  **/
  @ApiModelProperty(value = "It could be a serviceQualification or a productOfferingQualification that has been executed previously and captured in the productOrder to provide 'eligibility' information.")

  @Valid

  public List<QualificationRef> getQualification() {
    return qualification;
  }

  public void setQualification(List<QualificationRef> qualification) {
    this.qualification = qualification;
  }

  public OrderItem payment(List<PaymentRef> payment) {
    this.payment = payment;
    return this;
  }

  public OrderItem addPaymentItem(PaymentRef paymentItem) {
    if (this.payment == null) {
      this.payment = new ArrayList<PaymentRef>();
    }
    this.payment.add(paymentItem);
    return this;
  }

  /**
   * If an immediate payment has been done at the product order submission, the payment information are captured and stored (as a reference) in the order.
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

  public OrderItem itemTerm(List<OrderTerm> itemTerm) {
    this.itemTerm = itemTerm;
    return this;
  }

  public OrderItem addItemTermItem(OrderTerm itemTermItem) {
    if (this.itemTerm == null) {
      this.itemTerm = new ArrayList<OrderTerm>();
    }
    this.itemTerm.add(itemTermItem);
    return this;
  }

  /**
   * Description of a productTerm linked to this orderItem. This reprsent a commitment with a duration
   * @return itemTerm
  **/
  @ApiModelProperty(value = "Description of a productTerm linked to this orderItem. This reprsent a commitment with a duration")

  @Valid

  public List<OrderTerm> getItemTerm() {
    return itemTerm;
  }

  public void setItemTerm(List<OrderTerm> itemTerm) {
    this.itemTerm = itemTerm;
  }

  public OrderItem orderItem(List<OrderItem> orderItem) {
    this.orderItem = orderItem;
    return this;
  }

  public OrderItem addOrderItemItem(OrderItem orderItemItem) {
    if (this.orderItem == null) {
      this.orderItem = new ArrayList<OrderItem>();
    }
    this.orderItem.add(orderItemItem);
    return this;
  }

  /**
   * 
   * @return orderItem
  **/
  @ApiModelProperty(value = "")

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
    OrderItem orderItem = (OrderItem) o;
    return Objects.equals(this.id, orderItem.id) &&
        Objects.equals(this.action, orderItem.action) &&
        Objects.equals(this.state, orderItem.state) &&
        Objects.equals(this.quantity, orderItem.quantity) &&
        Objects.equals(this.type, orderItem.type) &&
        Objects.equals(this.schemaLocation, orderItem.schemaLocation) &&
        Objects.equals(this.appointment, orderItem.appointment) &&
        Objects.equals(this.billingAccount, orderItem.billingAccount) &&
        Objects.equals(this.itemPrice, orderItem.itemPrice) &&
        Objects.equals(this.itemTotalPrice, orderItem.itemTotalPrice) &&
        Objects.equals(this.productOffering, orderItem.productOffering) &&
        Objects.equals(this.product, orderItem.product) &&
        Objects.equals(this.orderItemRelationship, orderItem.orderItemRelationship) &&
        Objects.equals(this.qualification, orderItem.qualification) &&
        Objects.equals(this.payment, orderItem.payment) &&
        Objects.equals(this.itemTerm, orderItem.itemTerm) &&
        Objects.equals(this.orderItem, orderItem.orderItem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, action, state, quantity, type, schemaLocation, appointment, billingAccount, itemPrice, itemTotalPrice, productOffering, product, orderItemRelationship, qualification, payment, itemTerm, orderItem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderItem {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    schemaLocation: ").append(toIndentedString(schemaLocation)).append("\n");
    sb.append("    appointment: ").append(toIndentedString(appointment)).append("\n");
    sb.append("    billingAccount: ").append(toIndentedString(billingAccount)).append("\n");
    sb.append("    itemPrice: ").append(toIndentedString(itemPrice)).append("\n");
    sb.append("    itemTotalPrice: ").append(toIndentedString(itemTotalPrice)).append("\n");
    sb.append("    productOffering: ").append(toIndentedString(productOffering)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    orderItemRelationship: ").append(toIndentedString(orderItemRelationship)).append("\n");
    sb.append("    qualification: ").append(toIndentedString(qualification)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
    sb.append("    itemTerm: ").append(toIndentedString(itemTerm)).append("\n");
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

