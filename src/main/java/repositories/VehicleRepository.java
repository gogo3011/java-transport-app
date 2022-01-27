package repositories;

import entities.BaseFilter;
import entities.Vehicle;
import utils.EntityManagerCreator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class VehicleRepository extends JpaRepository<Vehicle>{
    public VehicleRepository() {
        super(EntityManagerCreator.getEntityManager(), Vehicle.class);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Vehicle> root) {
        return new ArrayList<>();
    }
}
