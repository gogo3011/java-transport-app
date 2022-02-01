package entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name="transport")
public class Transport implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String destination;

    private double cost;

    @OneToOne
    private Employee employee;
    @OneToOne
    private Client sender;
    @OneToOne
    private Client receiver;
    @OneToOne
    private Package aPackage;
    @ManyToOne
    @JoinColumn(name="company_id")
    private TransportCompany transportCompany;

    private Date dateSent;
    private Date dateReceived;

    private boolean paid;

    public Transport() {
    }

    public Transport(long id, String destination, double cost, Employee employee, Client sender) {
        this.id = id;
        this.destination = destination;
        this.cost = cost;
        this.employee = employee;
        this.sender = sender;
    }

    public Transport(String destination, double cost, Employee employee, Client sender, Client receiver, TransportCompany transportCompany, boolean paid) {
        this.destination = destination;
        this.cost = cost;
        this.employee = employee;
        this.sender = sender;
        this.receiver = receiver;
        this.transportCompany = transportCompany;
        this.paid = paid;
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

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Client getSender() {
        return sender;
    }

    public void setSender(Client client) {
        this.sender = client;
    }

    public Client getReceiver() {
        return receiver;
    }

    public void setReceiver(Client receiver) {
        this.receiver = receiver;
    }

    public boolean isPaid() {
        return paid;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    public TransportCompany getTransportCompany() {
        return transportCompany;
    }

    public void setTransportCompany(TransportCompany transportCompany) {
        this.transportCompany = transportCompany;
    }

    public Package getaPackage() {
        return aPackage;
    }

    public void setaPackage(Package aPackage) {
        this.aPackage = aPackage;
    }

    public Date getDateSent() {
        return dateSent;
    }

    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date dateReceived) {
        this.dateReceived = dateReceived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport transport = (Transport) o;
        return id == transport.id && Objects.equals(destination, transport.destination) && Objects.equals(cost, transport.cost)
                && Objects.equals(employee, transport.employee) && Objects.equals(sender, transport.sender) && Objects.equals(receiver, transport.receiver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, destination, cost, employee, sender);
    }

    @Override
    public String toString() {
        return "Transport{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", cost='" + cost + '\'' +
                ", employee=" + employee +
                ", client=" + sender +
                '}';
    }
}
