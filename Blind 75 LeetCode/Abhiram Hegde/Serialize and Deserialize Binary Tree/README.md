### Code Explanation:

#### Serialization:
1. The `serialize` method takes a TreeNode `root` as input and returns its serialized string representation.
2. It initializes a `StringBuilder` `sb` to store the serialized string.
3. It calls the `preorder` method to perform a preorder traversal of the tree and append each node's value to the StringBuilder.
4. Returns the serialized string obtained from the StringBuilder.

#### Preorder Traversal:
1. The `preorder` method takes a TreeNode `root` and a StringBuilder `sb` as input.
2. If the `root` is null, it appends "X," to the StringBuilder to represent a null node.
3. If the `root` is not null, it appends the node's value followed by "," to the StringBuilder and recursively calls `preorder` on the left and right subtrees.

#### Deserialization:
1. The `deserialize` method takes a serialized string `data` as input and returns the reconstructed TreeNode.
2. It splits the `data` string by "," to obtain an array of node values.
3. It initializes an array `index` with a single element set to 0, which is used to keep track of the current index while traversing the `nodes` array.
4. It calls the `buildTree` method to recursively construct the TreeNode from the serialized data.

#### Building Tree:
1. The `buildTree` method takes an array of node values `nodes` and an index array `index` as input.
2. If the current node value is "X," it increments the index and returns null, indicating a null node.
3. Otherwise, it creates a new TreeNode with the current node value and recursively builds its left and right subtrees.
4. Returns the constructed TreeNode.

### Time Complexity:
- Serialization: The `serialize` method performs a preorder traversal of the tree, visiting each node once. So, the time complexity is O(N), where N is the number of nodes in the tree.
- Deserialization: The `deserialize` method splits the serialized string and then recursively constructs the tree. Each node is visited once, so the time complexity is also O(N).

### Space Complexity:
- Serialization: The space complexity for serialization is O(N), where N is the number of nodes in the tree, due to the StringBuilder used to store the serialized string.
- Deserialization: The space complexity for deserialization is also O(N) due to the recursive calls and the array used to store node values.
