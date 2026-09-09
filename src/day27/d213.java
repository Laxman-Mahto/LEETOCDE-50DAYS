package day27;

public class d213 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 3, 2};
        System.out.println(s.rob(nums));
    }
    static class Solution {
        public int rob(int[] nums) {
            if (nums.length == 1) {
                return nums[0];
            }
            return Math.max(robRange(nums, 0, nums.length - 2), robRange(nums, 1, nums.length - 1));
        }

        private int robRange(int[] nums, int start, int end) {
            int rob1 = 0;
            int rob2 = 0;
            for (int i = start; i <= end; i++) {
                int temp = Math.max(rob1 + nums[i], rob2);
                rob1 = rob2;
                rob2 = temp;
            }
            return rob2;
        }
    }
}
