class Solution {
    public int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0)
            return 0;

        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        // Traverse each cell in the grid
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == '1') { // Found a new island
                    count++;
                    dfs(grid, i, j); // Mark the entire island as visited
                }
            }
        }

        return count;
    }

    // Depth-first search to mark the entire island as visited
    private void dfs(char[][] grid, int row, int col) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] == '0')
            return;

        grid[row][col] = '0'; // Mark the cell as visited

        // Recursively explore neighboring cells
        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}
