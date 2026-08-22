package Day08;

public class b10 {
    public static void main(String[] args) {
        Solution s = new Solution();

        String str = "aa";
        String pattern = "a*";

        System.out.println(s.isMatch(str, pattern));
    }

    static class Solution {

        public boolean isMatch(String s, String p) {

            Boolean[][] dp = new Boolean[s.length() + 1][p.length() + 1];

            return solve(0, 0, s, p, dp);
        }

        private boolean solve(int i, int j, String s, String p,
                              Boolean[][] dp) {

            if (j == p.length()) {
                return i == s.length();
            }

            if (dp[i][j] != null) {
                return dp[i][j];
            }

            boolean firstMatch =
                    i < s.length() &&
                            (s.charAt(i) == p.charAt(j) ||
                                    p.charAt(j) == '.');

            boolean answer;

            if (j + 1 < p.length() && p.charAt(j + 1) == '*') {

                answer =
                        solve(i, j + 2, s, p, dp) ||
                                (firstMatch && solve(i + 1, j, s, p, dp));

            } else {

                answer =
                        firstMatch &&
                                solve(i + 1, j + 1, s, p, dp);
            }

            dp[i][j] = answer;

            return answer;
        }
    }
}