### Merge Two Sorted Lists

This code defines a `Solution` class with a method `mergeTwoLists` that merges two sorted linked lists.

#### Method Explanation:

- **Parameters**: 
  - `list1`: The head of the first sorted linked list.
  - `list2`: The head of the second sorted linked list.
- **Returns**: The head of the merged sorted linked list.

#### Code Explanation:

1. **Initialization**:
   - It creates a new `ListNode` named `dummy` with a value of 0.
   - It creates a `current` pointer that initially points to `dummy`.

2. **Merging Process**:
   - It enters a `while` loop that continues until either `list1` or `list2` becomes `null`.
   - Within the loop:
     - It compares the values of the current nodes of `list1` and `list2`.
     - If the value of the node in `list1` is less than the value of the node in `list2`, it appends the node from `list1` to the merged list and advances the `list1` pointer.
     - Otherwise, it appends the node from `list2` to the merged list and advances the `list2` pointer.
     - In both cases, it moves the `current` pointer to the next node in the merged list.

3. **Handling Remaining Nodes**:
   - After the loop, it checks if either `list1` or `list2` still has remaining nodes.
   - It appends the remaining nodes (if any) directly to the merged list.

4. **Return**:
   - It returns the head of the merged list, which is the next node after `dummy`.

#### Time Complexity:
- The time complexity of this algorithm is O(n + m), where n and m are the lengths of `list1` and `list2`, respectively.

#### Space Complexity:
- The space complexity is O(1), as the algorithm only uses a constant amount of extra space regardless of the input size.

