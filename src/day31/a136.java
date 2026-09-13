package day31;

public class a136 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {4, 1, 2, 1, 2};
        System.out.println(s.singleNumber(nums));
    }
    static class Solution {
        public int singleNumber(int[] nums) {
            int result = 0;
            for (int num : nums) {
                result ^= num;
            }
            return result;
        }
    }
}
