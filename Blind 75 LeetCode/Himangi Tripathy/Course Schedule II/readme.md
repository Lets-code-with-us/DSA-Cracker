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
    Queue<Integer> q = IntStream.range(0, numCourses)//
                           .filter(i -> inDegrees[i] == 0)
                           .boxed()
                           .collect(Collectors.toCollection(ArrayDeque::new));

    while (!q.isEmpty()) {
      final int u = q.poll();
      ans.add(u);
      for (final int v : graph[u])
        if (--inDegrees[v] == 0)
          q.offer(v);
    }

    if (ans.size() == numCourses)
      return ans.stream().mapToInt(Integer::intValue).toArray();
    return new int[] {};
  }
}
    