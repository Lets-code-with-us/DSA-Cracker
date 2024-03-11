class Solution {
public:
    vector<int> findMinHeightTrees(int n, vector<vector<int>>& edges) {
        if (n == 1) return {0};
        
        vector<vector<int>> AL(n);
        vector<int> indegree(n);
        for (const auto& edge : edges) {
            int a = edge[0], b = edge[1];
            AL[a].push_back(b);
            AL[b].push_back(a);
            indegree[a]++;
            indegree[b]++;
        }
        
        queue<int> q;
        vector<int> ans; 
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 1) q.push(i); 
        }
        
        while (!q.empty()) {
            int sz = q.size();
            ans.clear(); 
            while (sz--) {
                int curr = q.front();
                ans.push_back(curr);
                indegree[curr]--;
                q.pop();
                for (int n : AL[curr]) {
                    indegree[n]--;
                    if (indegree[n] == 1) q.push(n);
                }
            }
        }
        
        return ans;
    }
};
