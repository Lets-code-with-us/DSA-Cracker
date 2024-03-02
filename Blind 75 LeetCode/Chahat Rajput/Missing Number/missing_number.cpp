class Solution {
public:
    int missingNumber(vector<int>& nums) {
        sort(nums.begin(),nums.end());
        int num=nums.size();
        for(int i=0;i<nums.size();i++){
            if(nums[i] != i){
                num=i;
                break;
            }
        }
        return num;
    }
};