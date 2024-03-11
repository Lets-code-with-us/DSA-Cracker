class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    List<Integer> ans = new ArrayList<>();//we create an arraylist ans
    List<Integer>[] graph = new List[numCourses];//we create a list graphof integer type of length numCourses
    int[] inDegrees = new int[numCourses];//we create an array inDegrees of length numCourses

    for (int i = 0; i < numCourses; ++i)//we traverse till numCourses-1
      graph[i] = new ArrayList<>();//we assigned graph elements to new ArrayList

    // Build the graph.
    for (int[] prerequisite : prerequisites) {//we take array prerequisite
      final int u = prerequisite[1];//we set final value of u to 2nd element of prerequisite
      final int v = prerequisite[0];//we set final value of v to 1st element of prerequisite
      graph[u].add(v);//in uth element of graph add v
      ++inDegrees[v];//indDegrees of v is incremented
    }

    // Perform topological sorting.
    Queue<Integer> q = IntStream.range(0, numCourses)//q: A queue to store nodes with in-degrees equal to 0 initially.IntStream.range(0, numCourses): Creates a stream of integers from 0 to numCourses - 1.
                           .filter(i -> inDegrees[i] == 0)//.filter(i -> inDegrees[i] == 0): Filters out the nodes with in-degrees equal to 0.
                           .boxed()//.boxed(): Converts the stream of integers to a stream of Integer objects.
                           .collect(Collectors.toCollection(ArrayDeque::new));//.collect(Collectors.toCollection(ArrayDeque::new)): Collects the stream into an ArrayDeque (a type of queue).
    while (!q.isEmpty()) {//The loop continues until the queue is empty.
      final int u = q.poll();//q.poll(): Retrieves and removes the head of the queue (u is the current course with in-degree 0).
      ans.add(u);//ans.add(u): Adds the current course to the result list
      for (final int v : graph[u])//The inner loop iterates over the neighbors (v) of the current course (u) in the graph.
        if (--inDegrees[v] == 0)//if (--inDegrees[v] == 0): Decrements the in-degree of the neighbor v and adds it to the queue if the new in-degree becomes 0
          q.offer(v);//v is added to q
    }

    if (ans.size() == numCourses)//if size of ans is equal to numCourses then
      return ans.stream().mapToInt(Integer::intValue).toArray();//we return ans stream mapped to integer values
    return new int[] {};//we return the integer array
  }
}
    
