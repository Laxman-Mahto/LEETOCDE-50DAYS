package Day08;

public class a9 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int x = 121;

        System.out.println(s.isPalindrome(x));
    }

    static class Solution {
        public boolean isPalindrome(int x) {

            if (x < 0) {
                return false;
            }

            int original = x;
            int reversed = 0;

            while (x > 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }

            return original == reversed;
        }
    }
}
