package by.pvt.service.impl;

import by.pvt.dao.impl.ProductOrderDaoImpl;
import by.pvt.model.ProductOrder;
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
        return (List<T>) productOrderDao.getAll();
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void save(T item) {
        log.info("save(): " + item);
        productOrderDao.create((ProductOrder) item);
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
        productOrderDao.create((ProductOrder) item);
    }

}
