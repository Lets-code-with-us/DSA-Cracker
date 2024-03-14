# Code Explanation: Pacific Atlantic Water Flow - Python Solution

## Explanation:

- The pacificAtlantic function takes a 2D list of integers representing heights of land and returns a list of coordinates where water can flow from the Pacific Ocean to the Atlantic Ocean (or vice versa) via continuous increase in height.
- It utilizes depth-first search (DFS) to explore the heights matrix.
- Two sets, pac and atl, are used to store coordinates reachable from the Pacific and Atlantic oceans respectively.
- The dfs function recursively explores neighboring cells, marking them as visited if the water can flow from the previous cell to the current one.
- Initial DFS calls are made from the edges of the matrix, corresponding to the Pacific and Atlantic oceans.
- After DFS traversal, the function iterates through all cells to find those reachable from both oceans, appending their coordinates to the result list.

## Complexity:
- Time Complexity: O(rows * cols)
- Space Complexity: O(rows * cols)