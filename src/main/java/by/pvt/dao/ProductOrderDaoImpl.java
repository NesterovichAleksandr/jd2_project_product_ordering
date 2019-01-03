package by.pvt.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.logging.Logger;

@Repository
public class ProductOrderDaoImpl<T> extends BaseDaoImpl {

    private static Logger log = Logger.getLogger(ProductOrderDaoImpl.class.getName());

    /*public ProductOrderDaoImpl(){
        super(ProductOrder.class);
    }*/

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

    public void save(T item) {
        openSession().saveOrUpdate(item);
    }
}
