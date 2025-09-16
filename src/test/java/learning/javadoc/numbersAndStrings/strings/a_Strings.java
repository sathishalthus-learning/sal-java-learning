package learning.javadoc.numbersAndStrings.strings;

public class a_Strings {
    public static void main(String[] args) {
        // creating strings
        String greeting = "Hello world!";
        System.out.println(greeting);

        char[] helloArray = { 'h', 'e', 'l', 'l', 'o' };
        String hello = new String(helloArray);
        System.out.println(hello);

        // string length
        int greetingLength = greeting.length();
        int helloLength = hello.length();
        System.out.println(greetingLength + " , " + helloLength);

        // concat strings
        String helloJava = hello.concat(" Java");
        System.out.println(helloJava);

        String welcomeHelloJava = "Welcome ".concat(helloJava);
        System.out.println(welcomeHelloJava);

        // format string
        String fs;
        fs = String.format("The value of the float " +
                "variable is %f, while " +
                "the value of the " +
                "integer variable is %d, " +
                " and the string is %s",
                10.0, 10, "10.000");
        System.out.println(fs);

    }
}
