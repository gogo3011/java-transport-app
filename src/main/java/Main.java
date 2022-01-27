import entities.*;
import services.TransportCompanyService;
import utils.EntityManagerCreator;

import java.util.HashSet;

public class Main {
    public static void main(String... args) {
        EntityManagerCreator.initializeEntityManager("transport-app");
        Employee emp = new Employee("Nasko", 200.0, Qualification.DESK);
        TransportCompany company = new TransportCompany("Econt");
        HashSet<Employee> employees = new HashSet<>();
        employees.add(emp);
        company.setEmployees(employees);
        TransportCompanyService service = new TransportCompanyService();
        service.save(company);
        TransportCompanyFilter filter = new TransportCompanyFilter();
        filter.setName("Econt");
        System.out.println(service.list(filter));
    }
}
