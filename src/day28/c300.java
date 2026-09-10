package day28;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class c300 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(s.lengthOfLIS(nums));
    }
    static class Solution {
        public int lengthOfLIS(int[] nums) {
            List<Integer> tails = new ArrayList<>();
            for (int x : nums) {
                int idx = Collections.binarySearch(tails, x);
                if (idx < 0) {
                    idx = -(idx + 1);
                }
                if (idx == tails.size()) {
                    tails.add(x);
                } else {
                    tails.set(idx, x);
                }
            }
            return tails.size();
        }
    }
}
