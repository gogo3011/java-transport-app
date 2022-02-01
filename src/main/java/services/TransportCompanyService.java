package services;

import entities.Employee;
import entities.TransportCompany;
import entities.filters.TransportCompanyFilter;
import entities.Vehicle;
import repositories.EmployeeRepository;
import repositories.TransportCompanyRepository;
import repositories.VehicleRepository;
import utils.Validators;

import java.util.List;

public class TransportCompanyService {

    private TransportCompanyRepository transportCompanyRepository = new TransportCompanyRepository();
    private EmployeeRepository employeeRepository = new EmployeeRepository();
    private VehicleRepository vehicleRepository = new VehicleRepository();

    public TransportCompany save(TransportCompany transportCompany) {
        return transportCompanyRepository.save(transportCompany);
    }

    public TransportCompany createCompany(String name) {
        if (!Validators.validTransportCompanyName(name)) {
            throw new RuntimeException("Invalid company name");
        }
        TransportCompany transportCompany = new TransportCompany(name);
        return save(transportCompany);
    }

    public void addEmployeeToCompany(Employee employee, TransportCompany transportCompany) {
        employee = employeeRepository.save(employee);
        transportCompany.getEmployees().add(employee);
        transportCompanyRepository.save(transportCompany);
    }

    public void addVehicleToCompany(Vehicle vehicle, TransportCompany transportCompany) {
        vehicle = vehicleRepository.save(vehicle);
        transportCompany.getVehicles().add(vehicle);
        transportCompanyRepository.save(transportCompany);
    }

    public List<TransportCompany> list(TransportCompanyFilter filter) {
        return transportCompanyRepository.list(filter);
    }

    public void delete(TransportCompany toDelete) {
        transportCompanyRepository.delete(toDelete);
    }

    public void delete(int id) {
        transportCompanyRepository.delete(id);
    }
}
