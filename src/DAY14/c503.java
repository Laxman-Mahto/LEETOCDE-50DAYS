package DAY14;

import java.util.Arrays;
import java.util.Stack;

public class c503 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 1};
        int[] res = s.nextGreaterElements(nums);
        System.out.println(java.util.Arrays.toString(res));
    }
    static class Solution {
        public int[] nextGreaterElements(int[] nums) {
            int n = nums.length;
            int[] result = new int[n];
            Arrays.fill(result, -1);
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < 2 * n; i++) {
                int num = nums[i % n];
                while (!stack.isEmpty() && nums[stack.peek()] < num) {
                    result[stack.pop()] = num;
                }
                if (i < n) {
                    stack.push(i);
                }
            }
            return result;
        }
    }
}
