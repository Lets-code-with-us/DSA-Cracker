## Class: Solution

This class contains a method `canFinish()` to determine if it is possible to complete all courses given the prerequisites.

### Method: `canFinish`

Determines if it is possible to complete all courses given the prerequisites.

#### Parameters

- `numCourses`: An integer representing the total number of courses.
- `prerequisites`: A 2D vector of integers representing the prerequisites, where each prerequisite is represented by a pair [a, b] indicating that course b must be taken before course a.

#### Returns

- A boolean value indicating whether it is possible to complete all courses.

#### Approach

1. **Graph Representation:**
   - Create an adjacency list representation of the directed graph where each course is a node and prerequisites are directed edges.
   - Initialize an array `indegree` to store the indegree of each node.

2. **Calculate Indegree:**
   - Iterate through the prerequisites and update the graph adjacency list and the indegree array accordingly.

3. **Topological Sorting:**
   - Initialize a queue `q` and push all courses with an indegree of 0 into the queue.
   - Initialize a variable `nodesTraversed` to keep track of the number of nodes traversed.

4. **Breadth-First Search (BFS):**
   - While the queue is not empty, dequeue a course and increment `nodesTraversed`.
   - For each course taken, reduce the indegree of its neighbors by 1. If any neighbor's indegree becomes 0, enqueue it.

5. **Result:**
   - Check if the number of traversed nodes equals the total number of courses. If they are equal, return true; otherwise, return false.

#### Time Complexity
- The time complexity of this method is O(V + E), where V is the number of courses (nodes) and E is the number of prerequisites (edges). This complexity arises from constructing the graph and performing the topological sorting (BFS).

#### Space Complexity
- The space complexity of this method is O(V + E), where V is the number of courses (nodes) and E is the number of prerequisites (edges). This complexity arises from storing the graph adjacency list and the indegree array.
