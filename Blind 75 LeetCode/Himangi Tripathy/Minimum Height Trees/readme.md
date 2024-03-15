List<Integer> list1 = new ArrayList<>();
if(n == 0)
    return list1;
if(n == 1)
{
    list1.add(0);
    return list1;
}
The first base case checks if the number of nodes n is zero, in which case an empty list is returned. The second base case handles the scenario where there is only one node, and the list with that single node (0) is returned.

List<HashSet<Integer>> adjlist = new ArrayList<HashSet<Integer>>();
for(int i=0;i<n;i++) // create all n numbers of hashSet
{
    adjlist.add(new HashSet<Integer>());
}
This code initializes an adjacency list represented by a list of HashSets. Each node in the graph has a HashSet to store its neighbors.

for(int edge[] : edges) // make the graph virtually
{
    adjlist.get(edge[0]).add(edge[1]);
    adjlist.get(edge[1]).add(edge[0]);
}
The code iterates through the given edges array and populates the adjacency list accordingly for an undirected graph.
List<Integer> leaves = new ArrayList<>();
for(int i=0;i<n;i++) // select the initial leaves
{
    if(adjlist.get(i).size() == 1)
    {
        leaves.add(i);
    }
}
Initial leaves are identified by checking nodes with only one neighbor.
while(n > 2)
{
    n = n - leaves.size();
    List<Integer> newleaves = new ArrayList<>();
    for(int leaf : leaves)
    {
        int neighbour = adjlist.get(leaf).iterator().next();
        adjlist.get(neighbour).remove(leaf);
        if(adjlist.get(neighbour).size() == 1)
        {
            newleaves.add(neighbour);
        }
    }
    leaves = newleaves;
}
This is the core of the algorithm. It iteratively removes leaves from the graph until only the centroids (roots of minimum height trees) are left. It updates the leaves in each iteration.
return leaves;
The final leaves list contains the centroids or roots of the minimum height trees, and it is returned as the result.