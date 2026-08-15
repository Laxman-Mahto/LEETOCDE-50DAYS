package day02;

import java.util.Arrays;

public class d283 {

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
