class Solution {
public:
    int maxProfit(vector<int>& prices) {
       int dp[prices.size()];
       int mi = prices[0];
       dp[0]=0;

       for(int i = 1;i<prices.size();i++){
           if(prices[i]>mi){
               dp[i] = max(dp[i-1],prices[i]-mi);
            
           }
           else{
               mi = min(prices[i],mi);
               dp[i] = dp[i-1];
           }
       }

       return dp[prices.size()-1];
    
    }
};
