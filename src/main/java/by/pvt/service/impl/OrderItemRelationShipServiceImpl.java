package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.OrderItemRelationShip;
import by.pvt.service.OrderItemRelationShipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderItemRelationShipServiceImpl extends BaseServiceImpl<OrderItemRelationShip, String> implements OrderItemRelationShipService {

    @Autowired
    public OrderItemRelationShipServiceImpl(BaseDao<OrderItemRelationShip, String> dao) {
        super(dao);
    }
}
