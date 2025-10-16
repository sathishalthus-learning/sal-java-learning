package learning.dev._15_collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class h_ComparatorAndCollections {
    public static void main(String[] args) {
        //
        List<String> strings = Arrays.asList("one", null, "two", "three", null, null, "four", "five");
        Comparator<String> naturalNullsLast = Comparator.nullsLast(Comparator.naturalOrder());
        strings.sort(naturalNullsLast);
        System.out.println(strings);

        

    }
}
