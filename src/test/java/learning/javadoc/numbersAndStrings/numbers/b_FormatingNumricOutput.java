package learning.javadoc.numbersAndStrings.numbers;

public class b_FormatingNumricOutput {

    public static void main(String[] args) {

    // Formatting
        // arbitary mixture of strings and numbers
        // printStream class  offers 2 methods
        System.out.format("The value of " + "the float variable is " +
        "%f, while the value of the " + "integer variable is %d, " +
        "and the string is %s", 10.00, 10, 10); 

        // (Locale.FRANCE,%-+,08.3f)
            // refer table for options
        System.out.printf("%n %f", 123.4);

        //decimal format class
            // refer table for options
        
    }

}
