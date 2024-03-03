Explanation:-Clone Graph

Approach:-Use BFS and DFS for solving this problem and return the clone of the graph.

**Approach**

*I am using BFS approach for it we have to make queue for storing node and map for showing the connections.

*Declaring map, to check whether we have a copy of node or not and also to store copy

*if node is null, then simply return null otherwise make a copy of first node and add into map 

*We use queue for BFS and push node into queue

*We push a node in the queue and make sure that the node is already cloned. Then we process neighbors. If a neighbor is already cloned and visited, we just append it to the current clone neighbors list, otherwise, we clone it first and append it to the queue to make sure that we can visit it in the next tick.

*Atlast return the mp[node]

**Complexity**

Time:-O(V+E),for BFS
Space:-O(V),for hashmap