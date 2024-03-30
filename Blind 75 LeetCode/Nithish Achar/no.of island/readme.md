## Counting Islands in a Grid

**Problem:**

Given a 2D grid where each cell represents land ('1') or water ('0'), count the number of separate islands present in the grid. An island is considered a connected group of land cells surrounded by water (either on the edges or by other water cells).

**Steps:**

1. **Input:**

   - `grid`: A 2D character array representing the grid.

2. **Handle Empty Grid:**

   - If `grid` is null, has zero rows, or zero columns, return 0 (no islands).

3. **Iterate through the Grid:**

   - Use nested `for` loops (`i` and `j`) to visit each cell in the grid.

4. **Find Unvisited Land:**

   - If the current cell is unvisited land (`grid[i][j] == '1'`), we've found a potential new island:
     - Increment a `count` variable to track the number of islands found so far.
     - Call the `dfs` function to explore and mark the entire island as visited (using '0' for water).

5. **Depth-First Search (DFS):**

   - This recursive function explores all connected land cells (the island) starting from the current cell.
   - It checks for boundary conditions (out of grid) and visited cells (already marked as water).
   - If the current cell is valid unvisited land, it's marked as visited.
   - The function then recursively explores the four neighboring cells (up, down, left, right) to continue island exploration.

6. **Output:**

   - Return the `count` variable, which represents the total number of islands found in the grid.

**Explanation:**

1. The code iterates through each cell in the grid using nested loops.
2. If a cell is unvisited land (marked as '1'), it signifies the beginning of a new island.
3. The `dfs` function recursively explores and marks all connected land cells as visited, effectively removing them from further island search.
4. By the end of the grid traversal, the `count` variable holds the total number of islands discovered.

**Key Points:**

- DFS helps explore connected land areas efficiently.
- Marking visited cells prevents revisiting them and ensures each island is counted only once.
