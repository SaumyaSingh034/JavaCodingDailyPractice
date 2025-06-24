package Practice1;

import java.util.Stack;

public class BalancedString {
    public static void main(String[] args){
        String input = "{({})[{]}}";
        String str = "{}{}()[]{}";
        System.out.println(balancedStringValid(input));
        System.out.println(balancedStringValid(str));
    }

    private static boolean balancedStringValid(String input) {
        Stack<Character> stack = new Stack<>();
        for(char c : input.toCharArray()){
            if(c == '(' || c == '{' || c == '[')
                stack.push(c);
            else{
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
