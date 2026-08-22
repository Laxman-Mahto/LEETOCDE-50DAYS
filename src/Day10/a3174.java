package Day10;

public class a3174 {
    public static void main(String[] args) {

        Solution s = new Solution();

        String str = "abc3";

        System.out.println(s.clearDigits(str));
    }

    static class Solution {

        public String clearDigits(String s) {

            StringBuilder result = new StringBuilder();

            for (char c : s.toCharArray()) {

                if (Character.isDigit(c)) {

                    if (result.length() > 0) {
                        result.deleteCharAt(result.length() - 1);
                    }

                } else {

                    result.append(c);
                }
            }

            return result.toString();
        }
    }
}