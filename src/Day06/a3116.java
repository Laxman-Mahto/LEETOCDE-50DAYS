package Day06;

public class a3116 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int[] coins = {3, 6, 9};
        int k = 3;

        System.out.println(s.findKthSmallest(coins, k));
    }

    static class Solution {

        public long findKthSmallest(int[] coins, int k) {

            long low = 1;
            long high = (long) coins[0] * k;

            for (int coin : coins) {
                high = Math.min(high, (long) coin * k);
            }

            while (low < high) {

                long mid = low + (high - low) / 2;

                if (count(mid, coins) >= k) {
                    high = mid;
                } else {
                    low = mid + 1;
                }
            }

            return low;
        }

        private long count(long x, int[] coins) {

            long answer = 0;
            int n = coins.length;

            for (int mask = 1; mask < (1 << n); mask++) {

                long lcm = 1;
                int bits = 0;
                boolean valid = true;

                for (int i = 0; i < n; i++) {

                    if ((mask & (1 << i)) != 0) {

                        bits++;

                        long gcd = gcd(lcm, coins[i]);
                        lcm = (lcm / gcd) * coins[i];

                        if (lcm > x) {
                            valid = false;
                            break;
                        }
                    }
                }

                if (!valid) continue;

                long multiples = x / lcm;

                if (bits % 2 == 1) {
                    answer += multiples;
                } else {
                    answer -= multiples;
                }
            }

            return answer;
        }

        private long gcd(long a, long b) {

            while (b != 0) {
                long temp = a % b;
                a = b;
                b = temp;
            }

            return a;
        }
    }
}