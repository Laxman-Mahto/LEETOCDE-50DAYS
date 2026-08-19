package Day06;

import java.util.Stack;

public class e71 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.simplifyPath("/home//foo/"));
    }
    static class Solution {
        public String simplifyPath(String path) {
            Stack<String> stack = new Stack<>();
            String[] parts = path.split("/");
            for (String part : parts) {
                if (part.equals("..")) {
                    if (!stack.isEmpty()) {
                        stack.pop();
                    }
                } else if (!part.isEmpty() && !part.equals(".")) {
                    stack.push(part);
                }
            }
            StringBuilder sb = new StringBuilder();
            for (String dir : stack) {
                sb.append("/").append(dir);
            }
            return sb.length() == 0 ? "/" : sb.toString();
        }
    }
}
