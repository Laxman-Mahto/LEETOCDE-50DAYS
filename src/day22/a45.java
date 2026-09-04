package day22;

public class a45 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {2, 3, 1, 1, 4};
        System.out.println(s.jump(nums));
    }
    static class Solution {
        public int jump(int[] nums) {
            int jumps = 0;
            int currentEnd = 0;
            int farthest = 0;
            for (int i = 0; i < nums.length - 1; i++) {
                farthest = Math.max(farthest, i + nums[i]);
                if (i == currentEnd) {
                    jumps++;
                    currentEnd = farthest;
                }
            }
            return jumps;
        }
    }
}
