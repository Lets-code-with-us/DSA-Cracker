class Solution {
public:
    int maxProduct(vector<int>& nums) {
       int ma=1;
       int mi=1;
       int ans=INT_MIN;

       for(int i=0; i<nums.size(); i++)
       {
           if(nums[i] < 0)
           {
               swap(ma, mi);
           }
           ma= max(nums[i], nums[i]*ma);
           mi= min(nums[i], nums[i]*mi);
           ans = max(ma, ans);
       }
       return ans;
    }
};