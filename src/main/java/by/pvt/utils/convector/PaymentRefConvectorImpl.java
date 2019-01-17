package by.pvt.utils.convector;

import by.pvt.model.PaymentRef;

import java.util.LinkedList;
import java.util.List;

public class PaymentRefConvectorImpl {

    public PaymentRef updateConvectorToEntity(PaymentRef entity, PaymentRef dto) {

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

    public PaymentRef convectorToNewEntity(PaymentRef dto) {
        PaymentRef paymentRef = new PaymentRef();

        paymentRef.setHref(dto.getHref()); //add Logger

        if (dto.getName() != null) {
            paymentRef.setName(dto.getName());
        }
        if (dto.getType() != null) {
            paymentRef.setType(dto.getType());
        }
        return paymentRef;
    }

    public List<PaymentRef> updateConvectorToEntityList(List<PaymentRef> listEntity, List<PaymentRef> listDto) {

        for (PaymentRef p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }

    public List<PaymentRef> convectorToNewEntityList(List<PaymentRef> listDto) {
        List<PaymentRef> listEntity = new LinkedList<>();
        for (PaymentRef p : listDto) {
            listEntity.add(convectorToNewEntity(p));
        }
        return listEntity;
    }
}
