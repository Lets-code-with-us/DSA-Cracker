# Code Explanation: Minimum Height Trees - Python Solution

## Explanation:

- The findMinHeightTrees function takes an integer n representing the number of nodes and a list of lists edges representing the edges between nodes in a graph.
- It first checks if there is only one node (n == 1), in which case it returns that node.
- Then, it creates an adjacency list to represent the graph.
- It initializes a list leaves with nodes that have only one neighbor (degree 1).
- It iteratively removes leaves from the graph until only the centroids (minimum height trees) remain.
- It returns the centroids.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n+E)