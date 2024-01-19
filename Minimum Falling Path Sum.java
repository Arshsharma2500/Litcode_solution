class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;

        
        int[][] dp = new int[n][n];

        
        for (int i = 0; i < n; i++) {
            dp[0][i] = matrix[0][i];
        }

      
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                
                dp[i][j] = matrix[i][j] + getMin(dp, i - 1, j, n);
            }
        }

       
        int minSum = dp[n - 1][0];
        for (int i = 1; i < n; i++) {
            minSum = Math.min(minSum, dp[n - 1][i]);
        }

        return minSum;
    }
    private static int getMin(int[][] dp, int row, int col, int n) {
        int left = col > 0 ? dp[row][col - 1] : Integer.MAX_VALUE;
        int center = dp[row][col];
        int right = col < n - 1 ? dp[row][col + 1] : Integer.MAX_VALUE;

        return Math.min(left, Math.min(center, right));
    }
}
