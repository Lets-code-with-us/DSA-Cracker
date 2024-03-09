Explanation:-Minimum Height Tree


Approach:-Find mid-node of tree start from each of the leaf nodes and iteratively delete them till you are left with final 1 or 2 nodes which will be the mid-nodes.

**Detailed Approach**

1.We can find the leaf nodes at each iteartion using the indegree of the node i.e. the no. of edges which are connected to the node.

2.Leaf node will have an indegree of 1

3.It is similar to BFS.At each level of BFS,we will pop the leaf node and push the new nodes which become leaves after deletion of leaf nodes in the current iteration.

4.This will continue till we are left with only 1 or 2 nodes whihc would be our final mod-nodes forming the MHTs.

**Complexity**
Time:-O(N),iteration continues till n-2 nodes are deleted
Space:-O(N),for storing G and leaves