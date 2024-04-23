## Explanation:

The provided code defines a `Solution` class with a method `invertTree` that takes a `TreeNode` object `root` as input and returns the inverted binary tree rooted at `root`.

1. **Base Case Check**: If the `root` is `null`, indicating an empty tree or a leaf node, the method returns `null`, as there is nothing to invert.

2. **Recursive Inversion**: 
    - The method recursively calls itself to invert the left subtree and right subtree of the current `root`.
    - The result of inverting the left subtree is stored in `left`.
    - The result of inverting the right subtree is stored in `right`.

3. **Swapping Nodes**:
    - The `left` subtree of the current `root` is set to `right`, effectively swapping the left and right subtrees.
    - The `right` subtree of the current `root` is set to `left`.

4. **Return Root**: 
    - Finally, the method returns the root of the inverted tree.

## Time Complexity:
- The time complexity of this algorithm is O(n), where n is the number of nodes in the binary tree. This is because the algorithm visits each node once.

## Space Complexity:
- The space complexity of this algorithm is O(n), where n is the height of the binary tree. This is because the algorithm uses recursion, and the depth of the recursion stack can be at most equal to the height of the tree.
