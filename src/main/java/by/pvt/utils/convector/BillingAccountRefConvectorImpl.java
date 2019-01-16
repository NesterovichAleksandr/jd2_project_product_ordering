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
}
