package day04;

public class e169 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 3};
        System.out.println(s.majorityElement(nums));
    }

    static class Solution {
        public int majorityElement(int[] nums) {
            int candidate = nums[0];
            int count = 0;
            for (int num : nums) {
                if (count == 0) {
                    candidate = num;
                }
                if (num == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
            return candidate;
        }
    }
}
