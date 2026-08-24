package DAY14;

import java.util.*;

public class a1872 {

    public static int stoneGameVIII(int[] stones) {
        int n = stones.length;

        // Build prefix sums
        for (int i = 1; i < n; i++) {
            stones[i] += stones[i - 1];
        }

        // Start with taking all stones
        int best = stones[n - 1];

        // DP from right to left
        for (int i = n - 2; i >= 1; i--) {
            best = Math.max(best, stones[i] - best);
        }

        return best;
    }

    public static void main(String[] args) {

        int[] stones = {-1, 2, -3, 4, -5};

        int answer = stoneGameVIII(stones);

        System.out.println("Score difference: " + answer);
    }
}