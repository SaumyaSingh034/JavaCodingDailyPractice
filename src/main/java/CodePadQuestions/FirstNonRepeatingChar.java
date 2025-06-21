package CodePadQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingChar {

        /**
         * Finds the first character that does not repeat anywhere in the input string
         * Given "apple", the answer is "a"
         * Given "racecars", the answer is "e"
         **/
        public static char findFirst(String input)
        {
            // code goes here
            Map<Character, Integer> data = new LinkedHashMap<>();
            for(char c : input.toCharArray()){
                data.put(c, data.getOrDefault(c, 0)+1);
            }
            for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
                if(dataSet.getValue() == 1)
                    return dataSet.getKey();
            }

            return( ' ' );
        }

        public static void main(String args[])
        {

            String[] inputs = {"apple","racecars", "ababdc"};
            char[] outputs = {'a', 'e', 'd' };

            boolean result = true;
            for(int i = 0; i < inputs.length; i++ )
            {
                result = result && findFirst(inputs[i]) == outputs[i];
                if(!result)
                    System.out.println("Test failed for: " + inputs[i]);
                else
                    System.out.println("Test passed for: " + inputs[i]);
            }
        }



}
