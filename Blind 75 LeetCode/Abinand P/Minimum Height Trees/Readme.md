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

1. **Initialize Adjacency List and Indegree Arrays:**
   - Initialize an adjacency list `AL` to represent the undirected graph. Each node in `AL` contains a list of nodes connected to it.
   - Initialize an indegree array `indegree` to keep track of the number of incoming edges for each node.
   - Iterate through each edge in `edges`:
     - Add both nodes to each other's adjacency list in `AL`.
     - Increment the indegree of both nodes in the `indegree` array.
2. **Find Initial Leaves and Queue Initialization:**
   - Initialize an empty queue `q`.
   - Initialize an empty vector `ans` to store the nodes forming the MHTs.
   - Iterate through each node in the graph:
     - If the indegree of a node is 1 (i.e., it is a leaf node), push it onto the queue.
3. **Breadth-First Search (BFS):**
   - While the queue is not empty:
     - Store the current size of the queue `sz`.
     - Clear the `ans` vector to prepare for the next level of BFS traversal.
     - Iterate through each node in the current level (based on `sz`):
       - Remove the current node from the queue and add it to the `ans` vector.
       - Decrement its indegree.
       - Iterate through each neighbor of the current node:
         - Decrement the indegree of the neighbor.
         - If the neighbor becomes a leaf node (indegree equals 1), push it onto the queue.
4. **Return Result:**
   - Return the `ans` vector, which represents the nodes forming the minimum height trees (MHTs).

#### Time Complexity
- The time complexity of this method is O(N), where N is the number of nodes in the tree.
  - Constructing the adjacency list and the indegree array requires traversing the edges once, resulting in a linear time complexity.
  - The BFS traversal also runs in linear time, as each node is visited once.

#### Space Complexity
- The space complexity of this method is O(N), where N is the number of nodes in the tree.
  - The space used is dominated by the adjacency list, the indegree array, the queue, and the `ans` vector, all of which can potentially store all nodes in the tree.
