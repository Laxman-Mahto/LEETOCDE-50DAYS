package day05;

public class a121 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(s.maxProfit(prices));
    }

    static class Solution {
        public int maxProfit(int[] prices) {
            int minPrice = prices[0];
            int maxProfit = 0;
            for (int i = 1; i < prices.length; i++) {
                if (prices[i] < minPrice) {
                    minPrice = prices[i];
                } else if (prices[i] - minPrice > maxProfit) {
                    maxProfit = prices[i] - minPrice;
                }
            }
            return maxProfit;
        }
    }
}
