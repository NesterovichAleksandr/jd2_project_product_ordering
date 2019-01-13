package by.pvt.utils;

import by.pvt.model.*;
import org.threeten.bp.OffsetDateTime;

import java.util.List;

public class CreateAndFillEntity {

    public static ProductOrder productOrder(String prefix) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setHref("Href_" + prefix);
        productOrder.setExternalId("ExternalId_" + prefix);
        productOrder.setPriority(PriorityType._1);
        productOrder.setDescription("Description_" + prefix);
        productOrder.setCategory("Category_" + prefix);
        productOrder.setState(StateType.COMPLETED);
        productOrder.setOrderDate(OffsetDateTime.now());
        productOrder.setCompletionDate(OffsetDateTime.now().plusHours(1));
        productOrder.setRequestedStartDate(OffsetDateTime.now().plusHours(2));
        productOrder.setRequestedCompletionDate(OffsetDateTime.now().plusHours(3));
        productOrder.setExpectedCompletionDate(OffsetDateTime.now().plusHours(4));
        productOrder.setNotificationContact("NotificationContact_" + prefix);
        productOrder.setBaseType("BaseType_" + prefix);
        productOrder.setType("Type_" + prefix);
        productOrder.setSchemaLocation("SchemaLocation_" + prefix);
        productOrder.setChannel(
                channel(prefix + "_ProductOrder")
        );
        productOrder.setNote(
                note(prefix + "_ProductOrder")
        );
        productOrder.setBillingAccount(
                billingAccountRef(prefix + "_ProductOrder")
        );
        productOrder.setRelatedParty(List.of(
                relatedPartyRef("1" + "_ProductOrder"),
                relatedPartyRef("2" + "_ProductOrder")
        ));
        productOrder.setPayment(List.of(
                paymentRef("1" + "_ProductOrder"),
                paymentRef("2" + "_ProductOrder")
        ));
        productOrder.setOrderTotalPrice(List.of(
                orderPrice("1" + "_ProductOrder"),
                orderPrice("2" + "_ProductOrder")
        ));
        productOrder.setOrderItem(List.of(
                orderItem("1" + "_ProductOrder"),
                orderItem("2" + "_ProductOrder")
        ));
        return productOrder;
    }

    public static Channel channel(String prefix) {
        Channel channel = new Channel();
        channel.setHref("Href_" + prefix);
        channel.setName("Name_" + prefix);
        channel.setRole("Role_" + prefix);
        channel.setType("Type_" + prefix);
        return channel;
    }

    public static Note note(String prefix) {
        Note note = new Note();
        note.setText("Text_" + prefix);
        note.setDate(OffsetDateTime.now());
        note.setAuthor("Author_" + prefix);
        return note;
    }

    public static BillingAccountRef billingAccountRef(String prefix) {
        BillingAccountRef billingAccountRef = new BillingAccountRef();
        billingAccountRef.setHref("Href_" + prefix);
        billingAccountRef.setName("Name_" + prefix);
        billingAccountRef.setType("Type_" + prefix);
        return billingAccountRef;
    }

    public static RelatedPartyRef relatedPartyRef(String prefix) {
        RelatedPartyRef relatedPartyRef = new RelatedPartyRef();
        relatedPartyRef.setHref("Href_" + prefix);
        relatedPartyRef.setName("Name_" + prefix);
        relatedPartyRef.setRole("Role_" + prefix);
        relatedPartyRef.setType("Type_" + prefix);
        return relatedPartyRef;
    }

    public static PaymentRef paymentRef(String prefix) {
        PaymentRef paymentRef = new PaymentRef();
        paymentRef.setHref("Href_" + prefix);
        paymentRef.setName("Name_" + prefix);
        paymentRef.setType("Type_" + prefix);
        return paymentRef;
    }

    public static OrderPrice orderPrice(String prefix) {
        OrderPrice orderPrice = new OrderPrice();
        orderPrice.setName("Name_" + prefix);
        orderPrice.setDescription("Description_" + prefix);
        orderPrice.setPriceType(PriceType.ONETIME);
        orderPrice.setUnitOfMeasure("UnitOfMeasure_" + prefix);
        orderPrice.setRecurringChargePeriod("RecurringChargePeriod_" + prefix);
        orderPrice.setType("Type_" + prefix);
        orderPrice.setSchemaLocation("SchemaLocation_" + prefix);
        orderPrice.setPrice(
                price(prefix + "_OrderPrice")
        );
        orderPrice.setPriceAlteration(List.of(
                priceAlteration("1" + "_OrderPrice"),
                priceAlteration("2" + "_OrderPrice")
        ));
        orderPrice.setBillingAccount(
                billingAccountRef(prefix + "_OrderPrice")
        );
        return orderPrice;
    }

    public static Price price(String prefix) {
        Price price = new Price();
        price.setTaxIncludedAmount(
                money(prefix + "_Price_TaxIncludedAmount")
        );
        price.setDutyFreeAmount(
                money(prefix + "_Price_DutyFreeAmount")
        );
        price.setTaxRate(12.0F);
        price.setPercentage(13F);
        price.setType("Type_" + prefix);
        price.setSchemaLocation("SchemaLocation_" + prefix);
        return price;
    }

    public static Money money(String prefix) {
        Money money = new Money();
        money.setValue(15F);
        money.setUnit("Unit_" + prefix);
        return money;
    }

    public static PriceAlteration priceAlteration(String prefix) {
        PriceAlteration priceAlteration = new PriceAlteration();
        priceAlteration.setName("Name_" + prefix);
        priceAlteration.setDescription("Description_" + prefix);
        priceAlteration.setPriceType(PriceType.ONETIME);
        priceAlteration.setUnitOfMeasure("UnitOfMeasure_" + prefix);
        priceAlteration.setRecurringChargePeriod("RecurringChargePeriod_" + prefix);
        priceAlteration.setApplicationDuration("ApplicationDuration_" + prefix);
        priceAlteration.setPriority(5);
        priceAlteration.setPrice(
                price("_PriceAlteration")
        );
        priceAlteration.setType("Type_" + prefix);
        priceAlteration.setSchemaLocation("SchemaLocation_" + prefix);
        return priceAlteration;
    }

    public static OrderItem orderItem(String prefix) {
        OrderItem orderItem = new OrderItem();
        orderItem.setAction(ActionType.ADD);
        orderItem.setState(StateType.COMPLETED);
        orderItem.setQuantity(12345L);
        orderItem.setType("Type_" + prefix);
        orderItem.setSchemaLocation("SchemaLocation_" + prefix);
        orderItem.setAppointment(
                appointmentRef("1" + "_OrderItem")
        );
        orderItem.setBillingAccount(
                billingAccountRef("1" + "_OrderItem")
        );
        orderItem.setItemPrice(List.of(
//                orderPrice("1" + "_OrderItem"),
//                orderPrice("2" + "_OrderItem")
        ));
        orderItem.setItemTotalPrice(List.of(
//                orderPrice("1" + "_OrderItem"),
//                orderPrice("2" + "_OrderItem")
        ));
        orderItem.setProductOffering(
                productOffering("1" + "_OrderItem")
        );
        orderItem.setProduct(
                product("1" + "_OrderItem" + prefix)
        );
        orderItem.setOrderItemRelationship(List.of(
                orderItemRelationShip("1" + "_OrderItem"),
                orderItemRelationShip("2" + "_OrderItem")
        ));
        orderItem.setQualification(List.of(
                qualificationRef("1" + "_OrderItem"),
                qualificationRef("2" + "_OrderItem")
        ));
        orderItem.setPayment(List.of(
                paymentRef("1" + "_OrderItem"),
                paymentRef("2" + "_OrderItem")
        ));
        orderItem.setItemTerm(List.of(
                orderTerm("1" + "_OrderItem"),
                orderTerm("2" + "_OrderItem")
        ));
        orderItem.setOrderItem(List.of(
                //orderItem("1" + "_OrderItem")
        ));
        return orderItem;
    }

    public static AppointmentRef appointmentRef(String prefix) {
        AppointmentRef appointmentRef = new AppointmentRef();
        appointmentRef.setHref("Href_" + prefix);
        appointmentRef.setType("Type_" + prefix);
        return appointmentRef;
    }

    public static ProductOffering productOffering(String prefix) {
        ProductOffering productOffering = new ProductOffering();
        productOffering.setHref("Href_" + prefix);
        productOffering.setName("Name_" + prefix);
        productOffering.setType("Type_" + prefix);
        return productOffering;
    }

    public static Product product(String prefix) {
        Product product = new Product();
        product.setHref("Href_" + prefix);
        product.setName("Name_" + prefix);
        product.setPlace(List.of(
                place("1" + "_Product"),
                place("2" + "_Product")
        ));
        product.setCharacteristic(List.of(
                productCharacteristic("1" + "_Product"),
                productCharacteristic("2" + "_Product")
        ));
        product.setRelatedParty(List.of(
                relatedPartyRef("1" + "_Product"),
                relatedPartyRef("2" + "_Product")
        ));
        product.setProductRelationship(List.of(
                productRelationship("1" + "_Product"),
                productRelationship("2" + "_Product")
        ));
        product.setProductSpecification(
                productSpecificationRef("1" + "_Product")
        );
        return product;
    }

    public static Place place(String prefix) {
        Place place = new Place();
        place.setHref("Href_" + prefix);
        place.setName("Name_" + prefix);
        place.setRole("Role_" + prefix);
        place.setType("Type_" + prefix);
        place.setSchemaLocation("SchemaLocation_" + prefix);
        return place;
    }

    public static ProductCharacteristic productCharacteristic(String prefix) {
        ProductCharacteristic productCharacteristic = new ProductCharacteristic();
        productCharacteristic.setName("Name_" + prefix);
        productCharacteristic.setValue("Value_" + prefix);
        productCharacteristic.setType("Type_" + prefix);
        productCharacteristic.setSchemaLocation("SchemaLocation_" + prefix);
        return productCharacteristic;
    }

    public static ProductRelationship productRelationship(String prefix) {
        ProductRelationship productRelationship = new ProductRelationship();
        productRelationship.setType(RelationShipType.HASCHILD);
        productRelationship.setProduct(
                new Product()
        );
        return productRelationship;
    }

    public static ProductSpecificationRef productSpecificationRef(String prefix) {
        ProductSpecificationRef productSpecificationRef = new ProductSpecificationRef();
        productSpecificationRef.setHref("Href_" + prefix);
        productSpecificationRef.setVersion("Version_" + prefix);
        productSpecificationRef.setName("Name_" + prefix);
        productSpecificationRef.setType("Type_" + prefix);
        return productSpecificationRef;
    }

    public static OrderItemRelationShip orderItemRelationShip(String prefix) {
        OrderItemRelationShip orderItemRelationShip = new OrderItemRelationShip();
        orderItemRelationShip.setType(RelationShipType.BRINGS);
        return orderItemRelationShip;
    }

    public static QualificationRef qualificationRef(String prefix) {
        QualificationRef qualificationRef = new QualificationRef();
        qualificationRef.setHref("Href_" + prefix);
        qualificationRef.setQualificationItemId("QualificationItemId_" + prefix);
        qualificationRef.setType("Type_" + prefix);
        return qualificationRef;
    }

    public static OrderTerm orderTerm(String prefix) {
        OrderTerm orderTerm = new OrderTerm();
        orderTerm.setName("Name_" + prefix);
        orderTerm.setDescription("Description_" + prefix);
        orderTerm.setDuration(
                quantity("1" + "_OrderTerm")
        );
        return orderTerm;
    }

    public static Quantity quantity(String prefix) {
        Quantity quantity = new Quantity();
        quantity.setValue(23F);
        quantity.setUnit("Unit_" + prefix);
        return quantity;
    }
}
