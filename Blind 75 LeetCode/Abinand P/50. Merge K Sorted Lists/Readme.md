# Intuition
The problem involves merging k sorted linked lists. We can approach this problem using a divide-and-conquer strategy, where we recursively merge pairs of lists until we have a single sorted list. This approach helps reduce the time complexity compared to merging all lists at once.

# Approach
1. **Divide and Conquer**:
   - Define a helper function `mergeKListHelper` that takes the input array of lists, along with start and end indices.
   - If the start index is equal to the end index, return the list at that index.
   - If the start index is one less than the end index, merge the two lists at start and end indices using the `merge` function.
   - Otherwise, calculate the mid index and recursively call `mergeKListHelper` for the left and right halves of the input array.
   - Merge the resulting lists from the left and right halves.
   - Return the merged list.
2. **Merge Two Lists**:
   - Define a helper function `merge` that takes two lists as input.
   - Initialize a dummy node to store the merged list and a pointer `curr` to traverse the merged list.
   - Compare the values of the two input lists at each step and append the smaller value to the merged list.
   - Move the pointer `curr` to the next node in the merged list.
   - Continue this process until one of the input lists becomes empty.
   - Append the remaining elements of the non-empty list to the merged list.
   - Return the merged list.

# Complexity Analysis
- Time Complexity: O(N log k), where N is the total number of nodes in all lists, and k is the number of lists. Each merge operation takes O(N) time, and there are log k levels in the recursion tree.
- Space Complexity: O(1) in terms of auxiliary space used for pointers and O(N) in terms of stack space used for the recursive calls.
