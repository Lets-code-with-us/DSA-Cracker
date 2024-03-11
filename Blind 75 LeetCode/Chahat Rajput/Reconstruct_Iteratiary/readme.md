Explanation:-Reconstruct Iteratiary

Approach:-The problem can be viewed as a graph problem where airports are nodes, and flights are directed edges. We need to find an itinerary that covers all flights in the smallest lexical order, starting from "JFK." This suggests a depth-first search (DFS) approach to traverse the graph.

**Detailed Approach**

1.Building the Graph: We start by constructing a graph, where each airport is a node, and directed edges represent flights. We use an unordered map to store this graph. The keys are airport names, and the values are multisets (ordered sets) to store destinations. Using multisets ensures that destinations are sorted in lexical order.

2.DFS Traversal: We begin the DFS traversal from the "JFK" airport. While there are destinations from the current airport, we remove the smallest lexical destination from the multiset, mark it as visited, and recursively call the DFS on the removed destination.

3.Constructing the Itinerary: During the DFS traversal, we keep adding airports to the itinerary. Since DFS goes as far as possible before backtracking, the itinerary will be built in reverse order. Therefore, we reverse the itinerary to obtain the correct order, starting from "JFK."

4.Return the Itinerary: We return the itinerary as a vector of strings.


**Complexity**
Time Complexity: The time complexity of this solution is O(N log N), where N is the number of tickets. The DFS visits each ticket once, and finding the smallest lexical order destination takes O(log N) time.

Space Complexity: The space complexity is O(N), where N is the number of tickets. This space is used to store the graph, itinerary, and auxiliary data structures during DFS.