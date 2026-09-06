package day24;

public class c733 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] image = {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}};
        int[][] res = s.floodFill(image, 1, 1, 2);
        System.out.println(java.util.Arrays.deepToString(res));
    }
    static class Solution {
        public int[][] floodFill(int[][] image, int sr, int sc, int color) {
            int original = image[sr][sc];
            if (original != color) {
                dfs(image, sr, sc, original, color);
            }
            return image;
        }

        private void dfs(int[][] image, int r, int c, int original, int color) {
            if (r < 0 || r >= image.length || c < 0 || c >= image[0].length || image[r][c] != original) {
                return;
            }
            image[r][c] = color;
            dfs(image, r + 1, c, original, color);
            dfs(image, r - 1, c, original, color);
            dfs(image, r, c + 1, original, color);
            dfs(image, r, c - 1, original, color);
        }
    }
}
