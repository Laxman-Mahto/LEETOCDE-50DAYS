package day34;

import java.util.Stack;

public class b84 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] heights = {2, 1, 5, 6, 2, 3};
        System.out.println(s.largestRectangleArea(heights));
    }
    static class Solution {
        public int largestRectangleArea(int[] heights) {
            int n = heights.length;
            Stack<Integer> stack = new Stack<>();
            int maxArea = 0;
            for (int i = 0; i <= n; i++) {
                int h = (i == n) ? 0 : heights[i];
                while (!stack.isEmpty() && h < heights[stack.peek()]) {
                    int height = heights[stack.pop()];
                    int width = stack.isEmpty() ? i : i - stack.peek() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.push(i);
            }
            return maxArea;
        }
    }
}
