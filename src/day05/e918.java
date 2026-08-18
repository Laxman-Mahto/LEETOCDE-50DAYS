package day05;

public class e918 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, -2, 3, -2};
        System.out.println(s.maxSubarraySumCircular(nums));
    }

    static class Solution {
        public int maxSubarraySumCircular(int[] nums) {
            int total = 0;
            int currentMax = 0;
            int currentMin = 0;
            int maxSum = nums[0];
            int minSum = nums[0];
            for (int x : nums) {
                currentMax = Math.max(x, currentMax + x);
                maxSum = Math.max(maxSum, currentMax);
                currentMin = Math.min(x, currentMin + x);
                minSum = Math.min(minSum, currentMin);
                total += x;
            }
            return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
        }
    }
}
