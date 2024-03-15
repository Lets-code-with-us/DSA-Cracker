# Course Schedule II

## Explanation

This Java code implements a solution to find the order of courses to be taken given a certain number of courses and their prerequisites.

### Algorithm Overview

1. **Data Structures Setup**:
   - A HashMap (`adjList`) is used to represent the adjacency list of the courses and their prerequisites.
   - An array (`indegree`) is used to store the indegree of each course, indicating the number of prerequisites for each course.
   - A Queue (`queue`) is used to perform BFS (Breadth-First Search) traversal.

2. **Processing Prerequisites**:
   - Iterate through the given `prerequisites` array.
   - Populate the `adjList` with dependent courses and their prerequisites.
   - Update the `indegree` array to count the prerequisites of each course.

3. **BFS Traversal**:
   - Enqueue all courses with an indegree of 0 (i.e., courses that have no prerequisites).
   - While the queue is not empty:
     - Dequeue a course (`currentCourse`).
     - Add the `currentCourse` to the `courseOrder`.
     - Increment the `processedCourses` counter.
     - If `currentCourse` has dependents:
       - Iterate through its dependents.
       - Decrement the `indegree` of each dependent.
       - If the `indegree` of a dependent becomes 0, enqueue it.

4. **Check Completion**:
   - If all courses have been processed (`processedCourses == numCourses`), return the `courseOrder` as an integer array.
   - Otherwise, return an empty integer array.

## Complexity Analysis

- **Time Complexity**: O(V + E), where V is the number of courses (vertices) and E is the number of prerequisites (edges). This is due to the BFS traversal.
- **Space Complexity**: O(V + E), where V is the space required for the `adjList` and `indegree` array, and E is the space required for the queue and `courseOrder`.

### Code Explanation

- The `findOrder` method takes `numCourses` (the total number of courses) and `prerequisites` (a 2D array representing course prerequisites) as input.
- It initializes necessary data structures and performs BFS traversal to find the order of courses.
- Finally, it returns the course order as an integer array or an empty array if it's impossible to finish all courses.
