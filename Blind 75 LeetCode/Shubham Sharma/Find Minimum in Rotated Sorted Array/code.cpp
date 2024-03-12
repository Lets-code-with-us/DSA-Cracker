class Solution{
   public:

   int findmin(vector<int>& nums){
    sort(nums.begin(), nums.end());
    return nums[0];
   }
};