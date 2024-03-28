**Assumptions:**

- The grid represents a height map, where water flows from higher to lower points.
- The Pacific Ocean borders the left and top edges of the grid.
- The Atlantic Ocean borders the right and bottom edges of the grid.

**Steps:**

1. **Input:** `heights` - A 2D integer array representing the height of each cell in the grid.

2. **Handle Empty Grid:** If `heights` is null, has zero rows, or zero columns, return an empty list (no reachable cells).

3. **Grid Dimensions:**

   - `rows` - Number of rows in the grid.
   - `cols` - Number of columns in the grid.

4. **Reachability Arrays:**

   - `canReachPacific`: Boolean array to track cells reachable from the Pacific Ocean.
   - `canReachAtlantic`: Boolean array to track cells reachable from the Atlantic Ocean.

5. **Border Exploration (DFS):**

   - Iterate through the first and last rows and columns (`i` and `j` loops).
   - For each border cell:
     - Perform DFS starting from that cell using `dfs(heights, canReachPacific/Atlantic, row, col, Integer.MIN_VALUE)`.
       - `Integer.MIN_VALUE` ensures initial water level can flow anywhere.

6. **Identify Common Reachable Cells:**

   - Iterate through the grid (`i` and `j` loops).
   - For each cell:
     - If `canReachPacific[i][j]` and `canReachAtlantic[i][j]` are both true, add the cell's coordinates to the result list.

7. **Output:** Return a list containing coordinates (row, column) of cells reachable from both oceans.
