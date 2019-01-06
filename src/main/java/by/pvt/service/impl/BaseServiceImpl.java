package by.pvt.service.impl;

import by.pvt.dao.BaseDao;
import by.pvt.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public abstract class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK> {

    private BaseDao<T, PK> dao;

    @Autowired
    public BaseServiceImpl(BaseDao<T, PK> dao) {
        this.dao = dao;
    }

    public void create(T entity) {
        dao.create(entity);
    }

    public T read(PK id) {
        return dao.read(id);
    }

    public void update(T entity) {
        dao.update(entity);
    }

    public void delete(PK id) {
        dao.delete(id);
    }

    public List<T> getAll() {
        return dao.getAll();
    }
}
