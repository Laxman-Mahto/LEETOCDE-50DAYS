package day25;

import java.util.LinkedList;
import java.util.Queue;

public class e994 {
    static class Solution {
        public int orangesRotting(int[][] grid) {
            int m = grid.length;
            int n = grid[0].length;
            Queue<int[]> queue = new LinkedList<>();
            int fresh = 0;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (grid[i][j] == 2) {
                        queue.offer(new int[]{i, j});
                    } else if (grid[i][j] == 1) {
                        fresh++;
                    }
                }
            }
            if (fresh == 0) {
                return 0;
            }
            int minutes = 0;
            int[][] dirs = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
            while (!queue.isEmpty() && fresh > 0) {
                int size = queue.size();
                minutes++;
                for (int k = 0; k < size; k++) {
                    int[] curr = queue.poll();
                    for (int[] d : dirs) {
                        int r = curr[0] + d[0];
                        int c = curr[1] + d[1];
                        if (r >= 0 && r < m && c >= 0 && c < n && grid[r][c] == 1) {
                            grid[r][c] = 2;
                            fresh--;
                            queue.offer(new int[]{r, c});
                        }
                    }
                }
            }
            return fresh == 0 ? minutes : -1;
        }
    }
}
