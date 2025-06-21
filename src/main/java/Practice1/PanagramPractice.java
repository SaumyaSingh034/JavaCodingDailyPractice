package Practice1;

import java.util.Arrays;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PanagramPractice {

    public static void main(String[] args){
        String sentence = "The quick brown fox jumps over the lazy dog";
        checkPanagram(sentence);
    }

    private static void checkPanagram(String sentence) {
        String Alphabet = "abcdefghijklmnopqrstuvwxyz";
       String s = sentence.toLowerCase().replaceAll(" ","");
       SortedSet<Character> data = new TreeSet<>();
       for(int i=0;i<Alphabet.length();i++){
           data.add(Alphabet.charAt(i));
       }
       for(int i=0;i<sentence.length();i++){
           data.remove(sentence.charAt(i));
       }
       StringBuilder result = new StringBuilder();
       for(Character c : data){
           result.append(c.charValue());
       }

       System.out.println(result.toString());

    }
}
