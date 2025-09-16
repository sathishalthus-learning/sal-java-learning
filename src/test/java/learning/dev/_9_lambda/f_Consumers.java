package learning.dev._9_lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class f_Consumers {
    public static void main(String[] args) {
        // consumer
        Consumer<String> printer = s -> System.out.println(s);
        printer.accept("hello");

        Random newRandom = new Random(314L);
        for (int i = 0; i < 5; i++) {
            int nextRandom = newRandom.nextInt(100);
            printer.accept("next random = " + nextRandom);
        }

        // bi-consumer
        BiConsumer<Random, Integer> randomNumberPrinter = (random, number) -> {
            for (int i = 0; i < number; i++) {
                System.out.println("next random = " + random.nextInt(10));
            }
        };
        randomNumberPrinter.accept(new Random(314L), 5);

        // passing consumer to iterable
        List<String> strings = new ArrayList<String>();
        // really any list of any kind of objects
        Consumer<String> cprinter = s -> System.out.println(s);
        strings.forEach(cprinter);

    }
}
