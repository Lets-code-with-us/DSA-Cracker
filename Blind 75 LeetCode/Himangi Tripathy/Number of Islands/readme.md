class Solution {
    public int numIslands(char[][] grid) {
            int ans = 0;//ans is assigned 0

    for (int i = 0; i < grid.length; ++i)//we traverse the grid
      for (int j = 0; j < grid[0].length; ++j)//we traverse the 1st element of grid
        if (grid[i][j] == '1') {//if grid's ith and jth element is 1'
          dfs(grid, i, j);//dfs method is called
          ++ans;//ans is added
        }

    return ans;//return ans
  }

  private void dfs(char[][] grid, int i, int j) {
    if (i < 0 || i == grid.length || j < 0 || j == grid[0].length)//i is less than 0 or i is equal to the length of grid or j is less than 0 and j is less than 1st element of grid length
      return;//return back
    if (grid[i][j] != '1')//ith and jth element of grid is not equal to 1
      return;//return back

    grid[i][j] = '2'; // Mark '2' as visited.
    dfs(grid, i + 1, j);//dfs method called
    dfs(grid, i - 1, j);
    dfs(grid, i, j + 1);
    dfs(grid, i, j - 1);

        
    }
}