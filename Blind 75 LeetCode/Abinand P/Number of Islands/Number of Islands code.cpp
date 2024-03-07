class Solution {
    void dfs(vector<vector<char>>& grid, int i, int j){
        if(i<0 || i>=grid.size() || j<0 || j>= grid[0].size()||grid[i][j]=='0')return;
        grid[i][j] ='0';
        dfs(grid, i+1,j);
        dfs(grid, i-1,j);
        dfs(grid, i,j+1);
        dfs(grid, i, j-1);
    }
public:
    int numIslands(vector<vector<char>>& grid) {
        if(grid.empty()) return 0;
        int island = 0;
        for(int i=0;i<grid.size();i++){
            for(int j=0;j<grid[0].size();j++){
                if(grid[i][j] == '1'){
                    island++;
                    dfs(grid,i,j);
                }
            }
        }
        return island;
    }
};
