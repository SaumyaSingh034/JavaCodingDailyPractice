package CodePadQuestions;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {

    /*
     * This program prints set of anagrams together in given string
     *
     * eg.
     * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
     *
     */


        static String input = "cat dog tac sat tas god dog";

        static void setOfAnagrams(String inputString){
            String[] input = inputString.split("\\s+");
            Map<String, StringBuilder> data = new LinkedHashMap<>();
            for(String word : input){
               String key =  getSortedKey(word);
               data.putIfAbsent(key, new StringBuilder());
               data.get(key).append(word).append(" ");
            }

            for(StringBuilder group : data.values()){
                System.out.print(group);
            }



            //your code goes here


        }

    private static String getSortedKey(String word) {
            char[] arr = word.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }


    public static void main(String[] args) {

            String input = "cat dog tac sat tas god dog";
            setOfAnagrams(input);

        }
    }
