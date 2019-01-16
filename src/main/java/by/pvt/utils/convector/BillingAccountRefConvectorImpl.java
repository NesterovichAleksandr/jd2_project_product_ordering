package by.pvt.utils.convector;

import by.pvt.model.BillingAccountRef;

public class BillingAccountRefConvectorImpl {

    public BillingAccountRef updateConvectorToEntity(BillingAccountRef entity, BillingAccountRef dto) {

        if (dto.getHref() != null) {
            entity.setHref(dto.getHref());
        }
        if (dto.getName() != null) {
            entity.setName(dto.getName());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        return entity;
    }

    public BillingAccountRef convectorToNewEntity(BillingAccountRef dto) {
        BillingAccountRef billingAccountRef = new BillingAccountRef();

        billingAccountRef.setHref(dto.getHref());
        billingAccountRef.setName(dto.getName());
        billingAccountRef.setType(dto.getType());

        return billingAccountRef;
    }
}
