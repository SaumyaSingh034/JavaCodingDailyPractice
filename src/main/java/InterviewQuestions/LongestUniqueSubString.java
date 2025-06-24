package InterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class LongestUniqueSubString {
    public static void main(String[] args){
        String str = "saumyasingh";
        findLongestUniqueSubstring(str);

    }

    private static void findLongestUniqueSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int start = 0, i=0, maxStart=0;
        while(i < str.length()){
            char ch = str.charAt(i);
            if(!set.contains(ch)){
                set.add(ch);
                i++;
                if(i-start > maxLength){
                    maxLength = i-start;
                    maxStart = start;
                }
            }else{
                set.remove(str.charAt(start));
                start++;
            }
        }
        System.out.println(str.substring(maxStart, maxStart+maxLength));
    }
}
