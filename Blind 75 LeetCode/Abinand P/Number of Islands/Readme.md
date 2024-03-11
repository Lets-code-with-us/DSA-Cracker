## Class: Solution

This class contains a method `numIslands()` to count the number of islands in a given grid.

### Method: `numIslands`

Counts the number of islands in a given grid.

#### Parameters

- `grid`: A 2D vector of characters representing the grid where '1' represents land and '0' represents water.

#### Returns

An integer representing the number of islands in the grid.

#### Approach

1. **Depth-First Search (DFS):**
   - Iterate through each cell of the grid.
   - If the current cell represents land ('1'), increment the island count and perform a DFS traversal to mark all adjacent land cells as visited.
   - During the DFS traversal, mark visited land cells as '0' to avoid re-visiting them.

#### Time Complexity
- The time complexity of this method is O(m * n), where m is the number of rows and n is the number of columns in the grid. The method iterates through each cell of the grid once and performs a DFS traversal if the cell represents land.

#### Space Complexity
- The space complexity of this method is O(1) because it uses only a constant amount of extra space regardless of the size of the grid.
