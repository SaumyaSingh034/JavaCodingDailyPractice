package Practice1;

import java.util.Arrays;

public class LongestSubstring {
    public static void main(String[] args){
        String str = "aabbbcdd";
        System.out.println(Arrays.toString(findLongestUniformString(str)));
    }

    private static int[] findLongestUniformString(String str) {
        int longestStart = -1;
        int longestLength = 1;
        //Code here

        int i = 1;
        int length = str.length();
        while(i<length){
            int start = i-1;
            int currentLength = 1;
            while(i < length && str.charAt(i) == str.charAt(i-1)){
                i++;
                currentLength++;
            }
            if(currentLength > longestLength){
                longestStart = start;
                longestLength = currentLength;
            }
            i++;
        }
        return new int[]{ longestStart, longestLength };
    }
}
