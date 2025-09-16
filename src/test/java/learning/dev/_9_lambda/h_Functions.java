package learning.dev._9_lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;

public class h_Functions {
    public static void main(String[] args) {
        //
        // Unary operators
        // changes the list, not the type
        List<String> strings = Arrays.asList("one", "two", "three");
        UnaryOperator<String> toUpperCase = word -> word.toUpperCase();
        strings.replaceAll(toUpperCase);
        System.out.println(strings);
        //bifunction
        

        // binary operatorss


    }
}
