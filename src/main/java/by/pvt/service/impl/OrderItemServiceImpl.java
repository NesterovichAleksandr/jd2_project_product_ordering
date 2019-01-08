package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.OrderItem;
import by.pvt.service.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderItemServiceImpl extends BaseServiceImpl<OrderItem, String> implements OrderItemService {

    @Autowired
    public OrderItemServiceImpl(BaseDao<OrderItem, String> dao) {
        super(dao);
    }
}
