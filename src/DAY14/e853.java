package DAY14;

import java.util.Arrays;

public class e853 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[] pos = {10, 8, 0, 5, 3};
        int[] speed = {2, 4, 1, 1, 3};
        System.out.println(s.carFleet(12, pos, speed));
    }
    static class Solution {
        public int carFleet(int target, int[] position, int[] speed) {
            int n = position.length;
            double[][] cars = new double[n][2];
            for (int i = 0; i < n; i++) {
                cars[i][0] = position[i];
                cars[i][1] = (double) (target - position[i]) / speed[i];
            }
            Arrays.sort(cars, (a, b) -> Double.compare(b[0], a[0]));
            int fleets = 0;
            double currentMaxTime = 0.0;
            for (int i = 0; i < n; i++) {
                if (cars[i][1] > currentMaxTime) {
                    fleets++;
                    currentMaxTime = cars[i][1];
                }
            }
            return fleets;
        }
    }
}
