package day02;

public class c27 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {3, 2, 2, 3};
        System.out.println(s.removeElement(nums, 3));
    }

    static class Solution {
        public int removeElement(int[] nums, int val) {
            int k = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != val) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }
}
