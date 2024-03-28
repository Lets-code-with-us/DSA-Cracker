# Merge K Sorted Lists

## Problem Statement

Given an array of sorted linked lists, merge them into one sorted linked list and return it.

## Algorithm Explanation

The provided code utilizes a priority queue to merge k sorted linked lists efficiently. Here's a breakdown of the algorithm:

1. **Initialization**:
   - If the input array `lists` is null or empty, return null.
   - Create a `PriorityQueue` named `pq` to store the nodes of the linked lists. The priority queue is initialized with a comparator that compares nodes based on their values.
   - Initialize a dummy node and a tail node to help in constructing the merged list.

2. **Populating the Priority Queue**:
   - Iterate through each linked list in the input array `lists`.
   - If a linked list is not null, add its head node to the priority queue.

3. **Merging the Lists**:
   - Initialize a `dummy` node with value 0 and a `tail` node, initially pointing to `dummy`.
   - While the priority queue is not empty:
     - Pop the node with the smallest value from the priority queue.
     - Append this node to the merged list by setting `tail.next` to this node and updating `tail` to the newly added node.
     - If the popped node has a next node, add that next node to the priority queue.

4. **Return Result**:
   - Return the next node of the dummy node, which is the head of the merged sorted list.

## Code Explanation

The provided Java code implements the described algorithm.

- It checks for edge cases where the input array is null or empty.
- It creates a priority queue and populates it with the head nodes of the input lists.
- It merges the lists by repeatedly extracting the smallest node from the priority queue and appending it to the merged list.
- Finally, it returns the head of the merged list.

## Time Complexity

The time complexity of this algorithm is O(N log k), where N is the total number of nodes across all lists and k is the number of lists. This is because each node is added and removed from the priority queue at most once, and each insertion or removal operation takes O(log k) time.

## Space Complexity

The space complexity is O(k), where k is the number of lists. This is because the priority queue can contain at most one node from each list at any given time.
