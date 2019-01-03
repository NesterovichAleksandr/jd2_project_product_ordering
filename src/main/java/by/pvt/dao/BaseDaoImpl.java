package by.pvt.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.Serializable;
import java.util.List;

public abstract class BaseDaoImpl<T> {

    @Autowired
    SessionFactory sessionFactory;

/*    private Class<T> aClass;

    BaseDaoImpl(Class<T> aClass) {
        this.aClass = aClass;
    }

    public void create(T entity) {
        Session session = openSession();
        session.save(entity);
        session.getTransaction().commit();
    }

    public T read(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        session.getTransaction().commit();
        return entity;
    }

    public void update(T entity) {
        Session session = openSession();
        session.update(entity);
        session.getTransaction().commit();
    }

    public void delete(Serializable id) {
        Session session = openSession();
        T entity = session.get(aClass, id);
        session.delete(entity);
        session.getTransaction().commit();
    }*/

    public abstract List<T> find();

    public boolean add(List<T> items) {
        return false;
    }

    Session openSession() {
        return sessionFactory.getCurrentSession();
    }
}
