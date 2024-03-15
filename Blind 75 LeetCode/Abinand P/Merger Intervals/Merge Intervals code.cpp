class Solution {
public:
    vector<vector<int>> merge(vector<vector<int>>& intervals) {
        sort(intervals.begin(),intervals.end());
        vector<vector<int>> ans;
        for(int i=0;i<intervals.size();i++){
            if(ans.empty()|| intervals[i][0]> ans.back()[1]) ans.push_back(intervals[i]);
            else ans.back()[1] = max(intervals[i][1], ans.back()[1]);
        }
        return ans;
    }
};
