package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;
import java.util.logging.Logger;

@Service
@Transactional
public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    private static Logger log = Logger.getLogger(BaseServiceImpl.class.getName());

    private BaseDao<T, PK> dao;

    @Autowired
    public BaseServiceImpl(BaseDao<T, PK> dao) {
        this.dao = dao;
    }

    @Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.REPEATABLE_READ)
    public void create(T entity) {
        log.info(getClass() + " create(): \n" + entity);
        dao.create(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public T read(PK id) {
        T entity = dao.read(id);
        log.info(getClass() + " read(): " + "\n" + entity);
        return entity;
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void update(T entity) {
        log.info(getClass() + " update(): \n" + entity);
        dao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void delete(PK id) {
        log.info(getClass() + " delete(): id=" + id);
        dao.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<T> getAll() {
        List<T> list = dao.getAll();
        log.info(getClass() + " getAll(): \n" + list);
        return list;
    }
}
