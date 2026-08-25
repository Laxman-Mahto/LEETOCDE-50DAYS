package DAY12;

public class d1004 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        System.out.println(s.longestOnes(nums, 2));
    }
    static class Solution {
        public int longestOnes(int[] nums, int k) {
            int left = 0;
            int zeros = 0;
            int maxLen = 0;
            for (int right = 0; right < nums.length; right++) {
                if (nums[right] == 0) {
                    zeros++;
                }
                while (zeros > k) {
                    if (nums[left] == 0) {
                        zeros--;
                    }
                    left++;
                }
                maxLen = Math.max(maxLen, right - left + 1);
            }
            return maxLen;
        }
    }
}
