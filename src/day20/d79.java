package day20;

public class d79 {
    public static void main(String[] args) {
        Solution s = new Solution();
        char[][] board = {{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        System.out.println(s.exist(board, "ABCCED"));
    }
    static class Solution {
        public boolean exist(char[][] board, String word) {
            int m = board.length;
            int n = board[0].length;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (dfs(board, word, i, j, 0)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private boolean dfs(char[][] board, String word, int r, int c, int index) {
            if (index == word.length()) {
                return true;
            }
            if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] != word.charAt(index)) {
                return false;
            }
            char temp = board[r][c];
            board[r][c] = '#';
            boolean found = dfs(board, word, r + 1, c, index + 1) ||
                            dfs(board, word, r - 1, c, index + 1) ||
                            dfs(board, word, r, c + 1, index + 1) ||
                            dfs(board, word, r, c - 1, index + 1);
            board[r][c] = temp;
            return found;
        }
    }
}
