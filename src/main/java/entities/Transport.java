package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="transport")
public class Transport implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String destination;

    private String cost;

    @OneToOne
    private Employee employee;
    @OneToOne
    private Client client;

    private boolean paid;

    public Transport() {
    }

    public Transport(long id, String destination, String cost, Employee employee, Client client) {
        this.id = id;
        this.destination = destination;
        this.cost = cost;
        this.employee = employee;
        this.client = client;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return id == transport.id && Objects.equals(destination, transport.destination) && Objects.equals(cost, transport.cost)
                && Objects.equals(employee, transport.employee) && Objects.equals(client, transport.client);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, cost, employee, client);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", cost='" + cost + '\'' +
                ", employee=" + employee +
                ", client=" + client +
                '}';
    }
}
