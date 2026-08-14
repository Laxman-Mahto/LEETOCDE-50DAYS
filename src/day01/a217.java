package day01;

import java.util.HashSet;
import java.util.Set;

public class a217 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(s.containsDuplicate(nums));
    }

    static class Solution {
        public boolean containsDuplicate(int[] nums) {
            Set<Integer> set = new HashSet<>();
            for (int num : nums) {
                if (!set.add(num)) {
                    return true;
                }
            }
            return false;
        }
    }
}
