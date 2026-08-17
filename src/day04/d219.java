package day04;

import java.util.HashMap;
import java.util.Map;

public class d219 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {1, 2, 3, 1};
        System.out.println(s.containsNearbyDuplicate(nums, 3));
    }

    static class Solution {
        public boolean containsNearbyDuplicate(int[] nums, int k) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                    return true;
                }
                map.put(nums[i], i);
            }
            return false;
        }
    }
}
