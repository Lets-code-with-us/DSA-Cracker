-Breakdown

1. Class and Method:

-class Solution { ... }: Defines a class named Solution.

-public List<List<Integer>> pacificAtlantic(int[][] heights): This public method takes a 2D integer array heights representing the height map and returns a list of lists containing the row and column indices of cells that can drain to both oceans.

2. Setting Up:

-int rows = heights.length, cols = heights[0].length: Gets the number of rows and columns from the input heights array.

-boolean[][] pac = new boolean[rows][cols];: Creates a 2D boolean array pac of the same size as heights to track if a cell can reach the Pacific Ocean.

-boolean[][] atl = new boolean[rows][cols];: Creates another 2D boolean array atl to track if a cell can reach the Atlantic Ocean.

3. Initial DFS Calls:

#Iterate over columns (Pacific Ocean):

-for (int col = 0; col< cols; col++) {...}: Loops through each column.

-dfs(0, col, rows, cols, pac, heights[0][col], heights);: Calls the dfs function starting from the top cell of each column (represents Pacific Ocean).

-dfs(rows-1, col,rows, cols, atl, heights[rows-1][col], heights);: Calls the dfs function starting from the bottom cell of each column (represents Pacific Ocean).

#Iterate over rows (Atlantic Ocean):

-for (int row = 0; row<rows; row++){...}: Loops through each row.

-dfs(row, 0,rows, cols, pac, heights[row][0], heights);: Calls the dfs function starting from the leftmost cell of each row (represents Atlantic Ocean).

-dfs(row, cols-1,rows, cols, atl, heights[row][cols-1], heights);: Calls the dfs function starting from the rightmost cell of each row (represents Atlantic Ocean).

4. Finding Common Cells:

-List<List<Integer>> result = new ArrayList<List<Integer>>();: Creates an empty list result to store the final output (cells reaching both oceans).

#Iterate over all cells:

-for (int i = 0; i < rows; i++) {...}: Loops through each row.

-for (int j = 0; j < cols; j++){...}: Loops through each column within the current row.

-if (pac[i][j] && atl[i][j]) {...}: Checks if the current cell can reach both Pacific (pac[i][j]) and Atlantic (atl[i][j]) Oceans.

-result.add(Arrays.asList(i,j));: If both conditions are true, adds the current cell's row and column indices to the result list.

5. Depth-First Search (dfs) Function:

-private void dfs(int row, int col, ...): This recursive function performs a Depth-First Search (DFS) traversal starting from a given cell.

#Base Cases (stop conditions):

-if (row < 0 || row >= rows || col < 0 || col >= cols || visited[row][col] || prevHeight > heights[row][col]) return;: Stops recursion if:

-Cell is out of bounds.

-Cell has already been visited (prevents cycles).

-Water cannot flow from the previous cell to the current cell (due to lower height).

#Mark cell as visited:

-visited[row][col]= true;: Marks the current cell as visited to avoid revisiting.

#Recursive Calls (explore neighbors):

-dfs(row+1, col, ...): Calls dfs recursively on the cell below (if valid).

-dfs(row-1, col, ...): Calls dfs
