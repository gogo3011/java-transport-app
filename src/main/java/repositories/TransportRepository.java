package repositories;

import entities.*;
import entities.filters.BaseFilter;
import entities.filters.TransportFilter;
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
        Utils.addToListIfNotNull(predicates, createReceiverPredicate(cb, tFilter, root));
        Utils.addToListIfNotNull(predicates, createSenderPredicate(cb, tFilter, root));
        return predicates;
    }

    private Predicate createDestinationPredicate(CriteriaBuilder cb, TransportFilter tFilter, Root<Transport> root) {
        if (null != tFilter.getDestination()) {
            return cb.like(root.get(Transport_.DESTINATION), tFilter.getDestination());
        }
        return null;
    }

    private Predicate createReceiverPredicate(CriteriaBuilder cb, TransportFilter tFilter, Root<Transport> root) {
        if (null != tFilter.getReceiver()) {
            return cb.equal(root.get(Transport_.RECEIVER), tFilter.getReceiver());
        }
        return null;
    }

    private Predicate createSenderPredicate(CriteriaBuilder cb, TransportFilter tFilter, Root<Transport> root) {
        if (null != tFilter.getReceiver()) {
            return cb.equal(root.get(Transport_.SENDER), tFilter.getSender());
        }
        return null;
    }
}
