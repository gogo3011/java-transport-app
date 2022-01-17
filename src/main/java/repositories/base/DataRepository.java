package repositories.base;

import entities.BaseEntity;
import entities.BaseFilter;

import java.util.List;

public interface DataRepository<T extends BaseEntity> {
    void add(T entity);
    void delete(T entity);
    void delete(int id);
    void update(T entity);
    List<T> listAll();
    List<T> list(BaseFilter filter);
    T find(int id);
}
