package day27;

public class b746 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] cost = {10, 15, 20};
        System.out.println(s.minCostClimbingStairs(cost));
    }
    static class Solution {
        public int minCostClimbingStairs(int[] cost) {
            int first = cost[0];
            int second = cost[1];
            for (int i = 2; i < cost.length; i++) {
                int current = cost[i] + Math.min(first, second);
                first = second;
                second = current;
            }
            return Math.min(first, second);
        }
    }
}
