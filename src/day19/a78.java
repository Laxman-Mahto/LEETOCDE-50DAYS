package day19;

import java.util.ArrayList;
import java.util.List;

public class a78 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3};
        System.out.println(s.subsets(nums));
    }
    static class Solution {
        public List<List<Integer>> subsets(int[] nums) {
            List<List<Integer>> result = new ArrayList<>();
            backtrack(0, nums, new ArrayList<>(), result);
            return result;
        }

        private void backtrack(int start, int[] nums, List<Integer> current, List<List<Integer>> result) {
            result.add(new ArrayList<>(current));
            for (int i = start; i < nums.length; i++) {
                current.add(nums[i]);
                backtrack(i + 1, nums, current, result);
                current.remove(current.size() - 1);
            }
        }
    }
}
