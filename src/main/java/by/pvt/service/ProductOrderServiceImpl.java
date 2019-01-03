package by.pvt.service;

import by.pvt.dao.ProductOrderDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
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
    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<T> list() {
        log.info("productOrderDao: " + productOrderDao);
        return productOrderDao.find();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void save(T item) {
        log.info("save(): " + item);
        productOrderDao.save(item);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, value = "txManager")
    public void create(List<T> items) {
        log.info("create(): " + items);
        for (T t : items) {
            saveOne(t);
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void saveOne(T item) {
        productOrderDao.save(item);
    }

}
