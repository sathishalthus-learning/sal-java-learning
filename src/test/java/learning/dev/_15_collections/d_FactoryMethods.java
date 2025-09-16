package learning.dev._15_collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class d_FactoryMethods {
    public static void main(String[] args) {
        // immutable collections
        List<String> stringList = List.of("one", "two", "three");
        Set<String> stringSet = Set.of("one", "two", "three");

        // immutable copy
        Collection<String> strings = Arrays.asList("one", "two", "three");
        List<String> list = List.copyOf(strings);
        Set<String> set = Set.copyOf(strings);

        // collections factory class

        System.out.println(stringList);
        System.out.println(stringSet);
        System.out.println(list);
        System.out.println(set);

    }
}
