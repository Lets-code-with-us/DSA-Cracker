## Course Schedule Problem

This document describes the course schedule problem and presents two solutions to determine if a valid course schedule can be created without encountering circular dependencies. Both solutions have a time complexity of O(V + E), where V is the number of courses and E is the number of prerequisites.

### Problem Statement

Given a set of courses (`numCourses`) and their prerequisites (`prerequisites`), determine if a valid course schedule can be created such that no course is taken before its prerequisites are completed. Prerequisites are represented as pairs `[ai, bi]`, where course `bi` must be completed before taking course `ai`.

### Approach 1: Depth-First Search (DFS)

1. **Graph Representation:**
   - Imagine courses as nodes and prerequisites as directed edges connecting them.
   - An adjacency list data structure efficiently represents this.

2. **Cycle Detection:**
   - Perform a Depth-First Search (DFS) traversal on each course.
   - Use a `visited` array to track visited courses during the traversal.
   - If a course is encountered as "visited" again during traversal, it signifies a cycle exists (a circular dependency).

### Approach 2: Topological Sort using Kahn's Algorithm

1. **In-Degree:**
   - Calculate the in-degree of each course, which is the number of prerequisites it has.

2. **Queue and Processing:**
   - Create a queue to store courses with an in-degree of 0 (no prerequisites).
   - Dequeue a course from the queue, process it (consider it completed for the schedule), and decrement the in-degree of courses that depend on it.
   - If a dependent course's in-degree becomes 0, add it to the queue.
   - If the queue becomes empty but not all courses are processed, it implies a cycle exists.
