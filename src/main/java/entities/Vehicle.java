package entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="vehicles")
public class Vehicle implements BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String model;

    private String registrationNumber;

    @ManyToOne
    @JoinColumn(name="company_id")
    private TransportCompany transportCompany;

    public Vehicle() {
    }

    public Vehicle(String model, String registrationNumber, TransportCompany transportCompany) {
        this.model = model;
        this.registrationNumber = registrationNumber;
        this.transportCompany = transportCompany;
    }

    public Vehicle(long id, String model, String registrationNumber) {
        this.id = id;
        this.model = model;
        this.registrationNumber = registrationNumber;
    }

    @Override
    public long getId() {
        return id;
    }

    @Override
    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vehicle vehicle = (Vehicle) o;
        return id == vehicle.id && Objects.equals(registrationNumber, vehicle.registrationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, registrationNumber);
    }
}
