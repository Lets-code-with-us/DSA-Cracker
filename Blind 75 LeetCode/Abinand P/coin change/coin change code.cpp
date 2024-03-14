class Solution {
public:
    int coinChange(vector<int>& coins, int amount) {
        vector<int> dp(amount+1,-1);
        int result = helper(coins, amount, dp);
        return result==INT_MAX?-1:result;
    }
    int helper(vector<int>& coins,int amount, vector<int>& dp){
        if (amount == 0) return 0;
        if (amount<0) return INT_MAX;
        if(dp[amount]!=-1) return dp[amount];
        int steps  =INT_MAX;
        for(int i=0;i<coins.size();i++){
            int ans = helper(coins, amount - coins[i],dp);
            if(ans!=INT_MAX) steps = min(ans+1,steps);
        }
        dp[amount] = steps;
        return dp[amount];

    }
};
