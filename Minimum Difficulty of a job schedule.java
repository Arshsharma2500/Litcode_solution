class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        int n = jobDifficulty.length;
        
        // If it's not possible to schedule the jobs in 'd' days
        if (n < d) {
            return -1;
        }
        
        // dp[i][k] represents the minimum difficulty to schedule first i jobs in k days
        int[][] dp = new int[n + 1][d + 1];
        for (int[] row : dp) {
            Arrays.fill(row, Integer.MAX_VALUE / 2);
        }
        
        // Base case: to schedule 0 jobs in 0 days, difficulty is 0
        dp[0][0] = 0;
        
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= d; k++) {
                int maxDifficulty = 0;
                for (int j = i; j >= 1; j--) {
                    maxDifficulty = Math.max(maxDifficulty, jobDifficulty[j - 1]);
                    dp[i][k] = Math.min(dp[i][k], dp[j - 1][k - 1] + maxDifficulty);
                }
            }
        }
        
        return dp[n][d];
    }
}