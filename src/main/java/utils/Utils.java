package utils;

import java.util.List;

public class Utils {
    public static <T> void addToListIfNotNull(List<T> list, T el) {
        if (el != null) {
            list.add(el);
        }
    }
}
