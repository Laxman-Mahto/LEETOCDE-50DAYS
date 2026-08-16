package day03;

import java.util.Arrays;

public class e1480 {

    static class Solution {
        public int[] runningSum(int[] nums) {
            for (int i = 1; i < nums.length; i++) {
                nums[i] += nums[i - 1];
            }
            return nums;
        }
    }
}
