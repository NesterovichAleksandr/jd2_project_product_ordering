package by.pvt.utils.convector;

import by.pvt.model.ActionType;
import by.pvt.model.POSTREQOrderItem;
import by.pvt.model.POSTREQProductOrder;

import java.util.List;

public class POSTREQProductOrderConvectorImpl {

    public POSTREQProductOrder convectorToNewEntity(POSTREQProductOrder dto) {
        POSTREQProductOrder postreqProductOrder = new POSTREQProductOrder();

        postreqProductOrder.setExternalId(dto.getExternalId());
        postreqProductOrder.setPriority(dto.getPriority());
        postreqProductOrder.setDescription(dto.getDescription());
        postreqProductOrder.setCategory(dto.getCategory());
        postreqProductOrder.setRequestedStartDate(dto.getRequestedStartDate());
        postreqProductOrder.setRequestedCompletionDate(dto.getRequestedCompletionDate());
        postreqProductOrder.setNotificationContact(dto.getNotificationContact());
        postreqProductOrder.setBaseType(dto.getBaseType());
        postreqProductOrder.setType(dto.getType());
        postreqProductOrder.setSchemaLocation(dto.getSchemaLocation());
        postreqProductOrder.setChannel(new ChannelConvectorImpl()
                .convectorToNewEntity(dto.getChannel())
        );
        postreqProductOrder.setNote(new NoteConvectorImpl()
                .convectorToNewEntity(dto.getNote())
        );
        postreqProductOrder.setRelatedParty(new RelatedPartyRefConvectorImpl()
                .convectorToNewEntityList(dto.getRelatedParty())
        );
        postreqProductOrder.setPayment(new PaymentRefConvectorImpl()
                .convectorToNewEntityList(dto.getPayment())
        );
        postreqProductOrder.setBillingAccount(new BillingAccountRefConvectorImpl()
                .convectorToNewEntity(dto.getBillingAccount())
        );
        postreqProductOrder.setOrderTotalPrice(new OrderPriceConvectorImpl()
                .convectorToNewEntityList(dto.getOrderTotalPrice())
        );

        POSTREQOrderItem postreqOrderItem = new POSTREQOrderItem();
        postreqOrderItem.setAction(ActionType.ADD);
        postreqProductOrder.setOrderItem(List.of(postreqOrderItem));

        return postreqProductOrder;
    }

    public POSTREQProductOrder updateConvectorToEntity(POSTREQProductOrder entity, POSTREQProductOrder dto) {

        if (dto.getExternalId() != null) {
            entity.setExternalId(dto.getExternalId());
        }
        if (dto.getPriority() != null) {
            entity.setPriority(dto.getPriority());
        }
        if (dto.getDescription() != null) {
            entity.setDescription(dto.getDescription());
        }
        if (dto.getCategory() != null) {
            entity.setCategory(dto.getCategory());
        }
        if (dto.getRequestedStartDate() != null) {
            entity.setRequestedStartDate(dto.getRequestedStartDate());
        }
        if (dto.getRequestedCompletionDate() != null) {
            entity.setRequestedCompletionDate(dto.getRequestedCompletionDate());
        }
        if (dto.getNotificationContact() != null) {
            entity.setNotificationContact(dto.getNotificationContact());
        }
        if (dto.getBaseType() != null) {
            entity.setBaseType(dto.getBaseType());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        if (dto.getSchemaLocation() != null) {
            entity.setSchemaLocation(dto.getSchemaLocation());
        }
        if (dto.getChannel() != null) {
            entity.setChannel(new ChannelConvectorImpl()
                    .updateConvectorToEntity(entity.getChannel(), dto.getChannel())
            );
        }
        if (dto.getNote() != null) {
            entity.setNote(dto.getNote());
        }
        if (dto.getBillingAccount() != null) {
            entity.setBillingAccount(new BillingAccountRefConvectorImpl()
                    .updateConvectorToEntity(entity.getBillingAccount(), dto.getBillingAccount())
            );
        }
        if (dto.getRelatedParty() != null) {
            if (entity.getRelatedParty() == null) {
                entity.setRelatedParty(List.of());
            }
            if (!dto.getRelatedParty().isEmpty()) {
                entity.setRelatedParty(new RelatedPartyRefConvectorImpl()
                        .updateConvectorToEntityList(entity.getRelatedParty(), dto.getRelatedParty())
                );
            }
        }
        if (dto.getPayment() != null) {
            if (entity.getPayment() == null) {
                entity.setPayment(List.of());
            }
            if (!dto.getPayment().isEmpty()) {
                entity.setPayment(new PaymentRefConvectorImpl()
                        .updateConvectorToEntityList(entity.getPayment(), dto.getPayment())
                );
            }
        }
        if (dto.getOrderTotalPrice() != null) {
            if (entity.getOrderTotalPrice() == null) {
                entity.setOrderTotalPrice(List.of());
            }
            if (!dto.getOrderTotalPrice().isEmpty()) {
                entity.setOrderTotalPrice(new OrderPriceConvectorImpl()
                        .updateConvectorToEntityList(entity.getOrderTotalPrice(), dto.getOrderTotalPrice())
                );
            }
        }
        entity.setOrderItem(List.of(
        ));

        return entity;
    }
}
