package DAY13;

public class e162 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(s.findPeakElement(nums));
    }
    static class Solution {
        public int findPeakElement(int[] nums) {
            int left = 0;
            int right = nums.length - 1;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[mid + 1]) {
                    right = mid;
                } else {
                    left = mid + 1;
                }
            }
            return left;
        }
    }
}
