package by.pvt.utils.convector;

import by.pvt.model.PriceAlteration;

import java.util.LinkedList;
import java.util.List;

public class PriceAlterationConvectorImpl {

    public PriceAlteration updateConvectorToEntity(PriceAlteration entity, PriceAlteration dto) {

        if (dto.getName() != null) {
            entity.setName(dto.getName());
        }
        if (dto.getDescription() != null) {
            entity.setDescription(dto.getDescription());
        }
        if (dto.getPriceType() != null) {
            entity.setPriceType(dto.getPriceType());
        }
        if (dto.getUnitOfMeasure() != null) {
            entity.setUnitOfMeasure(dto.getUnitOfMeasure());
        }
        if (dto.getRecurringChargePeriod() != null) {
            entity.setRecurringChargePeriod(dto.getRecurringChargePeriod());
        }
        if (dto.getApplicationDuration() != null) {
            entity.setApplicationDuration(dto.getApplicationDuration());
        }
        if (dto.getPriority() != null) {
            entity.setPriority(dto.getPriority());
        }
        if (dto.getPrice() != null) {
            entity.setPrice(new PriceConvectorImpl()
                    .updateConvectorToEntity(entity.getPrice(), dto.getPrice())
            );
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        if (dto.getSchemaLocation() != null) {
            entity.setSchemaLocation(dto.getSchemaLocation());
        }
        return entity;
    }

    public PriceAlteration convectorToNewEntity(PriceAlteration dto) {
        PriceAlteration priceAlteration = new PriceAlteration();

        priceAlteration.setName(dto.getName());
        priceAlteration.setDescription(dto.getDescription());
        priceAlteration.setPriceType(dto.getPriceType());
        priceAlteration.setUnitOfMeasure(dto.getUnitOfMeasure());
        priceAlteration.setRecurringChargePeriod(dto.getRecurringChargePeriod());
        priceAlteration.setApplicationDuration(dto.getApplicationDuration());
        priceAlteration.setPriority(dto.getPriority());
        priceAlteration.setPrice(new PriceConvectorImpl()
                .convectorToNewEntity(dto.getPrice())
        );
        priceAlteration.setType(dto.getType());
        priceAlteration.setSchemaLocation(dto.getSchemaLocation());

        return priceAlteration;
    }

    public List<PriceAlteration> updateConvectorToEntityList(List<PriceAlteration> listEntity, List<PriceAlteration> listDto) {

        for (PriceAlteration p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }

    public List<PriceAlteration> convectorToNewEntityList(List<PriceAlteration> listDto) {
        List<PriceAlteration> listEntity = new LinkedList<>();
        for (PriceAlteration p : listDto) {
            listEntity.add(convectorToNewEntity(p));
        }
        return listEntity;
    }
}
