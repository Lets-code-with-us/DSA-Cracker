# Intuition
Merging k sorted linked lists efficiently can be achieved using a divide and conquer approach. We can merge pairs of lists iteratively until we merge all of them into a single sorted list. This approach helps reduce the overall time complexity compared to merging all lists simultaneously.

# Approach
1. **Merge Function**:
   - Define a merge function that takes two sorted linked lists and merges them into a single sorted list.
   - Initialize a dummy node and a current pointer to build the merged list iteratively.
   - Compare the values of the nodes from both lists, appending the smaller node to the merged list.
   - Move the current pointer and the pointer from the list containing the smaller node.
   - Continue this process until one of the lists reaches its end.
   - Append the remaining nodes from the non-empty list to the merged list.

2. **Merge Sort**:
   - Define a helper function, mergeKListsHelper, to recursively merge the lists in a divide and conquer manner.
   - Divide the list of lists into halves and merge each half recursively until only one list remains.
   - Use the merge function to merge two lists at each level of recursion.
   - Continue this process until all lists are merged into a single sorted list.

3. **Base Cases**:
   - If the start and end indices are equal, return the list at that index.
   - If there are only two lists, merge them using the merge function and return the result.

4. **Merge K Lists**:
   - Check if the input list of lists is empty. If it is, return nullptr.
   - Call the mergeKListsHelper function with the start and end indices of the input list of lists to merge all lists.

# Complexity Analysis
- Time Complexity: O(N * log(k)), where N is the total number of nodes across all lists and k is the number of lists. Each merge operation takes O(N) time, and there are log(k) levels of recursion.
- Space Complexity: O(log(k)), where k is the number of lists. The recursion depth is limited by the number of lists.
