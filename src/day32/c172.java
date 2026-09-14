package day32;

public class c172 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.trailingZeroes(5));
    }
    static class Solution {
        public int trailingZeroes(int n) {
            int count = 0;
            while (n > 0) {
                count += n / 5;
                n /= 5;
            }
            return count;
        }
    }
}
