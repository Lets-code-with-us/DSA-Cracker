## Class: Solution

This class provides a solution to find the lowest common ancestor (LCA) of two nodes in a binary tree.

### Method

#### `lowestCommonAncestor`

This method finds the lowest common ancestor of two nodes `p` and `q` in a binary tree.

##### Parameters

- `root`: A pointer to the root node of the binary tree.
- `p`: A pointer to the first node.
- `q`: A pointer to the second node.

##### Returns

The lowest common ancestor of nodes `p` and `q`.

### Approach

1. **Base Case:**
   - If the root is `NULL` or if either `p` or `q` is equal to the root, return the root.

2. **Recursive Calls:**
   - Recursively call the `lowestCommonAncestor` function on the left and right subtrees of the root.
   - Store the results in `left` and `right`.

3. **Check Results:**
   - If `left` is `NULL`, return `right`.
   - If `right` is `NULL`, return `left`.
   - If both `left` and `right` are not `NULL`, it means `p` and `q` are on different sides of the current root. Return the current root as the lowest common ancestor.

### Time Complexity
- The time complexity of this method is \(O(n)\), where \(n\) is the number of nodes in the binary tree. This is because we traverse each node of the tree once.

### Space Complexity
- The space complexity of this method is \(O(h)\), where \(h\) is the height of the binary tree. This is due to the recursive calls on the call stack, which can go as deep as the height of the tree.
