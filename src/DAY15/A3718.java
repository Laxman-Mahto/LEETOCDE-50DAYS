package DAY15;

public class A3718 {

    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = {8, 2, 3, 4, 6};
        int k = 2;

        int answer = solution.missingMultiple(nums, k);

        System.out.println("Answer: " + answer);
    }

    static class Solution {

        public int missingMultiple(int[] nums, int k) {

            boolean[] present = new boolean[101];

            for (int num : nums) {
                present[num] = true;
            }

            int multiple = k;

            while (multiple <= 100) {

                if (!present[multiple]) {
                    return multiple;
                }

                multiple += k;
            }

            return multiple;
        }
    }
}7