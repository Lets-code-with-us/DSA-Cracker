class Solution:
    def climbStairs(self, n: int) -> int:
        if n==1 or n==2: return n
        dp = [-1]*(n+1)
        dp[1] = 1
        dp[2] = 2
        for i in range(3, n+1):
            dp[i] = dp[i-1]+dp[i-2]
        return dp[n]