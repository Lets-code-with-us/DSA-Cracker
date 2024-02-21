class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
        int n=nums.size();
        vector<int>dp(n+1);

        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j])
                    if(dp[j]+1 > dp[i])
                        dp[i]=dp[j]+1;
            }
        }
        int maxindex=0;
        for(int i=0;i<n;i++){
            if(dp[i]>dp[maxindex]){
                maxindex=i;
            }
        }
    return dp[maxindex]+1;
    }
};