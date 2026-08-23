package Day10;

public class a867 {
    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] res = s.transpose(matrix);
        System.out.println(java.util.Arrays.deepToString(res));
    }
    static class Solution {
        public int[][] transpose(int[][] matrix) {
            int m = matrix.length;
            int n = matrix[0].length;
            int[][] result = new int[n][m];
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    result[j][i] = matrix[i][j];
                }
            }
            return result;
        }
    }
}
