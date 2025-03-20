package HashSet;

import java.util.HashSet;

public class UniqueWords {
    public static void main(String[] args) {
        String sentence = "Java is a unique Java programming language";

        String[] words = sentence.split(" ");

        HashSet<String> uw = new HashSet<>();

        for (String word : words) {
            uw.add(word);
        }

        System.out.println("Unique words:");
        for (String word : uw) {
            System.out.println(word);
        }
    }
}
