package day03;

public class c724 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 7, 3, 6, 5, 6};
        System.out.println(s.pivotIndex(nums));
    }

    static class Solution {
        public int pivotIndex(int[] nums) {
            int totalSum = 0;
            for (int x : nums) {
                totalSum += x;
            }
            int leftSum = 0;
            for (int i = 0; i < nums.length; i++) {
                if (leftSum == totalSum - leftSum - nums[i]) {
                    return i;
                }
                leftSum += nums[i];
            }
            return -1;
        }
    }
}
