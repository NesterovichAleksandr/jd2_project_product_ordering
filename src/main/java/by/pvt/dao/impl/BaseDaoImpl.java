package by.pvt.dao.impl;

import by.pvt.dao.BaseDao;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Transactional
public abstract class BaseDaoImpl<T, PK extends Serializable> implements BaseDao<T, PK> {

    @Autowired
    SessionFactory sessionFactory;

    private Class<T> aClass;

    BaseDaoImpl(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void create(T entity) {
        Session session = openSession();
        session.save(entity);
    }

    public T read(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        return entity;
    }

    public void update(T entity) {
        Session session = openSession();
        session.update(entity);
    }

    public void delete(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        session.delete(entity);
    }

    public List<T> getAll() {
        String nameClass = (aClass.getSimpleName());
        return openSession().createQuery("from " + nameClass).list();
    }

    public boolean add(List<T> items) {
        return false;
    }

    Session openSession() {
        return sessionFactory.getCurrentSession();
    }
}
