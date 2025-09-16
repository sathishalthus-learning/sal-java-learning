package learning.javadoc.numbersAndStrings.strings;

public class b_Conversions {
    public static void main(String[] args) {
        // strings to numbers
        // valueOf(), parseXXXX()
        String a="10", b="12";
        float valueOfA = Float.valueOf(a);
        float valueOfB = Float.parseFloat(b);
        System.out.println(valueOfA+valueOfB);

        // numbers to strings
        // valueOf(), toString()
        int i1 = 123, i2=321;
        String i1String = Integer.toString(i1);
        System.out.println(i1String);
        String i2String = String.valueOf(i2);
        System.out.println(i2String);
    }
}
