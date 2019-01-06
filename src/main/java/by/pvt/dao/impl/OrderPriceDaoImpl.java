package by.pvt.dao.impl;

import by.pvt.dao.OrderPriceDao;
import by.pvt.model.OrderPrice;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderPriceDaoImpl extends BaseDaoImpl<OrderPrice, Long> implements OrderPriceDao {

    @Autowired
    public OrderPriceDaoImpl() {
        super(OrderPrice.class);
    }
}
