package Task02Stack;

import static Task02Stack.Task02Stack.checkBrackets;

public class Main {
    public static void main(String[] args) {
        String s1 = "()";
        String s2 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        System.out.println(checkBrackets(s1)); // true
        System.out.println(checkBrackets(s2)); // true
        System.out.println(checkBrackets(s3)); // false
        System.out.println(checkBrackets(s4)); // false
    }
}
