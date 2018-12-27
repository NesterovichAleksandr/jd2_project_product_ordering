package by.pvt.service;

import by.pvt.dao.ProductOrderDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public class ProductOrderServiceImpl<T> extends BaseServiceImpl {

    private static Logger log = Logger.getLogger(ProductOrderServiceImpl.class.getName());

    @Autowired
    private ProductOrderDaoImpl<T> productOrderDao;

    @Override
    @Transactional
    public List<T> list() {
        log.info("productOrderDao: " + productOrderDao);
        return productOrderDao.find();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void create(List<T> items) {
        productOrderDao.createTestData();
    }
}
