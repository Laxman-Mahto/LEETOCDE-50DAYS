package day04;

import java.util.Arrays;

public class a167 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] numbers = {2, 7, 11, 15};
        System.out.println(Arrays.toString(s.twoSum(numbers, 9)));
    }

    static class Solution {
        public int[] twoSum(int[] numbers, int target) {
            int left = 0;
            int right = numbers.length - 1;
            while (left < right) {
                int sum = numbers[left] + numbers[right];
                if (sum == target) {
                    return new int[]{left + 1, right + 1};
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
            return new int[]{-1, -1};
        }
    }
}
