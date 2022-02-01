import entities.*;
import services.TransportCompanyService;

public class Main {

    public static void main(String... args) {
        App.bootstrapApp();
        TransportCompanyService transportCompanyService = new TransportCompanyService();
        TransportCompany company = transportCompanyService.createCompany("DHL");

    }
}
