## Class: Solution

This class contains a method `cloneGraph()` to clone an undirected graph represented by a list of nodes.

### Method: `cloneGraph`

Clones an undirected graph represented by a list of nodes.

#### Parameters

- `node`: A pointer to the starting node of the original graph.

#### Returns

- A pointer to the starting node of the cloned graph.

#### Approach

1. **Depth-First Search (DFS) with Hash Map:**
   - Implement a DFS traversal to traverse the original graph and create a clone of each node.
   - Use a hash map to keep track of the mapping between original nodes and their corresponding clones.
   - If a node is visited, check if its clone exists in the hash map. If it does, retrieve the clone; otherwise, create a new clone node.
   - Recursively clone the neighbors of each node by traversing its neighbor list.
   - Update the neighbor list of the clone node with cloned neighbor nodes.

2. **Initialization:**
   - Initialize an empty hash map `mp` to store the mapping between original nodes and their clones.

3. **Check for Null Graph:**
   - If the input `node` is nullptr, return nullptr to indicate an empty graph.
   - If the input `node` has no neighbors (i.e., isolated node), create a clone with the same value and return it.

4. **DFS Cloning:**
   - Call the `dfs` function with the input `node` and the hash map `mp`.
   - The `dfs` function recursively clones each node and its neighbors, updating the hash map as needed.

5. **Return Result:**
   - After the DFS traversal is completed, return the cloned node corresponding to the starting node of the original graph.

#### Time Complexity
- The time complexity of this method is O(V + E), where V is the number of nodes (vertices) and E is the number of edges in the graph. This complexity arises from traversing each node and its neighbors once during the DFS traversal.

#### Space Complexity
- The space complexity of this method is O(V), where V is the number of nodes in the graph. This complexity arises from using the hash map to store mappings between original nodes and their clones. Additionally, the recursive stack space for DFS traversal contributes to the space complexity.
