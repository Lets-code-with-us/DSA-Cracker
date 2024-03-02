# Sorted Array to Binary Search Tree

The provided JavaScript code defines a function `sortedArrayToBST` that converts a sorted array of numbers into a balanced Binary Search Tree (BST).

## Code Explanation:

```javascript
var sortedArrayToBST = function(nums) {
    // Check if the array is empty, return null for an empty tree
    if (!nums.length) return null;
    
    // Calculate the middle index of the array
    let mid = Math.floor(nums.length / 2);
    
    // Create a new TreeNode with the value of the middle element
    let node = new TreeNode(nums[mid]);
    
    // Recursively build the left and right subtrees
    node.left = sortedArrayToBST(nums.slice(0, mid));
    node.right = sortedArrayToBST(nums.slice(mid + 1));
    
    // Return the root of the BST
    return node;
};
```
## Explanation:

### Base Case:
- The function checks if the array `nums` is empty. If so, it returns `null`, indicating an empty tree.

### Midpoint Calculation:
- It calculates the middle index `mid` of the array using `Math.floor(nums.length / 2)`.

### Node Creation:
- It creates a new `TreeNode` named `node` with the value of the middle element `nums[mid]`.

### Recursive Build:
- Recursively, it builds the left subtree by calling `sortedArrayToBST` on the left half of the array (`nums.slice(0, mid)`).
- Recursively, it builds the right subtree by calling `sortedArrayToBST` on the right half of the array (`nums.slice(mid + 1)`).

### Return Result:
- The root of the resulting Binary Search Tree (BST) is returned.

## Complexity:
- Time Complexity: O(n) where n is the number of elements in the array.
- Space Complexity: O(log n) due to the recursive call stack (considering a balanced BST).
