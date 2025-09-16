package learning.dev._16_steam;

import java.util.Arrays;
// import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class b_CreatingStream {
    public static void main(String[] args) {
        // an empty stream
        Stream<Integer> emptyStream = Stream.empty();
        List<Integer> strings = emptyStream.toList();
        System.out.println("empty string : " + strings);

        // from vararg
        Stream<Integer> inStream = Stream.of(1, 2, 3, 4);
        List<Integer> ints = inStream.toList();
        System.out.println("ints : " + ints);

        // from array
        String[] stringArray = { "one", "two", "three" };
        Stream<String> stringStream = Arrays.stream(stringArray);
        List<String> strings2 = stringStream.toList();
        System.out.println("string stream" + strings2);

        // from Supplier
        Stream<String> generated = Stream.generate(() -> "+");
        List<String> strings3 = generated.limit(5L).toList();
        System.out.println("strings = " + strings3);

        // from a UnaryOperator and a Seed
        Stream<String> iterated = Stream.iterate("+", s -> s + "+");
        iterated.limit(5L).forEach(System.out::println);

        //....
        
    }
}
