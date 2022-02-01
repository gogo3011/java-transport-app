package utils;

public class Validators {
    public static boolean validTransportCompanyName(String name) {
        return null != name && name.length() > 1;
    }

    public static boolean validClientName(String name) {
        return null != name && name.length() > 3;
    }
}
