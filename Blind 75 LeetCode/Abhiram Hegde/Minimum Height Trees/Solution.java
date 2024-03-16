class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n == 1)
            return List.of(0);
        Map<Integer, Set<Integer>> adj = new HashMap<>();
        for(int[] edge : edges) {
            adj.computeIfAbsent(edge[0], k-> new HashSet<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1], k-> new HashSet<>()).add(edge[0]);
        }
        Set<Integer> leaves = adj.entrySet().stream()
        .filter(e->e.getValue().size()==1).map(e1->e1.getKey())
        .collect(Collectors.toSet());
        while(n > 2) {
            n-= leaves.size();
            Set<Integer> newLeaves = new HashSet<>();
            for(Integer leaf : leaves) {
                Set<Integer> neighbours = adj.get(leaf);
                adj.remove(leaf);
                neighbours.forEach(neighbour -> {
                    Set<Integer> neighboursNeighbours = adj.get(neighbour);
                    neighboursNeighbours.remove(leaf);
                    if(neighboursNeighbours.size() == 1) {
                        newLeaves.add(neighbour);
                    }
                });
                leaves = newLeaves;
            }
        }
        return new ArrayList<>(leaves);
    }
}
