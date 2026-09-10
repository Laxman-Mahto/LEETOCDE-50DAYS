package day28;

public class b518 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] coins = {1, 2, 5};
        System.out.println(s.change(5, coins));
    }
    static class Solution {
        public int change(int amount, int[] coins) {
            int[] dp = new int[amount + 1];
            dp[0] = 1;
            for (int coin : coins) {
                for (int i = coin; i <= amount; i++) {
                    dp[i] += dp[i - coin];
                }
            }
            return dp[amount];
        }
    }
}
