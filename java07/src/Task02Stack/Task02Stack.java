package Task02Stack;
import java.util.*;

public class Task02Stack {
    public static boolean checkBrackets(String string) {
        Stack<Character> stack = new Stack<>();
        for (char c : string.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if ( c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else if ( c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            } else if ( c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}