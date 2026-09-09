package day27;

public class a70 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(3));
    }
    static class Solution {
        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }
            int first = 1;
            int second = 2;
            for (int i = 3; i <= n; i++) {
                int third = first + second;
                first = second;
                second = third;
            }
            return second;
        }
    }
}
