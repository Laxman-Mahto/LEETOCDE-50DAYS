package day23;

import java.util.Arrays;

public class e1288 {
    static class Solution {
        public int removeCoveredIntervals(int[][] intervals) {
            Arrays.sort(intervals, (a, b) -> {
                if (a[0] != b[0]) {
                    return Integer.compare(a[0], b[0]);
                }
                return Integer.compare(b[1], a[1]);
            });
            int count = 0;
            int rightMax = 0;
            for (int[] interval : intervals) {
                if (interval[1] > rightMax) {
                    count++;
                    rightMax = interval[1];
                }
            }
            return count;
        }
    }
}
