Explanation:-Number of Islands


Approach:-


**Detailed Approach**

1.Initialize a counter variable island to keep track of the number of islands.

2.Iterate through each cell in the grid.

3.If a '1' is encountered and the cell has not been visited (vis[i][j] == 0), initiate a DFS to explore and mark the connected island.

4.The DFS function updates the vis array to mark visited cells and recursively explores the adjacent cells of the current cell.

5.Return the total count of islands.

**Complexity**

Time:-O(m*n),where n is the number of rows and m is the number of columns. Each cell is visited once, and the DFS can take up to O(n*m) in the worst case.

Space:-O(1),only for storing count of islands not any extra space is used.