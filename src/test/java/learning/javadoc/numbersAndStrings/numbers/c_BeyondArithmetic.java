package learning.javadoc.numbersAndStrings.numbers;

public class c_BeyondArithmetic {

    public static void main(String[] args) {
        // Math Class
        // all static methods

        // values from Math Class
        double pi = Math.PI;
        System.out.println(pi);
        // basic math
        System.out.println(Math.round(2));
        System.out.println(Math.abs(2.345));
        System.out.println(Math.max(2, 3));
        // logarithmic
        System.out.println(Math.exp(2));
        System.out.println(Math.pow(2, 2));
        System.out.println(Math.sqrt(3));
        // trignometric
        System.out.println(Math.sin(2));
        // random
        int number = (int) Math.random();
        System.out.println(number);
    }

}
