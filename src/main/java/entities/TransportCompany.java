package entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="transport_company")
public class TransportCompany implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String name;

    private long profits;

    @OneToMany
    private Set<Employee> employees;
    @OneToMany
    private Set<Vehicle> vehicles;
    @OneToMany
    private Set<Client> clients;

    public TransportCompany() {
    }

    public TransportCompany(String name) {
        this.name = name;
        this.employees = new HashSet<>();
        this.vehicles = new HashSet<>();
        this.clients = new HashSet<>();
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

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(Set<Employee> employees) {
        this.employees = employees;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(Set<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public long getProfits() {
        return profits;
    }

    public void setProfits(long profits) {
        this.profits = profits;
    }

    public Set<Client> getClients() {
        return clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    @Override
    public String toString() {
        return "TransportCompany{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", profits=" + profits +
                ", employees=" + employees +
                ", vehicles=" + vehicles +
                ", clients=" + clients +
                '}';
    }
}
