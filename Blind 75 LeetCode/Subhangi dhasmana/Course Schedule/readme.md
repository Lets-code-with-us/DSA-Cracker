# Code Explanation: Course Schedule - Python Solution

## Explanation:

- The solution creates an array indegree to store the number of prerequisites each course has, and an adjacency list adj to represent the graph where each course is a node and prerequisites are directed edges.
- It initializes a queue with courses that have no prerequisites (indegree[i] == 0).
- It iterates through the queue, removing courses and updating their neighbors' indegree counts.
- If a neighbor's indegree becomes zero after decrementing, it's added to the queue.
- The loop continues until the queue is empty, incrementing a counter for visited courses.
- If the number of visited courses equals the total number of courses, it returns True, indicating all courses can be finished. Otherwise, it returns False.

## Complexity:
- Time Complexity: O(V+E)
- Space Complexity: O(V+E)