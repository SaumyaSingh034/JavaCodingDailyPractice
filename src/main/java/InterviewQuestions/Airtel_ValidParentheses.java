package InterviewQuestions;

import java.util.Stack;

public class Airtel_ValidParentheses {
    public static void main(String[] args){
        String str = "{}{}()[]{}";
        System.out.println(isValidOne(str));
    }

    private static boolean isValidOne(String str) {
        Stack<Character> data = new Stack<>();
        for(char c : str.toCharArray()){
            if(c == '(' || c =='{' || c == '[')
                data.push(c);
            else{
                if(data.isEmpty())
                    return false;
                char open = data.pop();
                if(c == ')' && open !='(')
                    return false;
                if(c == '}' && open != '{')
                    return false;
                if(c == ']' && open != '[')
                    return false;
            }
        }
        return data.isEmpty();
    }
}
