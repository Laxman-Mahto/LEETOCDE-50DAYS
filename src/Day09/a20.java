package Day09;

import java.util.*;

public class a20 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "()[]{}";

        System.out.println(s.isValid(str));
    }

    static class Solution {

        public boolean isValid(String s) {

            Stack<Character> stack = new Stack<>();

            for (char c : s.toCharArray()) {

                if (c == '(' || c == '[' || c == '{') {
                    stack.push(c);
                } else {

                    if (stack.isEmpty()) {
                        return false;
                    }

                    char top = stack.pop();

                    if (c == ')' && top != '(' ||
                            c == ']' && top != '[' ||
                            c == '}' && top != '{') {

                        return false;
                    }
                }
            }

            return stack.isEmpty();
        }
    }
}