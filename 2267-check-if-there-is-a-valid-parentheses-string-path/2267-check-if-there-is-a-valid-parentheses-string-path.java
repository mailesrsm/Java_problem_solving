class Solution {
    public boolean hasValidPath(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int len = m + n - 1;

        if ((len & 1) == 1) return false;
        if (grid[0][0] == ')') return false;
        if (grid[m - 1][n - 1] == '(') return false;

        int w = (len >> 6) + 1;
        long[] dp = new long[m * n * w];

        dp[0] = 2L;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;

                int cur = (i * n + j) * w;

                for (int k = 0; k < w; k++) {
                    long x = 0;

                    if (i > 0)
                        x |= dp[cur - n * w + k];

                    if (j > 0)
                        x |= dp[cur - w + k];

                    dp[cur + k] = x;
                }

                if (grid[i][j] == '(') {
                    for (int k = w - 1; k >= 0; k--) {
                        long x = dp[cur + k] << 1;

                        if (k > 0)
                            x |= dp[cur + k - 1] >>> 63;

                        dp[cur + k] = x;
                    }
                } else {
                    for (int k = 0; k < w; k++) {
                        long x = dp[cur + k] >>> 1;

                        if (k + 1 < w)
                            x |= dp[cur + k + 1] << 63;

                        dp[cur + k] = x;
                    }
                }
            }
        }

        return (dp[(m * n - 1) * w] & 1L) != 0;
    }
}