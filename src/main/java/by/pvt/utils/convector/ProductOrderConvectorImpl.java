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
            entity.setChannel(
                    entity.getChannel()
                            .href(dto.getChannel().getHref())
                            .name(dto.getChannel().getName())
                            .role(dto.getChannel().getRole())
                            .type(dto.getChannel().getType())
            );
        }
        if (dto.getNote() != null) {
            entity.setNote(dto.getNote());
        }
        if (dto.getBillingAccount() != null) {
            entity.setBillingAccount(
                    entity.getBillingAccount()
                            .href(dto.getBillingAccount().getHref())
                            .name(dto.getBillingAccount().getName())
                            .type(dto.getBillingAccount().getType())
            );
        }
        entity.setRelatedParty(List.of(
                entity.getRelatedParty().get(0)
                        .href(dto.getRelatedParty().get(0).getHref())
                        .name(dto.getRelatedParty().get(0).getName())
                        .role(dto.getRelatedParty().get(0).getRole())
                        .type(dto.getRelatedParty().get(0).getType())
        ));
        entity.setPayment(List.of(
        ));
        entity.setOrderTotalPrice(List.of(
        ));
        entity.setOrderItem(List.of(
        ));

        return entity;
    }
}
