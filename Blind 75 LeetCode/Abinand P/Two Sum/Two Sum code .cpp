class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> result;
        unordered_map<int,int> mapp;
        for(int i=0;i<nums.size();i++){
            if (mapp.find(target-nums[i])!=mapp.end()){
                result.push_back(mapp[target-nums[i]]);
                result.push_back(i);
                return result;
            }
            mapp[nums[i]]=i;
        }
        return result;

    }
};
