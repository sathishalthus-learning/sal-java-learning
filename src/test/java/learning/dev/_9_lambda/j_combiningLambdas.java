package learning.dev._9_lambda;

import java.util.Collection;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.logging.Logger;

public class j_combiningLambdas {
    public static void main(String[] args) {
        // chaining predicates
        // 1
        Predicate<String> nonNull = s -> s != null;
        Predicate<String> nonEmpty = s -> !s.isEmpty();
        Predicate<String> shorterThan5 = s -> s.length() < 5;
        Predicate<String> p1 = nonNull.and(nonEmpty).and(shorterThan5);
        p1.test("hell");
        // 2
        Predicate<String> p2 = s -> (s != null) && !s.isEmpty() && s.length() < 5;
        p2.test("hello");
        // 3
        Predicate<String> isNull = Objects::isNull;
        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNullOrEmpty = isNull.or(isEmpty);
        Predicate<String> isNotNullNorEmpty = isNullOrEmpty.negate();
        Predicate<String> lesserThan5 = s -> s.length() < 5;
        Predicate<String> p3 = isNotNullNorEmpty.and(lesserThan5);
        p3.test("hellooo");

        // factory methods
        // static methods
        Predicate<String> isEqualToDuke = Predicate.isEqual("Duke");
        Predicate<Collection<String>> isCollectionEmpty = Collection::isEmpty;
        Predicate<Collection<String>> isNotEmpty = Predicate.not(isCollectionEmpty);

        // default methods
        Logger logger = Logger.getLogger("MyApplicationLogger");
        Consumer<String> log = message -> logger.info(message);
        Consumer<String> print = message -> IO.println(message);

        Consumer<String> longAndPrint = log.andThen(print);

        // function chaining composing
        

    }
}
