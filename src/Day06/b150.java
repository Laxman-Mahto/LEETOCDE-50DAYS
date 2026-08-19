package Day06;

import java.util.Stack;

public class b150 {
    public static void main(String[] args) {
        Solution s = new Solution();
        String[] tokens = {"2", "1", "+", "3", "*"};
        System.out.println(s.evalRPN(tokens));
    }
    static class Solution {
        public int evalRPN(String[] tokens) {
            Stack<Integer> stack = new Stack<>();
            for (String token : tokens) {
                if (token.equals("+")) {
                    stack.push(stack.pop() + stack.pop());
                } else if (token.equals("-")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a - b);
                } else if (token.equals("*")) {
                    stack.push(stack.pop() * stack.pop());
                } else if (token.equals("/")) {
                    int b = stack.pop();
                    int a = stack.pop();
                    stack.push(a / b);
                } else {
                    stack.push(Integer.parseInt(token));
                }
            }
            return stack.pop();
        }
    }
}
