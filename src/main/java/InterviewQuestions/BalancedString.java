package InterviewQuestions;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args){
        String value = "{}{}()[]{}";
        System.out.println(balancedString(value));
    }

    private static boolean balancedString(String value) {
        Stack<Character> stack = new Stack<>();
        for(char c : value.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if(stack.isEmpty())
                    return false;
                char top = stack.pop();
                if(c == ')' && top != '(')
                    return false;
                if(c == '}' && top != '{')
                    return false;
                if(c == ']' && top != '[')
                    return false;

            }
        }
        return stack.isEmpty();
    }
}
