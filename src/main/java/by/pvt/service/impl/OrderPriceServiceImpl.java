package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.OrderPrice;
import by.pvt.service.OrderPriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderPriceServiceImpl extends BaseServiceImpl<OrderPrice, Long> implements OrderPriceService {

    @Autowired
    public OrderPriceServiceImpl(BaseDao<OrderPrice, Long> dao) {
        super(dao);
    }
}
