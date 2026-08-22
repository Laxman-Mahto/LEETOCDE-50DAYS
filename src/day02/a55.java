package day02;


public class a55 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(s.canJump(nums));
    }

    static class Solution {
        public boolean canJump(int[] nums) {
            int maxReach = 0;

            for (int i = 0; i < nums.length; i++) {
                if (i > maxReach) return false;

                maxReach = Math.max(maxReach, i + nums[i]);

                if (maxReach >= nums.length - 1) {
                    return true;
                }
            }

            return true;
        }
    }
}