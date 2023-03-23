package Stack;
import java.util.Stack;

public class BalancedParenthensies {

    public static void main(String args[]) {

        System.out.println(balancedParenthensies("5 + ((2 * 3) + 4)"));
        System.out.println(balancedParenthensies("5 + ((2 * 3) + 4"));  
    }

    public static boolean balancedParenthensies(String s) {
        Stack<Character> stack  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                stack.push(c);
            } else if(c == ']') {
                if(stack.isEmpty() || stack.pop() != '[') {
                	System.out.println("Expression has Invalid Parenthesis.");
                    return false;
                }
            } else if(c == ')') {
                if(stack.isEmpty() || stack.pop() != '(') {
                	System.out.println("Expression has Invalid Parenthesis.");
                    return false;
                }           
            } else if(c == '}') {
                if(stack.isEmpty() || stack.pop() != '{') {
                	System.out.println("Expression has Invalid Parenthesis.");
                    return false;
                    
                    
                }
                
            }

        }
        
        return stack.isEmpty();
    }
}