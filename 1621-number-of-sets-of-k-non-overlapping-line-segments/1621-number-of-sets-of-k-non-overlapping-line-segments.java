class Solution {

    public int numberOfSets(int n, int k) {

        final long MOD = 1_000_000_007;

        int N = n + k - 1;
        int K = 2 * k;

        long[][] dp = new long[N + 1][K + 1];

        for (int i = 0; i <= N; i++) {

            dp[i][0] = 1;

            for (int j = 1; j <= Math.min(i, K); j++) {

                if (i == 0) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] =
                        (dp[i - 1][j - 1] + dp[i - 1][j]) % MOD;
                }
            }
        }

        return (int) dp[N][K];
    }
}