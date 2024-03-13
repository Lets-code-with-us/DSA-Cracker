class Solution {
public:
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        vector<int> indegree(numCourses, 0);
        vector<vector<int>> graph(numCourses);
        for(vector<int> req: prerequisites){
            int from = req[0];
            int to= req[1];
            graph[from].push_back(to);
            indegree[to]++;
        }
            queue<int> q;
            for(int i=0;i<numCourses;i++){
                if(indegree[i]==0) q.push(i);
            }

            int nodestraversed =0;
            while(!q.empty()){
                int node = q.front();
                q.pop();
                nodestraversed++;
                for(int nei: graph[node]) if(--indegree[nei]==0) q.push(nei);
            }
            return nodestraversed==numCourses;
        
    }
};
