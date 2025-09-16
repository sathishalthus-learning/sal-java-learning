package learning.dev._9_lambda;

import java.util.Random;
import java.util.function.Supplier;

public class e_Suppliers {
    public static void main(String[] args) {
        // simply return string
        Supplier<String> supplier = () -> "Hello Duke!";
        System.out.println(supplier.get());

        // diffrerent values each time
        Random random = new Random(314L);
        Supplier<Integer> newRandom = () -> random.nextInt(10);

        for (int index = 0; index < 5; index++) {
            System.out.println(newRandom.get() + " ");
        }

        // speciallised suppliers
        // IntSupplier, Long, Double, Boolean
        // getAsInt(), getAsBoolean(), getAsLong(), getAsDouble

    }
}
