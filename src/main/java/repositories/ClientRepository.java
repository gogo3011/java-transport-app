package repositories;

import entities.BaseFilter;
import entities.Client;
import utils.EntityManagerCreator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ClientRepository extends JpaRepository<Client>{
    public ClientRepository() {
        super(EntityManagerCreator.getEntityManager(), Client.class);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Client> root) {
        return new ArrayList<>();
    }
}
