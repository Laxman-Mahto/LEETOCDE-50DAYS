package day44;

import java.util.Arrays;

public class c_moveZeroesToEnd {
    public static void moveZeroes(int[] nums) {
        int pos = 0;
        for (int num : nums) {
            if (num != 0) nums[pos++] = num;
        }
        while (pos < nums.length) nums[pos++] = 0;
    }

    public static void main(String[] args) {
        int[] nums = {0, 3, 0, 1, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}