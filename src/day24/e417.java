package day24;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class e417 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] heights = {{1, 2, 2}, {3, 2, 3}, {2, 4, 5}};
        System.out.println(s.pacificAtlantic(heights));
    }
    static class Solution {
        public List<List<Integer>> pacificAtlantic(int[][] heights) {
            List<List<Integer>> result = new ArrayList<>();
            if (heights == null || heights.length == 0) {
                return result;
            }
            int m = heights.length;
            int n = heights[0].length;
            boolean[][] pacific = new boolean[m][n];
            boolean[][] atlantic = new boolean[m][n];

            for (int i = 0; i < m; i++) {
                dfs(heights, pacific, i, 0, heights[i][0]);
                dfs(heights, atlantic, i, n - 1, heights[i][n - 1]);
            }
            for (int j = 0; j < n; j++) {
                dfs(heights, pacific, 0, j, heights[0][j]);
                dfs(heights, atlantic, m - 1, j, heights[m - 1][j]);
            }

            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (pacific[i][j] && atlantic[i][j]) {
                        result.add(Arrays.asList(i, j));
                    }
                }
            }
            return result;
        }

        private void dfs(int[][] heights, boolean[][] visited, int r, int c, int prevHeight) {
            if (r < 0 || r >= heights.length || c < 0 || c >= heights[0].length || visited[r][c] || heights[r][c] < prevHeight) {
                return;
            }
            visited[r][c] = true;
            dfs(heights, visited, r + 1, c, heights[r][c]);
            dfs(heights, visited, r - 1, c, heights[r][c]);
            dfs(heights, visited, r, c + 1, heights[r][c]);
            dfs(heights, visited, r, c - 1, heights[r][c]);
        }
    }
}
