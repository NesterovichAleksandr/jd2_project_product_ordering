package by.pvt.dao;

import by.pvt.model.ProductOrder;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

@Repository
public class ProductOrderDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(ProductOrderDaoImpl.class.getName());

    @Override
    public List<T> find() {
        createTestData();

        Session session = openSession();
        List<T> list = session.createQuery("from ProductOrder").list();
        session.close();
        return list;
    }

    private void createTestData() {
        Session session = openSession();
        try {
            session.beginTransaction();
            session.saveOrUpdate(fillProductOrder("1"));
            session.saveOrUpdate(fillProductOrder("2"));
            session.saveOrUpdate(fillProductOrder("3"));
            session.getTransaction().commit();
        } catch (Exception e) {
            log.log(Level.SEVERE, "Error during creation of test data", e);
            if (session.getTransaction() != null) session.getTransaction().rollback();
        } finally {
            session.close();
        }
    }

    private T fillProductOrder(String prefix) {
        ProductOrder productOrder = new ProductOrder();
        productOrder.setDescription("Description" + prefix);
        productOrder.setCategory("Category" + prefix);
        productOrder.setHref("localhost/" + prefix);
        return (T) productOrder;
    }
}
