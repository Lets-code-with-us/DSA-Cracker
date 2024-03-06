class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n=nums.size();
        int maxi=INT_MIN;
        int currMax = 1;
        int currMin = 1;

        for(int i=0;i<n;i++){
            if (nums[i] < 0) {
                swap(currMax, currMin);
            }
            currMax=max(nums[i],currMax*nums[i]);
            currMin = min(nums[i], currMin * nums[i]);
            maxi=max(maxi,currMax);
        }
        return maxi;
    }
};
