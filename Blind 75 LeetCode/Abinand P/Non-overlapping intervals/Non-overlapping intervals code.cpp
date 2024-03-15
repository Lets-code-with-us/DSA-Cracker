class Solution {
    static bool solve(vector<int>&a , vector<int> &b){return a[1] < b[1];}
public:
    int eraseOverlapIntervals(vector<vector<int>>& arr) {
        sort(arr.begin(),arr.end(),solve);
        int ans=1;
        int range=arr[0][1];
        for(int i=1;i<arr.size();i++)
        {
            if(arr[i][0]>=range)
            {
                range=arr[i][1];
                ans++;
            }
        }
        return arr.size()-ans;
    }
};
