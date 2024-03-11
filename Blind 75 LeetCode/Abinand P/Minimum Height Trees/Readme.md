## Class: Solution

This class contains a method `findMinHeightTrees()` to find the minimum height trees (MHTs) in a given undirected tree represented by the number of nodes `n` and the list of edges `edges`.

### Method: `findMinHeightTrees`

Finds the minimum height trees (MHTs) in the given undirected tree.

#### Parameters

- `n`: An integer representing the number of nodes in the tree.
- `edges`: A vector of vectors representing the edges in the tree. Each inner vector contains two integers representing an edge between two nodes.

#### Returns

A vector of integers representing the nodes that form the minimum height trees (MHTs).

#### Approach

1. **Initialize Adjacency List:**
   - Initialize an adjacency list `adj` to represent the undirected graph, where `adj[i]` contains a set of nodes connected to node `i`.
   - Iterate through each edge in `edges`:
     - Add the opposite node to the adjacency list of both nodes in the edge.
2. **Find Leaf Nodes:**
   - Initialize an empty vector `leaves` to store leaf nodes.
   - Iterate through each node in the graph:
     - If the number of nodes connected to the current node is 1 (i.e., it is a leaf node), add it to the `leaves` vector.
3. **Iterative Pruning:**
   - While the total number of nodes in the graph is greater than 2:
     - Reduce the total number of nodes by the number of leaf nodes.
     - Initialize an empty vector `newLeaves` to store new leaf nodes.
     - Iterate through each leaf node in `leaves`:
       - Find its connected node `j`.
       - Remove the leaf node from the adjacency list of `j`.
       - If the number of nodes connected to `j` becomes 1 after removal (i.e., it becomes a new leaf node), add `j` to the `newLeaves` vector.
     - Update `leaves` to `newLeaves`.
4. **Return Result:**
   - Return the `leaves` vector, which represents the nodes forming the minimum height trees (MHTs).

#### Time Complexity
- The time complexity of this method is O(N), where N is the number of nodes in the tree.
  - Constructing the adjacency list requires traversing the edges once, resulting in a linear time complexity.
  - The iterative pruning process also runs in linear time, as each node is visited once.

#### Space Complexity
- The space complexity of this method is O(N), where N is the number of nodes in the tree.
  - The space used is dominated by the adjacency list and the vectors `leaves` and `newLeaves`, all of which can potentially store all nodes in the tree.
