package learning.playground;

public class RegEx_SplitWords {
    public static void main(String[] args) {
        // by space
        String sentence1 = "hello welcome to java reg exp testing";
        String[] words1 = sentence1.split("\\s");
        for (String word : words1) {
            System.out.println(word);    
        }
        // by digit
        String sentence2 = "1hello2welcome3to4java5reg6exp7testing";
        String[] words2 = sentence2.split("\\d");
        for (String word : words2) {
            System.out.println(word);
        }
    }
}
