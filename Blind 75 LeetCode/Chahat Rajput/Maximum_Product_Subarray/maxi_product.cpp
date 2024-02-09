class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n = nums.size(),ans = 1, maxi=INT_MIN;

        for(int i=0;i<n;i++){
            ans*=nums[i];
            maxi=max(ans,maxi);

            if(ans == 0){
                ans=1;
            }
        }
        ans=1;
        for(int i=n-1;i>=0;i--){
            ans*=nums[i];
            maxi=max(ans,maxi);

            if(ans == 0){
                ans=1;
            }
        }
        
    return maxi;
    }
    
};