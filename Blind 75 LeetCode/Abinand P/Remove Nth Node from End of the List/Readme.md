# Intuition
The problem asks to remove the Nth node from the end of a singly-linked list and return the resulting list. To achieve this, we can use the two-pointer technique, where one pointer moves N nodes ahead of the other pointer. When the first pointer reaches the end of the list, the second pointer will be pointing to the Nth node from the end.

# Approach
1. **Dummy Node Initialization**:
   - Initialize a dummy node with a value of 0 and set its Next pointer to the head of the input list.
   - Initialize two pointers, first and second, both pointing to the dummy node.

2. **Move First Pointer to the Nth Node**:
   - Move the first pointer to the Nth node from the beginning of the list by advancing it N times.
   - If the list length is less than N, return the original head.

3. **Move Both Pointers Until End**:
   - Move both pointers simultaneously until the first pointer reaches the end of the list.

4. **Remove the Nth Node from the End**:
   - Once the first pointer reaches the end, the second pointer will be pointing to the Nth node from the end.
   - Remove the Nth node by updating the Next pointer of the node pointed to by the second pointer to skip the Nth node.

5. **Return the Modified List**:
   - Return the Next pointer of the dummy node, which points to the head of the modified list.

# Complexity Analysis
- Time Complexity: O(N), where N is the number of nodes in the linked list. We traverse the list twice: once to move the first pointer to the Nth node and once to find the end of the list.
- Space Complexity: O(1), as we use only a constant amount of extra space for variables.
