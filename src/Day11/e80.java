package Day11;

public class e80 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        System.out.println(s.removeDuplicates(nums));
    }
    static class Solution {
        public int removeDuplicates(int[] nums) {
            if (nums.length <= 2) {
                return nums.length;
            }
            int k = 2;
            for (int i = 2; i < nums.length; i++) {
                if (nums[i] != nums[k - 2]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            return k;
        }
    }
}
