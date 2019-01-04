package by.pvt.dao;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T, PK extends Serializable> {

    void create(T entity);

    T read(PK id);

    void update(T entity);

    void delete(PK id);

    List<T> getAll();
}
