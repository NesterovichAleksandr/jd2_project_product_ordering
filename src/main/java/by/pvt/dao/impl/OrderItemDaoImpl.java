package by.pvt.dao.impl;

import by.pvt.dao.OrderItemDao;
import by.pvt.model.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;

public class OrderItemDaoImpl extends BaseDaoImpl<OrderItem, String> implements OrderItemDao {

    @Autowired
    public OrderItemDaoImpl() {
        super(OrderItem.class);
    }
}
