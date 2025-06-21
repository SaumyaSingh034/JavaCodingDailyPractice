package CodePadQuestions;

import java.util.LinkedHashMap;
import java.util.Map;

public class RunLengthEncoding {

    /*
     * Implement a run length encoding function.
     * For a string input the function returns output encoded as follows:
     *
     * "a"     -> "a1"
     * "aa"    -> "a2"
     * "aabbb" -> "a2b3"
     */

        public static String rle(String input) {
            Map<Character, Integer> data = new LinkedHashMap<>();
            StringBuilder result = new StringBuilder();
            for(char c : input.toCharArray()){
                data.put(c, data.getOrDefault(c, 0)+1);
            }

            for(Map.Entry<Character, Integer> dataSet : data.entrySet()){
                result.append(dataSet.getKey()).append(dataSet.getValue());
            }
            return result.toString();
        }


        public static void main(String[] args)  {

            if("".equals(rle("")) &&
                    "a1".equals(rle("a")) &&
                    "a3".equals(rle("aaa"))){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }
    }

