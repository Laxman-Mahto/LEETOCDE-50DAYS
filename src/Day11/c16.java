package Day11;

import java.util.Arrays;

public class c16 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-1, 2, 1, -4};
        System.out.println(s.threeSumClosest(nums, 1));
    }
    static class Solution {
        public int threeSumClosest(int[] nums, int target) {
            Arrays.sort(nums);
            int closest = nums[0] + nums[1] + nums[2];
            for (int i = 0; i < nums.length - 2; i++) {
                int left = i + 1;
                int right = nums.length - 1;
                while (left < right) {
                    int sum = nums[i] + nums[left] + nums[right];
                    if (Math.abs(target - sum) < Math.abs(target - closest)) {
                        closest = sum;
                    }
                    if (sum < target) {
                        left++;
                    } else if (sum > target) {
                        right--;
                    } else {
                        return target;
                    }
                }
            }
            return closest;
        }
    }
}
