package services;

import entities.TransportCompany;
import entities.Vehicle;
import entities.filters.BaseFilter;
import repositories.VehicleRepository;

import java.util.List;

public class VehicleService {
    private VehicleRepository repository = new VehicleRepository();

    public List<Vehicle> list(BaseFilter filter) {
        return repository.list(filter);
    }

    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);
    }

    public Vehicle createVehicle(String model, String registrationNumber, TransportCompany transportCompany) {
        Vehicle vehicle = new Vehicle(model, registrationNumber, transportCompany);
        return repository.save(vehicle);
    }

    public void delete(Vehicle vehicle) {
        repository.delete(vehicle);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}
