package learning.javadoc.numbersAndStrings.strings;

public class e_StringBuilders {
    public static void main(String[] args) {
        // same as string except modifiable
        // teated like an array internally
        // length, capacity

        StringBuilder sb = new StringBuilder();
        sb.append("anything");
        System.out.println(sb);
        //length
        System.out.println(sb.length());
        sb.setLength(10);
        System.out.println(sb.length());

        // operations
        // append() anything, delete(),  insert()
        // replace(), reverse()
        // toString()

    }
}
