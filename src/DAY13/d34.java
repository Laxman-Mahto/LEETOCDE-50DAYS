package DAY13;

public class d34 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {5, 7, 7, 8, 8, 10};
        int[] res = s.searchRange(nums, 8);
        System.out.println(java.util.Arrays.toString(res));
    }
    static class Solution {
        public int[] searchRange(int[] nums, int target) {
            int[] result = new int[]{-1, -1};
            result[0] = findBound(nums, target, true);
            result[1] = findBound(nums, target, false);
            return result;
        }

        private int findBound(int[] nums, int target, boolean isFirst) {
            int left = 0;
            int right = nums.length - 1;
            int bound = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    bound = mid;
                    if (isFirst) {
                        right = mid - 1;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return bound;
        }
    }
}
