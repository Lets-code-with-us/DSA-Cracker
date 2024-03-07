class Solution:
  def findMinHeightTrees(self, n: int, edges: List[List[int]]) -> List[int]:
    if n == 1:
        return [0]
    adj_list = {i: set() for i in range(n)}
    for u, v in edges:
        adj_list[u].add(v)
        adj_list[v].add(u)
    leaves = [i for i in range(n) if len(adj_list[i]) == 1]
    while n > 2:
        n -= len(leaves)
        new_leaves = []
        for leaf in leaves:
            neighbor = adj_list[leaf].pop()
            adj_list[neighbor].remove(leaf)
            if len(adj_list[neighbor]) == 1:
                new_leaves.append(neighbor)
        
        leaves = new_leaves
    
    return leaves