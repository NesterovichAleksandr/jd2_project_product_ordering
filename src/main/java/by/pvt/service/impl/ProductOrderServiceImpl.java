package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.model.ProductOrder;
import by.pvt.service.ProductOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.logging.Logger;

@Service
@Transactional
public class ProductOrderServiceImpl<T> extends BaseServiceImpl<ProductOrder, String> implements ProductOrderService {

    private static Logger log = Logger.getLogger(ProductOrderServiceImpl.class.getName());

    @Autowired
    public ProductOrderServiceImpl(BaseDao<ProductOrder, String> dao) {
        super(dao);
    }
}
