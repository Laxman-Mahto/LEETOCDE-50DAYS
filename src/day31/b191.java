package day31;

public class b191 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.hammingWeight(11));
    }
    static class Solution {
        public int hammingWeight(int n) {
            int count = 0;
            while (n != 0) {
                n &= (n - 1);
                count++;
            }
            return count;
        }
    }
}
