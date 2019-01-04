package by.pvt.dao.impl;

import by.pvt.dao.ProductOrderDao;
import by.pvt.model.ProductOrder;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductOrderDaoImpl<T> extends BaseDaoImpl<ProductOrder, String> implements ProductOrderDao {

    private static Logger log = Logger.getLogger(ProductOrderDaoImpl.class.getName());

    @Autowired
    public ProductOrderDaoImpl() {
        super(ProductOrder.class);
    }
}
