package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="employees")
public class Employee implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private double salary;

    private Qualification qualification;

    public Employee() {
    }

    public Employee(String name, double salary, Qualification qualification) {
        this.name = name;
        this.salary = salary;
        this.qualification = qualification;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        if (id > 0)
            this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
