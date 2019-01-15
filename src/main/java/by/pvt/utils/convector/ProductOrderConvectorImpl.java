package by.pvt.utils.convector;

import by.pvt.model.ProductOrder;

import java.util.List;

public class ProductOrderConvectorImpl {

    public ProductOrder updateConvectorToEntity(ProductOrder entity, ProductOrder dto){

        entity.setHref(dto.getHref());
        entity.setExternalId(dto.getExternalId());
        entity.setPriority(dto.getPriority());
        entity.setDescription(dto.getDescription());
        entity.setCategory(dto.getCategory());
        entity.setState(dto.getState());
        entity.setOrderDate(dto.getOrderDate());
        entity.setCompletionDate(dto.getCompletionDate());
        entity.setRequestedStartDate(dto.getRequestedStartDate());
        entity.setRequestedCompletionDate(dto.getRequestedCompletionDate());
        entity.setExpectedCompletionDate(dto.getExpectedCompletionDate());
        entity.setNotificationContact(dto.getNotificationContact());
        entity.setBaseType(dto.getBaseType());
        entity.setType(dto.getType());
        entity.setSchemaLocation(dto.getSchemaLocation());
        entity.setChannel(
                entity.getChannel()
                        .href(dto.getChannel().getHref())
                        .name(dto.getChannel().getName())
                        .role(dto.getChannel().getRole())
                        .type(dto.getChannel().getType())
        );
        entity.setNote(dto.getNote());
        entity.setBillingAccount(
                entity.getBillingAccount()
                        .href(dto.getBillingAccount().getHref())
                        .name(dto.getBillingAccount().getName())
                        .type(dto.getBillingAccount().getType())
        );
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
