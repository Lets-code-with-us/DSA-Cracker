# Course Schedule

## Problem Statement
You are given the number of courses `numCourses` and an array `prerequisites` where `prerequisites[i] = [ai, bi]` indicates that you must take course `bi` first if you want to take course `ai`.

Your task is to determine if it's possible to finish all courses. Return `true` if it's possible, otherwise return `false`.

## Approach
The solution uses a graph traversal algorithm, specifically depth-first search (DFS), to detect cycles in the course prerequisites graph.

1. **Building the Graph**: First, the code constructs an adjacency list representation of the graph. It iterates over the prerequisites array and adds edges to the adjacency list according to the given prerequisites.

2. **DFS Traversal**: The code then performs DFS on each course. During the DFS traversal, it keeps track of visited nodes using an array. If a cycle is detected during the traversal, it returns `false`, indicating that it's impossible to finish all courses. Otherwise, it returns `true`.

## Java Code Explanation
The Java code is organized within the `Solution` class, which contains a single method `canFinish`.

1. **Input Parameters**: The method `canFinish` takes two parameters: `numCourses`, the total number of courses, and `prerequisites`, the array containing prerequisite relationships.

2. **Graph Construction**: Inside the method, the code initializes an empty adjacency list `graph`, representing the course prerequisites graph. It then populates this graph by iterating over the `prerequisites` array and adding edges accordingly.

3. **DFS Traversal**: After constructing the graph, the code initializes an array `visited` to keep track of visited nodes during DFS traversal. It then iterates over each course and performs DFS starting from that course. If a cycle is detected during the DFS traversal, the method returns `false`. Otherwise, it returns `true` if all courses can be completed without encountering a cycle.

4. **Helper Method**: The method `hasCycle` is a recursive helper function used for DFS traversal. It checks for cycles in the graph starting from a particular course. If a cycle is found, it returns `true`; otherwise, it returns `false`.

## Time Complexity
The time complexity of the solution is O(V + E), where V is the number of courses and E is the number of prerequisite relationships. This complexity arises from constructing the graph and performing DFS traversal on it.

## Space Complexity
The space complexity of the solution is O(V + E), where V is the number of courses (used for the adjacency list) and E is the number of prerequisite relationships (used for storing the graph).
