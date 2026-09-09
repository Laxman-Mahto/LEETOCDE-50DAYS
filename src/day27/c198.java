package day27;

public class c198 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(s.rob(nums));
    }
    static class Solution {
        public int rob(int[] nums) {
            int rob1 = 0;
            int rob2 = 0;
            for (int num : nums) {
                int temp = Math.max(rob1 + num, rob2);
                rob1 = rob2;
                rob2 = temp;
            }
            return rob2;
        }
    }
}
