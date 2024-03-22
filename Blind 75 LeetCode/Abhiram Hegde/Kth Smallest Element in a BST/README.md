### Explanation

1. The `kthSmallest` method is the entry point of the solution. It takes a `TreeNode` representing the root of the BST and an integer `k` indicating the kth smallest element to find.
2. Inside `kthSmallest`, an array `count` of size 1 is initialized to keep track of the number of nodes visited so far. Another array `result` of size 1 is initialized to store the result node.
3. The `traverse` method is then called with the root node, `k`, `count`, and `result`.
4. The `traverse` method performs an in-order traversal of the BST recursively.
5. In the `traverse` method, if the current node is null (indicating an empty subtree), the method returns.
6. Otherwise, the `traverse` method recursively calls itself for the left subtree.
7. After traversing the left subtree, the `count` is incremented, indicating that a node has been visited.
8. If the current count equals `k`, it means we have found the kth smallest element. In this case, the `result` array is updated with the current node, and the traversal is terminated.
9. If the kth smallest element is not found yet, the `traverse` method continues by recursively calling itself for the right subtree.
10. After traversing both left and right subtrees, the `result` array will contain the kth smallest element, and it is returned by the `kthSmallest` method.
