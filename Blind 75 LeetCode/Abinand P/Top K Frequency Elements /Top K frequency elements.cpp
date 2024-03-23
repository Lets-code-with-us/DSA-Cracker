class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int,int> mp;
        
        for(int i=0;i<nums.size();i++) mp[nums[i]]++;
        vector<pair<int,int>> mps(mp.begin(),mp.end());
        sort(mps.begin(),mps.end(),[](const auto& a, const auto& b){
            return a.second > b.second;
        });
        vector<int> ans;
        for(int i = 0; i < k && i < mps.size(); i++) {
            ans.push_back(mps[i].first);
        }
        return ans;
    }
};
