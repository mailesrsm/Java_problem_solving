class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        int len = m + n - 1;

        if (len % 2 == 1) return false;

        boolean[][][] dp = new boolean[m][n][len + 1];

        if (grid[0][0] == ')') return false;

        dp[0][0][1] = true;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) continue;

                for (int b = 0; b <= len; b++) {

                    int newBalance;

                    if (grid[i][j] == '(')
                        newBalance = b + 1;
                    else
                        newBalance = b - 1;

                    if (newBalance < 0) continue;

                    if (i > 0 && dp[i - 1][j][b])
                        dp[i][j][newBalance] = true;

                    if (j > 0 && dp[i][j - 1][b])
                        dp[i][j][newBalance] = true;
                }
            }
        }

        return dp[m - 1][n - 1][0];
    }
}