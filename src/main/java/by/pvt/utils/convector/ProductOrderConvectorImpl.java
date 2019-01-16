package by.pvt.utils.convector;

import by.pvt.model.ProductOrder;

import java.util.List;

public class ProductOrderConvectorImpl {

    public ProductOrder updateConvectorToEntity(ProductOrder entity, ProductOrder dto) {

        if (dto.getHref() != null) {
            entity.setHref(dto.getHref());
        }
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
        if (dto.getState() != null) {
            entity.setState(dto.getState());
        }
        if (dto.getOrderDate() != null) {
            entity.setOrderDate(dto.getOrderDate());
        }
        if (dto.getCompletionDate() != null) {
            entity.setCompletionDate(dto.getCompletionDate());
        }
        if (dto.getRequestedStartDate() != null) {
            entity.setRequestedStartDate(dto.getRequestedStartDate());
        }
        if (dto.getRequestedCompletionDate() != null) {
            entity.setRequestedCompletionDate(dto.getRequestedCompletionDate());
        }
        if (dto.getExpectedCompletionDate() != null) {
            entity.setExpectedCompletionDate(dto.getExpectedCompletionDate());
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
        if (dto.getRelatedParty() != null && !dto.getRelatedParty().isEmpty()) {
            entity.setRelatedParty(new RelatedPartyRefConvectorImpl()
                    .updateConvectorToEntityList(entity.getRelatedParty(), dto.getRelatedParty())
            );
        }
        if (dto.getPayment() != null && !dto.getPayment().isEmpty()) {
            entity.setPayment(new PaymentRefConvectorImpl()
                    .updateConvectorToEntityList(entity.getPayment(), dto.getPayment())
            );
        }
        entity.setOrderTotalPrice(List.of(
        ));
        entity.setOrderItem(List.of(
        ));

        return entity;
    }
}
