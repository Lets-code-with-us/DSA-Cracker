class Solution {
  public boolean canFinish(int numCourses, int[][] prerequisites) {
    // Create in-degree and adjacency list
    int[] inDegree = new int[numCourses];
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for (int[] p : prerequisites) {
      inDegree[p[0]]++; // Increment in-degree of dependent course
      graph.putIfAbsent(p[1], new ArrayList<>());
      graph.get(p[1]).add(p[0]); // Edge from prerequisite to dependent course
    }

    Queue<Integer> queue = new LinkedList<>();
    for (int i = 0; i < numCourses; i++) {
      if (inDegree[i] == 0) {
        queue.offer(i);
      }
    }

    int count = 0;
    while (!queue.isEmpty()) {
      int course = queue.poll();
      count++;
      if (graph.containsKey(course)) {
        for (int neighbor : graph.get(course)) {
