## Merge K Sorted Lists

This Java code represents a solution to merge k sorted lists into one sorted list. It utilizes a priority queue to efficiently merge the lists.

### Method

The `mergeKLists` method takes an array of `ListNode` objects representing the heads of k sorted lists and returns a single sorted list.

### Algorithm

1. **Edge Case Handling**: 
   - If the input array `lists` is null or empty, return null.
   
2. **Priority Queue Initialization**: 
   - Initialize a priority queue (`pq`) with a custom comparator that compares `ListNode` objects based on their `val` field. This ensures that the nodes with the smallest values are polled first.

3. **Adding Initial Nodes to Priority Queue**: 
   - Iterate through the input array `lists`. 
   - For each non-null list head encountered, add it to the priority queue.

4. **Merging Lists using Priority Queue**:
   - Initialize `head` and `tail` pointers to null.
   - While the priority queue is not empty:
     - Poll the smallest node (`node`) from the priority queue.
     - If `head` is null, set both `head` and `tail` to `node`.
     - Otherwise, append `node` to the end of the merged list represented by `tail`.
     - Update `tail` to point to the newly added node.
     - If `node` has a next node (`node.next`), add the next node to the priority queue.
   - Once all nodes are processed, the merged list is represented by `head`.

5. **Return Result**: 
   - Return the merged list head (`head`).

### Time Complexity

- Let `n` be the total number of nodes across all lists and `k` be the number of lists.
- The time complexity of adding all nodes to the priority queue is O(k log k).
- Polling a node and adding its next node to the priority queue takes O(log k) time, and this operation is performed for each of the `n` nodes.
- Therefore, the overall time complexity is O(n log k).

### Space Complexity

- The space complexity is O(k) to store the priority queue.
- In addition, space is required for the merged list, which is O(n).
- Thus, the total space complexity is O(max(k, n)).
