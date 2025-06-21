package Practice1;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class PanagramPractice {

    public static void main(String[] args){
        String sentence = "The quick brown fox jumps over the lazy dog";
        checkPanagram(sentence);
    }

    private static void checkPanagram(String sentence) {
        String word = sentence.replaceAll(" ", "");
        Set<Character> unique = new TreeSet<>();
        StringBuilder result = new StringBuilder();
        for(char c : word.toLowerCase().toCharArray()){
            if(unique.add(c)){
                result.append(c);
            }
        }

        char[] ch = result.toString().toCharArray();
        Arrays.sort(ch);
        String sorted = new String(ch);
       System.out.println(sorted);

    }
}
