package day31;

public class c338 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(java.util.Arrays.toString(s.countBits(5)));
    }
    static class Solution {
        public int[] countBits(int n) {
            int[] ans = new int[n + 1];
            for (int i = 1; i <= n; i++) {
                ans[i] = ans[i >> 1] + (i & 1);
            }
            return ans;
        }
    }
}
