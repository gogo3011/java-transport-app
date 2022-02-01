package repositories;

import entities.Client_;
import entities.Employee;
import entities.Employee_;
import entities.filters.BaseFilter;
import entities.Client;
import entities.filters.ClientFilter;
import entities.filters.EmployeeFilter;
import utils.EntityManagerCreator;
import utils.Utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository extends JpaRepository<Client>{
    public ClientRepository() {
        super(EntityManagerCreator.getEntityManager(), Client.class);
    }

    public List<Client> list(ClientFilter filter) {
        return super.list(filter);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Client> root) {
        List<Predicate> predicates = new ArrayList<>();
        ClientFilter cFilter = (ClientFilter) filter;
        Utils.addToListIfNotNull(predicates, createNamePredicate(cb, cFilter, root));
        return new ArrayList<>();
    }

    private Predicate createNamePredicate(CriteriaBuilder cb, ClientFilter cFilter, Root<Client> root) {
        if (null != cFilter.getName()) {
            return cb.like(root.get(Client_.NAME), cFilter.getName());
        }
        return null;
    }
}
