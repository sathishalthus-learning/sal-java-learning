package learning.javadoc.numbersAndStrings.strings;

public class c_WorkingCharacters {
    public static void main(String[] args) {
        String message = "hi, hello welcome to java";
        // getting a character
        char firstChar = message.charAt(0);
        System.out.println(firstChar);

        // getting substring
        String hi = message.substring(0, 2);
        System.out.println(hi);

        // spliting
        String[] stringArray = message.split(" ");
        for (String string : stringArray) {
            System.out.println(string);
        }
        char[] charArray =  message.toCharArray();
        for (char c : charArray) {
            System.out.println(c);
        }

        // trim,caseConversion
        System.out.println("    hello   ".trim());
        System.out.println("welcome".toUpperCase());

        // searching
        // indexOf() char/str, contains() chars

        // replacing
        // replace() chars, strs, regex
    }
}
