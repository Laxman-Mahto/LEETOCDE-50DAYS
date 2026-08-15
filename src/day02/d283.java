package day02;

import java.util.Arrays;

public class d283 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {0, 1, 0, 3, 12};
        s.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    static class Solution {
        public void moveZeroes(int[] nums) {
            int insertPos = 0;
            for (int num : nums) {
                if (num != 0) {
                    nums[insertPos++] = num;
                }
            }
            while (insertPos < nums.length) {
                nums[insertPos++] = 0;
            }
        }
    }
}
