package repositories;

import entities.*;
import entities.filters.BaseFilter;
import entities.filters.EmployeeFilter;
import utils.EntityManagerCreator;
import utils.Utils;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository extends JpaRepository<Employee> {
    public EmployeeRepository() {
        super(EntityManagerCreator.getEntityManager(), Employee.class);
    }

    public List<Employee> list(EmployeeFilter filter) {
        return super.list(filter);
    }

    @Override
    protected List<Predicate> buildPredicates(CriteriaBuilder cb, BaseFilter filter, Root<Employee> root) {
        List<Predicate> predicates = new ArrayList<>();
        EmployeeFilter eFilter = (EmployeeFilter) filter;
        Utils.addToListIfNotNull(predicates, createQualificationPredicate(cb, eFilter, root));
        Utils.addToListIfNotNull(predicates, createSalaryHigherThanPredicate(cb, eFilter, root));
        Utils.addToListIfNotNull(predicates, createSalaryLowerThanPredicate(cb, eFilter, root));
        return predicates;
    }

    private Predicate createQualificationPredicate(CriteriaBuilder cb, EmployeeFilter eFilter, Root<Employee> root) {
        if (null != eFilter.getQualification()) {
            return cb.equal(root.get(Employee_.QUALIFICATION), eFilter.getQualification());
        }
        return null;
    }

    private Predicate createSalaryHigherThanPredicate(CriteriaBuilder cb, EmployeeFilter eFilter, Root<Employee> root) {
        if (eFilter.getSalaryHigherThan() > 0) {
            return cb.greaterThan(root.get(Employee_.SALARY), eFilter.getSalaryHigherThan());
        }
        return null;
    }

    private Predicate createSalaryLowerThanPredicate(CriteriaBuilder cb, EmployeeFilter eFilter, Root<Employee> root) {
        if (eFilter.getSalaryLowerThan() > 0) {
            return cb.lessThan(root.get(Employee_.SALARY), eFilter.getSalaryLowerThan());
        }
        return null;
    }
}
