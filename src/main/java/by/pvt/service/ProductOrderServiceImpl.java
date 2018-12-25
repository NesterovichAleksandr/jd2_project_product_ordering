package by.pvt.service;

import by.pvt.dao.ProductOrderDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class ProductOrderServiceImpl<T> extends BaseServiceImpl {

    private static Logger log = Logger.getLogger(ProductOrderServiceImpl.class.getName());

    @Autowired
    private ProductOrderDaoImpl<T> productOrderDao;

    @Override
    public List<T> list() {
        log.info("productOrderDao: " + productOrderDao);
        return productOrderDao.find();
    }
}
