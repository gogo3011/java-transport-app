package entities.filters;

import entities.filters.BaseFilter;

public class TransportCompanyFilter extends BaseFilter {
    private String name;
    private long profitsHigherThan;
    private long profitsLowerThan;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getProfitsHigherThan() {
        return profitsHigherThan;
    }

    public void setProfitsHigherThan(long profitsHigherThan) {
        this.profitsHigherThan = profitsHigherThan;
    }

    public long getProfitsLowerThan() {
        return profitsLowerThan;
    }

    public void setProfitsLowerThan(long profitsLowerThan) {
        this.profitsLowerThan = profitsLowerThan;
    }
}
