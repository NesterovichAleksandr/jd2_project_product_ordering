package by.pvt.utils.convector;

import by.pvt.model.Price;

import java.util.LinkedList;
import java.util.List;

public class PriceConvectorImpl {

    public Price updateConvectorToEntity(Price entity, Price dto) {

        if (dto.getTaxIncludedAmount() != null) {
            entity.setTaxIncludedAmount(new MoneyConvectorImpl()
                    .convectorToNewEntity(dto.getTaxIncludedAmount())
            );
        }
        if (dto.getDutyFreeAmount() != null) {
            entity.setDutyFreeAmount(new MoneyConvectorImpl()
                    .convectorToNewEntity(dto.getDutyFreeAmount())
            );
        }
        if (dto.getTaxRate() != null) {
            entity.setTaxRate(dto.getTaxRate());
        }
        if (dto.getPercentage() != null) {
            entity.setPercentage(dto.getPercentage());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        if (dto.getSchemaLocation() != null) {
            entity.setSchemaLocation(dto.getSchemaLocation());
        }
        return entity;
    }

    public Price convectorToNewEntity(Price dto) {
        Price price = new Price();

        price.setTaxIncludedAmount(new MoneyConvectorImpl()
                .convectorToNewEntity(dto.getTaxIncludedAmount())
        );
        price.setDutyFreeAmount(new MoneyConvectorImpl()
                .convectorToNewEntity(dto.getDutyFreeAmount())
        );
        price.setTaxRate(dto.getTaxRate());
        price.setPercentage(dto.getPercentage());
        price.setType(dto.getType());
        price.setSchemaLocation(dto.getSchemaLocation());
        return price;
    }

    public List<Price> updateConvectorToEntityList(List<Price> listEntity, List<Price> listDto) {

        for (Price p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }

    public List<Price> convectorToNewEntityList(List<Price> listDto) {
        List<Price> listEntity = new LinkedList<>();
        for (Price p : listDto) {
            listEntity.add(convectorToNewEntity(p));
        }
        return listEntity;
    }
}
