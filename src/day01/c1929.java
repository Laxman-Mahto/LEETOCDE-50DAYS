package day01;

import java.util.Arrays;

public class c1929 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 1};
        System.out.println(Arrays.toString(s.getConcatenation(nums)));
    }

    static class Solution {
        public int[] getConcatenation(int[] nums) {
            int n = nums.length;
            int[] ans = new int[2 * n];
            for (int i = 0; i < n; i++) {
                ans[i] = nums[i];
                ans[i + n] = nums[i];
            }
            return ans;
        }
    }
}
