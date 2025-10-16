package learning.dev._18_regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class c_CharacterClass {
    public static void main(String[] args) {

        String sentenceString = "1crazy2fox3jumpsoooo4over5the6brown7cat";
        String input = "cat";

        //static pattern
        Pattern p1 = Pattern.compile("cat");
        Matcher m1 = p1.matcher(input);
        Matcher m2 = p1.matcher(sentenceString);
        System.out.println(m1.matches() +" and "+m2.matches());

        //dynamic patterns
        Pattern p2 = Pattern.compile("[a-z][0-9]");
        Matcher m3 = p2.matcher(sentenceString);
        System.out.println(m3.matches());

    }

}
