class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        dp = [[0 for _ in range(n)] for _ in range(m)]
        dp[0][0] = 1

        for i in range(m):
            for j in range(n):
                val1 = 0
                val2 = 0
                if(j-1 >= 0):
                    val1 = dp[i][j-1]
                if(i-1 >= 0):
                    val2 = dp[i-1][j]
                dp[i][j] = dp[i][j] + val1 + val2
    

        return dp[m-1][n-1]