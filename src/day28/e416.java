package day28;

public class e416 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 5, 11, 5};
        System.out.println(s.canPartition(nums));
    }
    static class Solution {
        public boolean canPartition(int[] nums) {
            int total = 0;
            for (int num : nums) {
                total += num;
            }
            if (total % 2 != 0) {
                return false;
            }
            int target = total / 2;
            boolean[] dp = new boolean[target + 1];
            dp[0] = true;
            for (int num : nums) {
                for (int j = target; j >= num; j--) {
                    dp[j] = dp[j] || dp[j - num];
                }
            }
            return dp[target];
        }
    }
}
