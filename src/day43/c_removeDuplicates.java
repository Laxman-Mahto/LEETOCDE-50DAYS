package day43;

import java.util.Arrays;

public class c_removeDuplicates {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int len = removeDuplicates(nums);
        System.out.println(Arrays.toString(Arrays.copyOf(nums, len)));
    }
}