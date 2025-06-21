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
            SortedSet<Character> missing = new TreeSet<>();
            for(int i=0;i<ALPHABET.length();i++){
                missing.add(ALPHABET.charAt(i));
            }
            String s = sentence.toLowerCase();

            for(int i=0;i<s.length();i++){
                missing.remove(s.charAt(i));
            }
            StringBuilder sb = new StringBuilder();
            for(Character c : missing){
                sb.append(c.charValue());
            }
            return sb.toString();
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
