package by.pvt.dao;

import by.pvt.model.ProductOrder;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductOrderDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(ProductOrderDaoImpl.class.getName());

    @Autowired
    public ProductOrderDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<T> find() {
        log.info("Call find()");
        return openSession().createQuery("from ProductOrder").list();
    }

    public void createTestData() {
        log.info("Call createTestData()");
        Session session = openSession();
        session.saveOrUpdate(fillProductOrder("1"));
        session.saveOrUpdate(fillProductOrder("2"));
        session.saveOrUpdate(fillProductOrder("3"));
    }

    private T fillProductOrder(String prefix) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setDescription("Description" + prefix);
        productOrder.setCategory("Category" + prefix);
        productOrder.setHref("localhost/" + prefix);
        return (T) productOrder;
    }
}
