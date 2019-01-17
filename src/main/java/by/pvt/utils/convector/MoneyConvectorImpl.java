package by.pvt.utils.convector;

import by.pvt.model.Money;

import java.util.LinkedList;
import java.util.List;

public class MoneyConvectorImpl {

    public Money updateConvectorToEntity(Money entity, Money dto) {

        if (dto.getUnit() != null) {
            entity.setUnit(dto.getUnit());
        }
        if (dto.getValue() != null) {
            entity.setValue(dto.getValue());
        }
        return entity;
    }

    public Money convectorToNewEntity(Money dto) {
        Money money = new Money();
        money.setUnit(dto.getUnit());
        money.setValue(dto.getValue());

        return money;
    }

    public List<Money> updateConvectorToEntityList(List<Money> listEntity, List<Money> listDto) {

        for (Money p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }

    public List<Money> convectorToNewEntityList(List<Money> listDto) {
        List<Money> listEntity = new LinkedList<>();
        for (Money p : listDto) {
            listEntity.add(convectorToNewEntity(p));
        }
        return listEntity;
    }
}
