# Code Explanation: Course Schedule II - Python Solution

## Explanation:

- res is an empty list that will store the final order of courses.
- visited is a dictionary that keeps track of nodes visited during DFS (Depth-First Search).
- graph is a defaultdict where each key represents a course, and the corresponding value is a list of courses that are prerequisites for that course.
- We construct the graph by iterating through the prerequisites list and populating the adjacency list representation of the graph.
- dfs(node) is a helper function that performs Depth-First Search starting from a given node. It checks for cycles in the graph and updates the visited dictionary accordingly.
- If a cycle is detected during DFS, the function returns True.
- Otherwise, if the DFS completes successfully without detecting any cycle, the function appends the current node to the res list and returns False.
- We iterate through all courses (numCourses) and perform DFS on each unvisited course. If a cycle is detected during any DFS, the function returns an empty list indicating that no valid course order exists.
- Otherwise, if DFS completes successfully for all courses, the function returns the res list containing the valid course order.

## Complexity:
- Time Complexity: O(V+E)
- Space Complexity: O(V+E)