class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
    {
        std::ios::sync_with_stdio(false);
        cin.tie(nullptr);
        cout.tie(nullptr);
    }
        unordered_map<int, int> mp;
        for(auto it:nums){
            if(mp[it]>0)
                return true;
            mp[it]++;
        }
        return false;
    }
};
