# Intuition
To reverse a singly-linked list, we can use a three-pointer approach where we maintain pointers to the current, previous, and next nodes. By iteratively updating these pointers, we can reverse the list efficiently.

# Approach
1. **Using Three Pointers**:
   - Initialize two pointers, prevNode and nextNode, to nil.
   - Traverse the list using a loop until the current node (head) becomes nil:
     - Update nextNode to store the next node of the current node.
     - Update the Next pointer of the current node to point to the previous node (prevNode).
     - Move prevNode to the current node.
     - Move the current node to the nextNode.
   - Return prevNode, which now points to the head of the reversed list.

# Complexity Analysis
- Time Complexity: O(N), where N is the number of nodes in the linked list.
  - The algorithm iterates through the list once.
- Space Complexity: O(1).
  - The algorithm uses only a constant amount of extra space regardless of the input size.
