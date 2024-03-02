# Code Explanation: Clone graph - Python Solution

## Explanation:

- Initialize an empty queue q and a dictionary clones to store clones of nodes.
- Enqueue the original node into the queue and create its clone, adding it to the clones dictionary.
- While the queue is not empty:
a. Dequeue a node cur.
b. Get its clone from the clones dictionary.
c. Iterate through its neighbors:
- If a neighbor hasn't been cloned yet, create its clone and enqueue it.
- Add the clone of the neighbor to the current clone's neighbors list.
- Return the clone of the original node.

## Complexity:
- Time Complexity: O(V+E)
- Space Complexity: O(V)