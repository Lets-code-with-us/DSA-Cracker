class Solution {
public:
    vector<int> twoSum(vector<int>& a, int t) {
        unordered_map<int, int> mp;
        int n= a.size();
        for(int i=0;i<n;i++)
        {
            int comp= t- a[i];
            if(mp.count(comp))
                return {mp[comp], i};
            mp[a[i]]= i;
        }
        return {};
    }
};
