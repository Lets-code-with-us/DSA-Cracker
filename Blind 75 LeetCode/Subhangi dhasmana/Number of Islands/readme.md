# Code Explanation: Number of Islands - Python Solution

## Explanation:

- The dfs method is a depth-first search algorithm that explores the grid starting from a given cell (i, j) and marks all connected cells containing '1' with '#'.
- The numIslands method iterates through all cells in the grid. When it encounters a '1', it initiates a depth-first search from that cell using the dfs method, marking all connected '1's as visited. Each time it initiates a search, it increments the count of islands.
- At the end of the iteration, the count represents the total number of islands in the grid.

## Complexity:
- Time Complexity: O(m * n)
- Space Complexity: O(m * n)