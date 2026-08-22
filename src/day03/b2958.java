package day03;

import java.util.*;

public class b2958 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] nums = {1, 2, 3, 1, 2, 3, 1, 2};
        int k = 2;

        System.out.println(s.maxSubarrayLength(nums, k));
    }

    static class Solution {
        public int maxSubarrayLength(int[] nums, int k) {

            Map<Integer, Integer> freq = new HashMap<>();

            int left = 0;
            int answer = 0;

            for (int right = 0; right < nums.length; right++) {

                freq.put(nums[right],
                        freq.getOrDefault(nums[right], 0) + 1);

                while (freq.get(nums[right]) > k) {
                    freq.put(nums[left], freq.get(nums[left]) - 1);
                    left++;
                }

                answer = Math.max(answer, right - left + 1);
            }

            return answer;
        }
    }
}