class Solution {
    public int uniquePaths(int m, int n) {
        // Create a 2D array to store the number of unique paths to each cell.
        int[][] dp = new int[m][n];
        
        // Initialize the values for the first row and first column to 1.
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // Fill the dp array by summing up the number of paths from the top and left cells.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        
        // The value at dp[m - 1][n - 1] represents the number of unique paths from (0,0) to (m-1,n-1).
        return dp[m - 1][n - 1];
    }
}
