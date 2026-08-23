package DAY13;

import java.util.Arrays;

public class b66 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] digits = {1, 2, 9};

        int[] answer = solution.plusOne(digits);

        System.out.println(Arrays.toString(answer));
    }

    static class Solution {

        public int[] plusOne(int[] digits) {

            for (int i = digits.length - 1; i >= 0; i--) {

                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                digits[i] = 0;
            }

            int[] result = new int[digits.length + 1];
            result[0] = 1;

            return result;
        }
    }
}
