package by.pvt.dao.impl;

import by.pvt.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Transactional
public abstract class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

    private static Logger log = Logger.getLogger(BaseDaoImpl.class.getName());

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> aClass;

    BaseDaoImpl(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void create(T entity) {
        Session session = openSession();
        session.save(entity);
        log.info(aClass + " create(): \n" + entity);
    }

    public T read(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        log.info(aClass + " read(): \n" + entity);
        return entity;
    }

    public void update(T entity) {
        Session session = openSession();
        session.update(entity);
        log.info(aClass + " update(): \n" + entity);
    }

    public void delete(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        session.delete(entity);
        log.info(aClass + " delete(): id=" + id + "\ndelete entity: " + entity);
    }

    public List<T> getAll() {
        String nameClass = (aClass.getSimpleName());
        List list = openSession().createQuery("from " + nameClass).list();
        log.info(aClass + " getAll(): \n" + list);
        return list;
    }

    Session openSession() {
        return sessionFactory.getCurrentSession();
    }
}
