## Class: Solution

This class contains a method `pacificAtlantic()` to find the cells where water can flow to both the Pacific and Atlantic oceans.

### Method: `pacificAtlantic`

Finds the cells where water can flow to both the Pacific and Atlantic oceans.

#### Parameters

- `heights`: A 2D vector representing the heights of the cells.

#### Returns

A 2D vector of pairs representing the cells where water can flow to both the Pacific and Atlantic oceans.

#### Approach

1. **Depth-First Search (DFS):**
   - Create two 2D boolean vectors, `pacific` and `atlantic`, of size m x n to mark cells that can reach the Pacific and Atlantic oceans, respectively.
   - Perform DFS from each border cell of the matrix to mark cells that can reach the Pacific and Atlantic oceans.
   - After DFS, iterate through each cell in the matrix and check if it can reach both the Pacific and Atlantic oceans. If so, add its coordinates to the result vector.

#### Time Complexity
- The time complexity of this method is O(m * n), where m is the number of rows and n is the number of columns in the input matrix. The method performs DFS on each cell in the matrix.

#### Space Complexity
- The space complexity of this method is O(m * n) because it uses two additional boolean matrices of the same size as the input matrix to store visited states for DFS.
