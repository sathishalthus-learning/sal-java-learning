package learning.dev.collections;

import java.util.HashMap;
import java.util.Map;

public class f_Maps {
    public static void main(String[] args) {
        // A hashmap can store key-value pairs
        // A key is a simple object, a value can be as complex as needed
        // hashmap, sortedmap, navigablemap
        // factory methods
        Map<Integer, String> map1 = Map.of(
                1, "one",
                2, "two",
                3, "three");
                System.out.println(map1);

        Map<Integer, String> map3 = Map.ofEntries(
                Map.entry(1, "one"),
                Map.entry(2, "two"),
                Map.entry(3, "three"));
        System.out.println(map3);

        // get, put
        // putIfabsent
        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", null);
        map.put("three", 3);
        map.put("four", null);
        map.put("five", 5);

        for (int value : map.values()) {
            System.out.println("value = " + value);
        }
        // containsvalue, containskey
        // keyset, entryset, values

    }
}
