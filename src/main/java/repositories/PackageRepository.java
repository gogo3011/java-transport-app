package repositories;

import entities.BaseFilter;
import entities.Package;
import utils.EntityManagerCreator;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PackageRepository extends JpaRepository<Package> {
    public PackageRepository() {
        super(EntityManagerCreator.getEntityManager(), Package.class);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Package> root) {
        return new ArrayList<>();
    }
}
