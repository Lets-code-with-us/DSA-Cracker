class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        List<Integer> list1 = new ArrayList<>();
        if(n == 0) 
            return list1;
        if(n == 1) 
        {
            list1.add(0);
            return list1;
        }
        List<HashSet<Integer>> adjlist = new ArrayList<HashSet<Integer>>();
        for(int i=0;i<n;i++) 
        {
            adjlist.add(new HashSet<Integer>());
        }
        for(int edge[] : edges) 
        {
            adjlist.get(edge[0]).add(edge[1]);
            adjlist.get(edge[1]).add(edge[0]);
        }
        List<Integer> leaves = new ArrayList<>();
        for(int i=0;i<n;i++) 
        {
            if(adjlist.get(i).size() == 1)
            {
                leaves.add(i);
            }
        }
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
        
        return leaves;
    }
}