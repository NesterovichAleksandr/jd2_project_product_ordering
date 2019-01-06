package by.pvt.service;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T, PK extends Serializable> {

    void create(T entity);

    T read(PK id);

    void update(T entity);

    void delete(PK id);

    List<T> getAll();
}
