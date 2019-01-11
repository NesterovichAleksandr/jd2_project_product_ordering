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

    @Transactional(propagation = Propagation.REQUIRES_NEW, isolation = Isolation.REPEATABLE_READ)
    public void create(T entity) {
        log.info("create(): " + entity);
        dao.create(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW, readOnly = true)
    public T read(PK id) {
        log.info("read(): id=" + id + "\t: " + getClass());
        return dao.read(id);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void update(T entity) {
        log.info("update(): " + entity);
        dao.update(entity);
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void delete(PK id) {
        log.info("delete(): id=" + id + "\t: " + getClass());
        dao.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, readOnly = true)
    public List<T> getAll() {
        log.info("getAll(): " + dao.getAll() + "\t: " + getClass());
        return dao.getAll();
    }
}
