package repositories;

import entities.*;
import utils.EntityManagerCreator;
import utils.Utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class TransportRepository extends JpaRepository<Transport>{
    public TransportRepository() {
        super(EntityManagerCreator.getEntityManager(), Transport.class);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Transport> root) {
        List<Predicate> predicates = new ArrayList<>();
        TransportFilter tFilter = (TransportFilter) filter;
        Utils.addToListIfNotNull(predicates, createDestinationPredicate(cb, tFilter, root));
        return predicates;
    }

    private Predicate createDestinationPredicate(CriteriaBuilder cb, TransportFilter tFilter, Root<Transport> root) {
        if (null != tFilter.getDestination()) {
            return cb.like(root.get(Transport_.DESTINATION), tFilter.getDestination());
        }
        return null;
    }
}
