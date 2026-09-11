package day29;

import java.util.List;

public class d120 {
    public static void main(String[] args) {
        Solution s = new Solution();
        java.util.List<java.util.List<Integer>> triangle = new java.util.ArrayList<>();
        triangle.add(java.util.Arrays.asList(2));
        triangle.add(java.util.Arrays.asList(3, 4));
        triangle.add(java.util.Arrays.asList(6, 5, 7));
        System.out.println(s.minimumTotal(triangle));
    }
    static class Solution {
        public int minimumTotal(List<List<Integer>> triangle) {
            int n = triangle.size();
            int[] dp = new int[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                List<Integer> row = triangle.get(i);
                for (int j = 0; j <= i; j++) {
                    dp[j] = row.get(j) + Math.min(dp[j], dp[j + 1]);
                }
            }
            return dp[0];
        }
    }
}
