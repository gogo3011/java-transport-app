package repositories;

import entities.BaseEntity;
import entities.BaseFilter;
import entities.Client_;
import repositories.base.DataRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.List;

public class JpaRepository<T extends BaseEntity> implements DataRepository<T> {

    private EntityManager manager;

    private Class<T> entityClass;


    public JpaRepository(EntityManager manager, Class<T> entityClass) {
        this.manager = manager;
        this.entityClass = entityClass;
    }

    @Override
    public void add(T entity) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        manager.persist(entity);
        transaction.commit();
    }

    @Override
    public void delete(T entity) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        if(!manager.contains(entity)){
            entity = manager.merge(entity);
        }
        manager.remove(entity);
        transaction.commit();
    }

    @Override
    public void update(T entity) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        if (!manager.contains(entity)) {
            entity = manager.merge(entity);
        }
        manager.persist(entity);
        transaction.commit();
    }

    @Override
    public void delete(int id) {
        delete(find(id));
    }

    @Override
    public T find(int id) {
        T entity = manager.find(entityClass, id);
        return entity;
    }

    @Override
    public List<T> listAll() {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery = builder.createQuery(entityClass);
        criteriaQuery.from(entityClass);
        List<T> entities = manager.createQuery(criteriaQuery).getResultList();
        return entities;
    }

    @Override
    public List<T> list(BaseFilter filter) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        return null;
    }

    public void buildPredicates(CriteriaBuilder cb, BaseFilter filter) {
        CriteriaQuery<T> criteriaQuery = cb.createQuery(entityClass);
    }
}
