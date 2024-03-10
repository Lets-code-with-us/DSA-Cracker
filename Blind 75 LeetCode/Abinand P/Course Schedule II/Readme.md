## Class: Solution

This class contains a method `findOrder()` to find the order of courses to be taken given the number of courses and their prerequisites.

### Method: `findOrder`

Finds the order of courses to be taken given the number of courses and their prerequisites.

#### Parameters

- `numCourses`: An integer representing the number of courses.
- `prerequisites`: A vector of vectors representing the prerequisites for each course. Each inner vector contains two integers, where the first integer is the prerequisite course and the second integer is the course itself.

#### Returns

A vector of integers representing the order of courses to be taken. If it is impossible to complete all courses, an empty vector is returned.

#### Approach

1. **Create Adjacency List and Calculate Frequencies:**
   - Initialize an adjacency list `adjacents` of size `numCourses` to store the prerequisites for each course.
   - Initialize a vector `frequencies` of size `numCourses` to store the frequency of prerequisites for each course.
   - Iterate through the `prerequisites` vector:
     - For each prerequisite, add it to the adjacency list of the corresponding course and increment its frequency in the `frequencies` vector.
2. **Topological Sorting with BFS:**
   - Initialize a count variable `count` to `numCourses - 1` to store the index for the result vector.
   - Initialize an empty queue `queue`.
   - Initialize an empty vector `result` of size `numCourses` to store the order of courses to be taken.
   - Iterate through the courses:
     - If a course has no prerequisites (frequency is 0), push it onto the queue and decrement `count`. Also, store it at the appropriate index in the `result` vector.
   - While the queue is not empty:
     - Dequeue a course from the queue.
     - For each prerequisite of the dequeued course:
       - Decrement its frequency in the `frequencies` vector.
       - If its frequency becomes 0, push it onto the queue, decrement `count`, and store it in the `result` vector.
3. **Return Result:**
   - If all courses can be taken (count becomes -1), return the `result` vector. Otherwise, return an empty vector.

#### Time Complexity
- The time complexity of this method is O(V + E), where V is the number of courses (vertices) and E is the number of prerequisites (edges).
  - Building the adjacency list and calculating frequencies takes O(E) time.
  - The BFS traversal takes O(V + E) time, as each course and prerequisite is processed once.

#### Space Complexity
- The space complexity of this method is O(V + E).
  - The adjacency list and frequencies vector each take O(V + E) space.
  - The queue and result vector take O(V) space.
