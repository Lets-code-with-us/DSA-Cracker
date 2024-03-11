class Solution {
public:
    vector<int> findMinHeightTrees(int n, vector<vector<int>>& E) {
        if(!size(E)) return {0};
        vector<vector<int>> G(n);
        for(auto& e : E) 
            G[e[0]].push_back(e[1]), 
            G[e[1]].push_back(e[0]);
        vector<int> leaves, newLeaves, inDegree;
        for(int i = 0; i < n; i++) {
            if(size(G[i]) == 1)
                leaves.push_back(i);
            inDegree.push_back(size(G[i]));        // used to determine which nodes become leaves
        }
        while(n > 2) {             // process will continue till more than 2 nodes are remaining to be deleted
            for(auto leaf : leaves) 
                for(auto adj : G[leaf])            // find all nodes which are adjacent to current leaf node
                    if(--inDegree[adj] == 1)       // if adj becomes leaf node after removing leaf, 
                        newLeaves.push_back(adj);  // add it as new leaf
            n -= size(leaves);                     // subtract the deleted leaf nodes 
            leaves = move(newLeaves);
        }
        return leaves;
    }
};