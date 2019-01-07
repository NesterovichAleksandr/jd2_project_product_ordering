package by.pvt.dao.impl;

import by.pvt.dao.OrderItemRelationShipDao;
import by.pvt.model.OrderItemRelationShip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class OrderItemRelationShipDaoImpl extends BaseDaoImpl<OrderItemRelationShip, String> implements OrderItemRelationShipDao {

    @Autowired
    OrderItemRelationShipDaoImpl() {
        super(OrderItemRelationShip.class);
    }
}
