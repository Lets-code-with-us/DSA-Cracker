class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        unordered_map<int,int> mp;
        for(const auto& x: nums){
            mp[x]++;
            if(mp[x]>1) return true;
        }
        return false;
        
    }
};
