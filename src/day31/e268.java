package day31;

public class e268 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 0, 1};
        System.out.println(s.missingNumber(nums));
    }
    static class Solution {
        public int missingNumber(int[] nums) {
            int res = nums.length;
            for (int i = 0; i < nums.length; i++) {
                res ^= i ^ nums[i];
            }
            return res;
        }
    }
}
