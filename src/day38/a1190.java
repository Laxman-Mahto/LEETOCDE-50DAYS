//PROBLEM STATEMENT
package day38;

import java.util.Stack;

public class a1190 {
    public static String reverseParentheses(String s) {
        Stack<StringBuilder> stack = new Stack<>();
        StringBuilder current = new StringBuilder();

        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                stack.push(current);
                current = new StringBuilder();
            } else if (ch == ')') {
                current.reverse();
                StringBuilder previous = stack.pop();
                previous.append(current);
                current = previous;
            } else {
                current.append(ch);
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("(abcd)"));
        System.out.println(reverseParentheses("(u(love)i)"));
        System.out.println(reverseParentheses("(ed(et(oc))el)"));
    }
}