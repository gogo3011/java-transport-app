package services;

import entities.TransportCompany;
import entities.TransportCompanyFilter;
import repositories.EmployeeRepository;
import repositories.TransportCompanyRepository;

import java.util.List;
import java.util.stream.Collectors;

public class TransportCompanyService {

    TransportCompanyRepository transportCompanyRepository = new TransportCompanyRepository();
    EmployeeRepository employeeRepository = new EmployeeRepository();

    public void save(TransportCompany transportCompany) {
        transportCompany.setEmployees(
            transportCompany.getEmployees().stream().map(e -> employeeRepository.save(e)).collect(Collectors.toSet())
        );
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
