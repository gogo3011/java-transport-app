package repositories;

import entities.BaseEntity;
import entities.BaseFilter;
import repositories.base.DataRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public abstract class JpaRepository<T extends BaseEntity> implements DataRepository<T> {

    private EntityManager manager;

    private Class<T> entityClass;

    public JpaRepository(EntityManager manager, Class<T> entityClass) {
        this.manager = manager;
        this.entityClass = entityClass;
    }

    @Override
    public T save(T entity) {
        EntityTransaction transaction = manager.getTransaction();
        transaction.begin();
        if (!manager.contains(entity)) {
            entity = manager.merge(entity);
        }
        manager.persist(entity);
        transaction.commit();
        return entity;
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
    public void delete(int id) {
        delete(find(id));
    }

    @Override
    public T find(int id) {
        return manager.find(entityClass, id);
    }

    @Override
    public List<T> list(BaseFilter filter) {
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        CriteriaQuery<T> cq = cb.createQuery(entityClass);
        Root<T> root = cq.from(entityClass);
        Predicate[] predicates = buildPredicates(cb, filter, root).toArray(new Predicate[]{});
        cq.where(predicates);
        TypedQuery<T> tq = manager.createQuery(cq);
        createPaginationQueries(tq, filter);
        return tq.getResultList();
    }

    @Override
    public long count(BaseFilter filter) {
        CriteriaBuilder cb = manager.getCriteriaBuilder();
        CriteriaQuery<Long> cq = cb.createQuery(Long.class);
        cq.select(cb.count(cq.from(entityClass)));
        return manager.createQuery(cq).getSingleResult();
    }

    protected abstract List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<T> root);

    private void createPaginationQueries(TypedQuery<T> tq, BaseFilter filter) {
        if (filter.getPageNumber() == null) {
            filter.setPageNumber(1);
        }
        if (filter.getPageSize() == null) {
            filter.setPageSize(10);
        }
        tq.setFirstResult((filter.getPageNumber() - 1) * filter.getPageSize());
        tq.setMaxResults(filter.getPageSize());
    }
}
