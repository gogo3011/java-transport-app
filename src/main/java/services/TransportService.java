package services;

import entities.*;
import entities.Package;
import entities.filters.TransportFilter;
import repositories.TransportRepository;

import java.util.List;

public class TransportService {
    private TransportRepository transportRepository = new TransportRepository();

    public List<Transport> list(TransportFilter transportFilter) {
        return transportRepository.list(transportFilter);
    }

    public Transport createNewTransport(Client sender, Client receiver, String destination,
                                        Double cost, TransportCompany transportCompany, Employee employee, Package aPackage) {
        Transport transport = new Transport(destination, cost, employee, sender, receiver, transportCompany, false);
        transport.setaPackage(aPackage);
        return save(transport);
    }

    public Transport payTransport(Transport transport) {
        transport.setPaid(true);
        return save(transport);
    }

    public Transport save(Transport transport) {
        return transportRepository.save(transport);
    }

    public void delete(Transport transport) {
        transportRepository.delete(transport);
    }

    public void delete(int id) {
        transportRepository.delete(id);
    }
}
