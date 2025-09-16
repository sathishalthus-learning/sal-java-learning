package learning.dev._16_steam;

import java.util.HashMap;
// import java.util.List;
import java.util.Map;
// import java.util.stream.Stream;

public class d_MapStream {
    public static void main(String[] args) {
        //
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "four");

        // keys
        map.keySet().stream().forEach(key->System.out.println(key));
        // values
        map.values().stream().forEach(value->System.out.println(value));
        // entry
        map.entrySet().stream().forEach(entry-> System.out.println(entry.getKey()));
        

    }
}
