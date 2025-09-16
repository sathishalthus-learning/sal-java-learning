package learning.dev._9_lambda;

import java.util.function.Consumer;
import java.util.function.DoubleUnaryOperator;
import java.util.function.Function;

public class i_method_reference {
    
    public static void main(String[] args) {

        // static, bound, unbound, constructor
        // Consumer<String> printer = System.out::println;
        
        // static
        DoubleUnaryOperator sqrt = Math::sqrt;
        System.out.println(sqrt.applyAsDouble(2));

        // unbound
         Function<String, Integer> toLength = String::length;
         System.out.println(toLength.apply("hello"));

        // bound
        Consumer<String> printer = System.out::println;
        printer.accept("anything");

        // constructor
        

    }
}
