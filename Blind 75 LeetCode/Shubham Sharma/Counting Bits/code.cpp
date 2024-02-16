class Solution {
public:
    vector<int> countBits(int n) {
        if (n == 0) return vector<int>(1, 0);
        vector<int> ans(2, 0);
        ans[1] = 1;
        while (ans.size() <= n){
            int curLen = ans.size();
            for(int i = 0; i < curLen && ans.size() <= n; i++){
                ans.push_back((ans[i] + 1));
            }
        }
        return ans;
    }
};
