package repositories.base;

import entities.BaseEntity;
import entities.filters.BaseFilter;

import java.util.List;

public interface DataRepository<T extends BaseEntity> {
    T save(T entity);
    void delete(T entity);
    void delete(int id);
    List<T> list(BaseFilter filter);
    long count(BaseFilter filter);
    T find(int id);
}
