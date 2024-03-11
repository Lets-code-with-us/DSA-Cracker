class Solution {
public:
// Approach-1:

    // int solve(int n, vector<int>& dp) {
    //     if(n<0) return 0;
    //     if(dp[n] != -1) return dp[n];
    //     if(n==0) return 1;

    //     int one_solve= solve(n-1, dp);
    //     int two_solve= solve(n-2, dp);      

    //     return dp[n] = one_solve + two_solve;  
    // }

// Approach-2:

    int climbStairs(int n) {

        if(n==0 || n==1 || n==3) return n;
        vector<int> dp(n+1, -1);
        dp[0] = 1;
        dp[1] = 1;

        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }
};