# Code Explanation: Unique paths - Python Solution

## Explanation:

- dp = [[0 for _ in range(n)] for _ in range(m)]: This line initializes a 2D array dp of size m x n filled with zeros. This array will be used to store the number of unique paths to reach each cell in the grid.
- dp[0][0] = 1: Set the starting cell (top-left corner) to 1, as there's only one way to reach it, which is not moving at all.
- The nested loops iterate through each cell of the grid:
1. for i in range(m) iterates through each row.
2. for j in range(n) iterates through each column.
- Within the nested loops, the code calculates the number of unique paths to reach the current cell (i, j):
1. val1 and val2 are initialized to 0, representing the number of paths coming from the left cell and the top cell respectively.
2. If the current cell is not at the leftmost edge (j-1 >= 0), val1 is assigned the number of unique paths from the cell to the left.
3. If the current cell is not at the topmost edge (i-1 >= 0), val2 is assigned the number of unique paths from the cell above.
4. The current cell's value in the dp array is updated by adding the values of val1 and val2.
- Finally, the function returns the value stored in the bottom-right corner of the dp array, which represents the total number of unique paths to reach that cell.

## Complexity:
- Time Complexity: O(m*n)
- Space Complexity: O(m*n)