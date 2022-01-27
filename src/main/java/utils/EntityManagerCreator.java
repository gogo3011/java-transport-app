package utils;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

public class EntityManagerCreator {
    private static EntityManager em;

    public static void initializeEntityManager(String persistenceUnitName) {
        if (em == null) {
            em = Persistence.createEntityManagerFactory("transport-app").createEntityManager();
        }
        else {
            throw new RuntimeException("Entity Manager already initialized! Use getEntityManager()");
        }
    }

    public static EntityManager getEntityManager() {
        return em;
    }
}
