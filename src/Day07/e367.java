package Day07;

public class e367 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.isPerfectSquare(16));
    }
    static class Solution {
        public boolean isPerfectSquare(int num) {
            if (num < 1) {
                return false;
            }
            long left = 1;
            long right = num;
            while (left <= right) {
                long mid = left + (right - left) / 2;
                long square = mid * mid;
                if (square == num) {
                    return true;
                } else if (square < num) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return false;
        }
    }
}
