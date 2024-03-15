class Solution {
public:
    vector<string> findItinerary(vector<vector<string>>& tickets) {
        unordered_map<string, vector<string>> hashm;
        for (const auto& i : tickets) {
            hashm[i[0]].push_back(i[1]);
        }
        for (auto& i : hashm) {
            sort(i.second.begin(), i.second.end(), greater<string>());
        }
        vector<string> res;
        
        function<void(string)> dfs = [&](string i) {
            while (!hashm[i].empty()) {
                string next = hashm[i].back();
                hashm[i].pop_back();
                dfs(next);
            }
            res.push_back(i);
        };
        
        dfs("JFK");
        reverse(res.begin(), res.end());
        return res;
    }
};
