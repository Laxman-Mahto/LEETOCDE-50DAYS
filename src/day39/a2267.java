package day39;
//valid parenthisiss
public class a2267 {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int len = m + n - 1;

        if (len % 2 != 0 || grid[0][0] == ')' || grid[m - 1][n - 1] == '(') {
            return false;
        }

        boolean[][][] dp = new boolean[m][n][len + 1];
        dp[0][0][1] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }

                int change = grid[i][j] == '(' ? 1 : -1;

                for (int prev = 0; prev <= i + j; prev++) {
                    int next = prev + change;

                    if (next < 0 || next > len) {
                        continue;
                    }

                    if (i > 0 && dp[i - 1][j][prev]) {
                        dp[i][j][next] = true;
                    }

                    if (j > 0 && dp[i][j - 1][prev]) {
                        dp[i][j][next] = true;
                    }
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }

    public static void main(String[] args) {
        a2267 sol = new a2267();

        char[][] grid = {
                {'(', '(', '(', '(', '('},
                {'(', '(', ')', ')', ')'},
                {')', '(', ')', ')', '('},
                {'(', '(', ')', ')', ')'}
        };

        System.out.println(sol.hasValidPath(grid));
    }
}