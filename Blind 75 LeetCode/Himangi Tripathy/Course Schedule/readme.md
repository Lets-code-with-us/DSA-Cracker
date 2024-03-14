enum State { kInit, kVisiting, kVisited }

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
            List<Integer>[] graph = new List[numCourses];//we create a list of integer type called graph with length of numCourses 
    State[] states = new State[numCourses];//we create a state of length numCourses

    for (int i = 0; i < numCourses; ++i)//we traverse the elements in graph
      graph[i] = new ArrayList<>();//we arrange the elements in graph as new Array list

    for (int[] prerequisite : prerequisites) {
      final int u = prerequisite[1];//we set the final value of u to the 2nd element of prerequisite
      final int v = prerequisite[0];//we set the final value of v to the 1st element of prerequisite
      graph[u].add(v);//we add v to graph u
    }

    for (int i = 0; i < numCourses; ++i)//we traverse 
      if (hasCycle(graph, i, states))//if graph hasCycle is true 
        return false;//then return false

    return true;//we return true
  }

  private boolean hasCycle(List<Integer>[] graph, int u, State[] states) {
    if (states[u] == State.kVisiting)//if uth element of states is equal to State.kVisiting
      return true;//then return true
    if (states[u] == State.kVisited)//if uth element of states is equal to State.kVisited then
      return false;//return false

    states[u] = State.kVisiting;//if uth element of states is equal to State.kVisiting then
    for (final int v : graph[u])//final value of v of uth element of graph
      if (hasCycle(graph, v, states))//if the condition is true then
        return true;//return true
    states[u] = State.kVisited;//else return uth element of State.kVisited

    return false;//else return false

        
    }
}