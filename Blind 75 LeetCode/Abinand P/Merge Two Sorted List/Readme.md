# Intuition
To merge two sorted linked lists, we can iterate through both lists simultaneously, comparing the values of their nodes at each step. We create a new linked list by selecting the smaller value from the two lists and advancing the corresponding pointer. This process continues until both lists are exhausted.

# Approach
1. **Iterative Merge**:
   - Initialize a dummy node as the head of the merged list.
   - Initialize two pointers, one for each input list.
   - Iterate through both lists simultaneously:
     - Compare the values of the current nodes in both lists.
     - Append the smaller value to the merged list and advance the corresponding pointer.
     - Repeat this process until one of the input lists is exhausted.
   - If any remaining nodes exist in either list, append them to the merged list.
   - Return the merged list.

# Complexity Analysis
- Time Complexity: O(m + n), where m and n are the lengths of the input lists.
  - We iterate through both lists once, and the time complexity depends on the length of the longer list.
- Space Complexity: O(1).
  - We use only a constant amount of extra space regardless of the input size.
