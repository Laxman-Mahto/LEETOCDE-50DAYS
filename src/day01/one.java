package day01;

public class one {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int n = 99;

        boolean answer = solution.checkDivisibility(n);

        System.out.println("Answer: " + answer);
    }

    static class Solution {

        public boolean checkDivisibility(int n) {

            int original = n;
            int sum = 0;
            int product = 1;

            while (n > 0) {

                int digit = n % 10;

                sum += digit;
                product *= digit;

                n /= 10;
            }

            return original % (sum + product) == 0;
        }
    }
}