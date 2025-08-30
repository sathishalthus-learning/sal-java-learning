package learning.dev.collections;

import java.util.HashMap;
import java.util.Map;

public class g_LambdasAndCollections {
    public static void main(String[] args) {
        //
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        // foreach
        map.forEach((key, value) -> System.out.println(key + " :: " + value));
        map.forEach((key, value) -> {
            System.out.println(key);
            System.out.println(value);
        });

        // replaceall
        map.replaceAll((key, value) -> value.toUpperCase());
        map.forEach((key, value) -> System.out.println(key + " :: " + value));

        // compute

        // merge

    }
}
