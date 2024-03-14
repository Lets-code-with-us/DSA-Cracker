## Class: Solution

This class contains a method `uniquePaths()` to find the number of unique paths from the top-left corner to the bottom-right corner of a grid of size `m x n`.

### Method: `uniquePaths`

Finds the number of unique paths from the top-left corner to the bottom-right corner of a grid of size `m x n`.

#### Parameters

- `m`: An integer representing the number of rows in the grid.
- `n`: An integer representing the number of columns in the grid.

#### Returns

An integer representing the number of unique paths from the top-left corner to the bottom-right corner of the grid.

#### Approach

1. **Initialize Grid:**
   - Create a 2D vector `dp` of size `m x n` and initialize all elements to 1.
   - If the grid has only one cell (i.e., `m=1` and `n=1`), return 0.

2. **Dynamic Programming:**
   - Iterate over the grid starting from the second row and second column (index 1,1).
   - For each cell `(i,j)`, the number of unique paths to reach that cell is the sum of the number of paths from the cell above `(i-1,j)` and the cell to the left `(i,j-1)`.
   - Update the value of `dp[i][j]` accordingly.

3. **Return Result:**
   - Return the value of `dp[m-1][n-1]`, which represents the number of unique paths from the top-left corner to the bottom-right corner of the grid.

#### Time Complexity
- The time complexity of this method is O(m * n) since we iterate over all cells of the grid once to compute the number of unique paths.

#### Space Complexity
- The space complexity of this method is O(m * n) since we use a 2D vector `dp` of size `m x n` to store the intermediate results.
