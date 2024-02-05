class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       
       vector<int> ans;
       map<int,int> mp;

       for(int i=0;i<nums.size();i++){
           mp[nums[i]] = i;
       }

       for(int i=0;i<nums.size();i++){
           if(mp.find(target-nums[i])!=mp.end() && mp[target-nums[i]]!=i){
               ans.push_back(i);
               ans.push_back(mp[target-nums[i]]);
               break;
           }
       }
       return ans;
    }
};
