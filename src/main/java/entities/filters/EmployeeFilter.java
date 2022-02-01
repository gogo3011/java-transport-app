package entities.filters;

import entities.Qualification;
import entities.filters.BaseFilter;

public class EmployeeFilter extends BaseFilter {
    private double salaryHigherThan;
    private double salaryLowerThan;
    private Qualification qualification;

    public double getSalaryHigherThan() {
        return salaryHigherThan;
    }

    public void setSalaryHigherThan(double salaryHigherThan) {
        this.salaryHigherThan = salaryHigherThan;
    }

    public double getSalaryLowerThan() {
        return salaryLowerThan;
    }

    public void setSalaryLowerThan(double salaryLowerThan) {
        this.salaryLowerThan = salaryLowerThan;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }
}
