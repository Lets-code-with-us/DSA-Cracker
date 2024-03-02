Explanation:-Course Schedule

Approach:-Just to find that is there any cycle in graph then no topological sort will be created so in that way we solve this problem.Have to check cycle present in graph 

**Keys Points to solve it**
-Topological Sort
-Kahn's Algorithm
-Cycle Detection

**Detailed Approach**

*As we approach graph problem do same in it but I am using BFS Approach.

*We have to check that is there any cycle present when we are checking for courses So for it we Use "Topological Sort" and "Kahn's Algorithm".

*We are checking "b-->a" in that way so first add "b" and then corresponding "b" add "a" because arrow towards "a" .

*If our topological sort is created then we know that no cycle is present and return true otherwise false.


**Complexity**

Time:-O(V+E),for BFS
Space:-O(V),for hash map
