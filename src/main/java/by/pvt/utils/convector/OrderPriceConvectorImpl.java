package by.pvt.utils.convector;

import by.pvt.model.OrderPrice;
import by.pvt.model.Price;

import java.util.List;

public class OrderPriceConvectorImpl {

    public OrderPrice updateConvectorToEntity(OrderPrice entity, OrderPrice dto) {

        if (dto.getName() != null) {
            entity.setName(dto.getName());
        }
        if (dto.getType() != null) {
            entity.setType(dto.getType());
        }
        return entity;
    }

    public OrderPrice convectorToNewEntity(OrderPrice dto) {
        OrderPrice orderPrice = new OrderPrice();

        orderPrice.setName(dto.getName());
        orderPrice.setDescription(dto.getDescription());
        orderPrice.setPriceType(dto.getPriceType());
        orderPrice.setUnitOfMeasure(dto.getUnitOfMeasure());
        orderPrice.setRecurringChargePeriod(dto.getRecurringChargePeriod());
        orderPrice.setType(dto.getType());
        orderPrice.setSchemaLocation(dto.getSchemaLocation());
        Price price = new Price();
        orderPrice.setPrice(
                price
        );
        orderPrice.setPriceAlteration(List.of(

        ));
        orderPrice.setBillingAccount(new BillingAccountRefConvectorImpl()
                .convectorToNewEntity(dto.getBillingAccount())
        );

        return orderPrice;
    }

    public List<OrderPrice> updateConvectorToEntityList(List<OrderPrice> listEntity, List<OrderPrice> listDto) {

        for (OrderPrice p : listDto) {
            if (!listEntity.contains(p)) {
                listEntity.add(convectorToNewEntity(p));
            }
        }
        return listEntity;
    }
}
