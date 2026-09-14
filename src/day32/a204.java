package day32;

public class a204 {
    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.countPrimes(10));
    }
    static class Solution {
        public int countPrimes(int n) {
            if (n <= 2) {
                return 0;
            }
            boolean[] notPrime = new boolean[n];
            int count = 0;
            for (int i = 2; i < n; i++) {
                if (!notPrime[i]) {
                    count++;
                    for (long j = (long) i * i; j < n; j += i) {
                        notPrime[(int) j] = true;
                    }
                }
            }
            return count;
        }
    }
}
