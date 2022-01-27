package repositories;

import entities.BaseFilter;
import entities.TransportCompany;
import entities.TransportCompanyFilter;
import entities.TransportCompany_;
import utils.EntityManagerCreator;
import utils.Utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TransportCompanyRepository extends JpaRepository<TransportCompany> {
    public TransportCompanyRepository() {
        super(EntityManagerCreator.getEntityManager(), TransportCompany.class);
    }

    public List<TransportCompany> list(TransportCompanyFilter filter) {
        return super.list(filter);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<TransportCompany> root) {
        List<Predicate> predicates = new ArrayList<>();
        TransportCompanyFilter tFilter = (TransportCompanyFilter) filter;
        Utils.addToListIfNotNull(predicates, createNamePredicate(cb, tFilter, root));
        Utils.addToListIfNotNull(predicates, createProfitsHigherThanPredicate(cb, tFilter, root));
        Utils.addToListIfNotNull(predicates, createProfitsLowerThanPredicate(cb, tFilter, root));
        return predicates;
    }

    private Predicate createNamePredicate(CriteriaBuilder cb, TransportCompanyFilter filter, Root<TransportCompany> root) {
        if (null != filter.getName()) {
            return cb.like(root.get(TransportCompany_.NAME), filter.getName());
        }
        return null;
    }

    private Predicate createProfitsHigherThanPredicate(CriteriaBuilder cb, TransportCompanyFilter filter, Root<TransportCompany> root) {
        if (filter.getProfitsHigherThan() > 0) {
            return cb.greaterThan(root.get(TransportCompany_.PROFITS), filter.getProfitsHigherThan());
        }
        return null;
    }

    private Predicate createProfitsLowerThanPredicate(CriteriaBuilder cb, TransportCompanyFilter filter, Root<TransportCompany> root) {
        if (filter.getProfitsLowerThan() > 0) {
            return cb.lessThan(root.get(TransportCompany_.PROFITS), filter.getProfitsLowerThan());
        }
        return null;
    }
}
