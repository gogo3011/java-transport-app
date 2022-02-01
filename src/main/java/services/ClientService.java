package services;

import entities.Client;
import entities.filters.ClientFilter;
import repositories.ClientRepository;
import utils.Validators;

import java.util.List;

public class ClientService {
    private ClientRepository repository = new ClientRepository();

    public List<Client> list(ClientFilter clientFilter) {
        return repository.list(clientFilter);
    }

    public Client createClient(String name) {
        if (!Validators.validClientName(name)) {
            throw new RuntimeException("Invalid client name");
        }
        Client client = new Client();
        client.setName(name);
        return save(client);
    }

    public Client save(Client client) {
        return repository.save(client);
    }

    public void delete(Client client) {
        repository.delete(client);
    }

    public void delete(int id) {
        repository.delete(id);
    }
}
