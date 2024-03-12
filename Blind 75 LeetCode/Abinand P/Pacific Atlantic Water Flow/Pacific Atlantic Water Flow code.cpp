class Solution {
    void dfs(vector<vector<int>>& heights, vector<vector<bool>>& visited, int i, int j, int m, int n){
        visited[i][j]= true;
        if(i>0 && !visited[i-1][j] && heights[i-1][j]>= heights[i][j]) dfs(heights, visited, i-1, j,m,n);
        if(i<m-1 && !visited[i+1][j] && heights[i+1][j]>= heights[i][j]) dfs(heights, visited, i+1, j, m, n);
        if(j>0 && !visited[i][j-1] && heights[i][j-1]>= heights[i][j]) dfs(heights, visited, i, j-1, m,n);
        if(j<n-1 && !visited[i][j+1] && heights[i][j+1]>= heights[i][j]) dfs(heights, visited, i,j+1,m,n);
    }
public:
    vector<vector<int>> pacificAtlantic(vector<vector<int>>& heights) {
        int m = heights.size();
        int n = heights[0].size();
        vector<vector<bool>> pacific(m, vector<bool>(n));
        vector<vector<bool>> atlantic(m, vector<bool>(n));
        for(int i=0;i<m;i++){
            dfs(heights, pacific, i,0,m,n);
            dfs(heights, atlantic, i, n-1, m,n);
        }
        for(int j =0;j<n;j++){
            dfs(heights, pacific, 0,j,m,n);
            dfs(heights, atlantic, m-1, j,m,n);
        }
        vector<vector<int>> res;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) if(pacific[i][j]&&atlantic[i][j]) res.push_back({i,j});
        }
        return res;
    }
};
