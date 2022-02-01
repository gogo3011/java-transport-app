import utils.EntityManagerCreator;

public class App {
    public static void bootstrapApp() {
        EntityManagerCreator.initializeEntityManager("transport-app");
    }
}
