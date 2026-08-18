package day05;

public class c643 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 12, -5, -6, 50, 3};
        System.out.println(s.findMaxAverage(nums, 4));
    }

    static class Solution {
        public double findMaxAverage(int[] nums, int k) {
            double currentSum = 0;
            for (int i = 0; i < k; i++) {
                currentSum += nums[i];
            }
            double maxSum = currentSum;
            for (int i = k; i < nums.length; i++) {
                currentSum += nums[i] - nums[i - k];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
            return maxSum / k;
        }
    }
}
