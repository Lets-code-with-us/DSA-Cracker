1. The `lowestCommonAncestor` method takes three parameters: `root`, `p`, and `q`, where `root` is the root node of the binary search tree, and `p` and `q` are the two nodes whose lowest common ancestor needs to be found.

2. The method starts by checking if the `root` is null. If the `root` is null, it means the tree is empty, so it returns null as there can't be a common ancestor.

3. Next, it checks if both `p` and `q` are smaller than the `root`'s value. If they are, it means both `p` and `q` are in the left subtree of the current `root`. Therefore, it recursively calls the `lowestCommonAncestor` method with the left child of the current `root`.

4. If both `p` and `q` are greater than the `root`'s value, it means both `p` and `q` are in the right subtree of the current `root`. Therefore, it recursively calls the `lowestCommonAncestor` method with the right child of the current `root`.

5. If neither of the above conditions is true, it means one node is on the left of the root and the other is on the right. In this case, the `root` itself is the lowest common ancestor, so it returns the `root`.

6. The method recursively traverses the tree until it finds the lowest common ancestor or reaches the end of the tree.

7. Finally, it returns the lowest common ancestor found during the traversal.
