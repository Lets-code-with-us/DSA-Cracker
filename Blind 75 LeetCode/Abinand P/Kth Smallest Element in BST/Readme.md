## Class: Solution

This class provides a solution to find the kth smallest element in a binary search tree (BST).

### Methods

#### `inorder`

This method performs an inorder traversal of the BST.

##### Parameters

- `root`: A pointer to the root node of the BST.

##### Returns

This method does not return any value. It populates the `ans` vector with the values of the nodes in the BST in sorted order.

#### `kthSmallest`

This method finds the kth smallest element in the BST.

##### Parameters

- `root`: A pointer to the root node of the BST.
- `k`: An integer representing the kth smallest element to find.

##### Returns

The value of the kth smallest element in the BST.

### Approach

1. **Inorder Traversal:**
   - Perform an inorder traversal of the BST to obtain the nodes in sorted order.
   - Store the values of the nodes in the `ans` vector.

2. **Return kth Element:**
   - Return the (k - 1)th element from the `ans` vector as the kth smallest element.

### Time Complexity
- The time complexity of the `inorder` method is \(O(n)\), where \(n\) is the number of nodes in the BST, as it traverses all nodes in the tree.
- The time complexity of the `kthSmallest` method is \(O(1)\) after the inorder traversal.

### Space Complexity
- The space complexity of the `inorder` method is \(O(n)\), where \(n\) is the number of nodes in the BST, due to the space used by the `ans` vector to store the inorder traversal.
- The space complexity of the `kthSmallest` method is \(O(1)\) as it does not use any additional space.
