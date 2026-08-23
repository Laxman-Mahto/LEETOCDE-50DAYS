package DAY12;

public class a1927 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        String num = "?6?6?000?3";

        boolean answer = solution.sumGame(num);

        System.out.println("Answer: " + answer);
    }

    static class Solution {

        public boolean sumGame(String num) {

            int n = num.length();

            int leftSum = 0;
            int rightSum = 0;

            int leftQ = 0;
            int rightQ = 0;

            // First half
            for (int i = 0; i < n / 2; i++) {

                if (num.charAt(i) == '?') {
                    leftQ++;
                } else {
                    leftSum += num.charAt(i) - '0';
                }
            }

            // Second half
            for (int i = n / 2; i < n; i++) {

                if (num.charAt(i) == '?') {
                    rightQ++;
                } else {
                    rightSum += num.charAt(i) - '0';
                }
            }

            // Odd number of '?' means Alice wins
            if ((leftQ + rightQ) % 2 == 1) {
                return true;
            }

            // Check whether Bob can make both sums equal
            return leftSum - rightSum
                    != 9 * (rightQ - leftQ) / 2;
        }
    }
}
