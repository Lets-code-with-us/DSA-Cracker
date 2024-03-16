### Explanation:

1. **Creating the Graph**: 
   - The code begins by building an adjacency list representation of the input graph. It initializes a `HashMap<Integer, List<Integer>>` called `graph`, where the key represents each node, and the value is a list containing its adjacent nodes.

2. **Finding Leaves (Nodes with Degree 1)**:
   - It then iterates through all nodes (`0` to `n-1`) and identifies the leaves (nodes with only one neighbor) by checking if the size of the adjacency list for a node is `1`. These leaves are stored in a list called `leaves`.

3. **Removing Leaves Iteratively**:
   - The code enters a loop where it removes leaves iteratively until the graph collapses into one or two nodes. The loop continues as long as there are leaves (`!leaves.isEmpty()`) and the total number of nodes is greater than `2` (`n > 2`).
   - Within each iteration of the loop:
     - It creates an empty list called `newLeaves` to store the new leaves after removing the current ones.
     - It iterates through each leaf in the `leaves` list and removes it from the graph by removing the edge between the leaf and its neighbor.
     - The total node count `n` is decremented for each removed leaf.
     - If removing a leaf reduces its neighbor's degree to `1`, meaning it becomes a new leaf, the neighbor is added to the `newLeaves` list.
   - After processing all leaves in the current iteration, the `leaves` list is updated with the contents of `newLeaves`.

4. **Returning the Result**:
   - Once the loop terminates, the remaining nodes in the `leaves` list represent the roots of the minimum height trees in the graph. These roots are returned as the final result.

### Time Complexity:
- Constructing the graph: O(n + m), where `n` is the number of nodes and `m` is the number of edges.
- Finding leaves and removing them: O(n), where `n` is the number of nodes.
- Overall time complexity: O(n + m), where `n` is the number of nodes and `m` is the number of edges.
