package day03;

import java.util.*;

public class a1386 {
    public static void main(String[] args) {
        Solution s = new Solution();

        int n = 3;
        int[][] reservedSeats = {
                {1, 2},
                {1, 3},
                {1, 8},
                {2, 6},
                {3, 1},
                {3, 10}
        };

        System.out.println(s.maxNumberOfFamilies(n, reservedSeats));
    }

    static class Solution {
        public int maxNumberOfFamilies(int n, int[][] reservedSeats) {

            Map<Integer, Integer> map = new HashMap<>();

            for (int[] seat : reservedSeats) {
                int row = seat[0];
                int col = seat[1];

                if (col >= 2 && col <= 9) {
                    map.put(row, map.getOrDefault(row, 0) | (1 << col));
                }
            }

            int answer = (n - map.size()) * 2;

            for (int mask : map.values()) {

                boolean left = (mask & ((1 << 2) | (1 << 3) |
                        (1 << 4) | (1 << 5))) == 0;

                boolean middle = (mask & ((1 << 4) | (1 << 5) |
                        (1 << 6) | (1 << 7))) == 0;

                boolean right = (mask & ((1 << 6) | (1 << 7) |
                        (1 << 8) | (1 << 9))) == 0;

                if (left && right) {
                    answer += 2;
                } else if (left || middle || right) {
                    answer += 1;
                }
            }

            return answer;
        }
    }
}
