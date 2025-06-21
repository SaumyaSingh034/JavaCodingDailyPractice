package CodePadQuestions;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Panagram {
    /**
     * Pangram FInder
     * <p>
     * The sentence "The quick brown fox jumps over the lazy dog" contains
     * every single letter in the alphabet. Such sentences are called pangrams.
     * Write a function findMissingLetters, which takes a String `sentence`,
     * and returns all the letters it is missing
     */

    private static class PanagramDetector {
        private static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

        public String findMissingLetters(String sentence) {
            String word = sentence.replaceAll(" ", "");
            SortedSet<Character> unique = new TreeSet<>();
            StringBuilder result = new StringBuilder();
            for(char c : word.toLowerCase().toCharArray()){
                if(unique.add(c)){
                    result.append(c);
                }
            }
            char[] ch = result.toString().toCharArray();
            Arrays.sort(ch);
            String sorted = new String(ch);
            return sorted;
        }

    }

    public static void main(String[] args) {
        PanagramDetector pd = new PanagramDetector();
        boolean success = true;

        success = success && "".equals(pd.findMissingLetters("The quick brown fox jumps over the lazy dog"));
        success = success && "abcdefghijklmnopqrstuvwxyz".equals(pd.findMissingLetters(""));

        if (success) {
            System.out.println("Pass ");
        } else {
            System.out.println("Failed");
        }
}
}
