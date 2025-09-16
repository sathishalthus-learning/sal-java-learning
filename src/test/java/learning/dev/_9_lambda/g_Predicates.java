package learning.dev._9_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class g_Predicates {
    public static void main(String[] args) {
        //
        Predicate<String> length3 = s -> s.length() == 3;
        String word = "any word";
        boolean isOfLength3 = length3.test(word);
        System.out.println("Is of length 3? " + isOfLength3);

        // specialized predicates

        // bipredicate

        // passing predicate to collection
        List<String> immutableStrings = List.of("one", "two", "three", "four", "five");
        List<String> strings = new ArrayList<>(immutableStrings);
        Predicate<String> isEvenLength = s -> s.length() % 2 == 0;
        strings.removeIf(isEvenLength);
        System.out.println("strings = " + strings);

    }
}
