class Solution {
public:
    int missingNumber(vector<int>& nums) {
        int n=nums.size();
        sort(begin(nums), end(nums));
        for(int i=0; i<n; i++){
           if(nums[i]==i) continue;
           else return i;
        }
        return n;
    }
};