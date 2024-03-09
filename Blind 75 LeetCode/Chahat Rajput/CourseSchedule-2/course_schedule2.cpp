class Solution {
public:
 vector<int> topologicalSortCheck(unordered_map<int,vector<int>>&adj,int n,vector<int>&indegree){
        queue<int>q;
        int count=0;//kitne node visit kr liye
        vector<int>result;
        for(int i=0;i<n;i++){
            if(indegree[i] == 0 ){
                count++;//kitne nodes mene visit kr liye use add kr diya queue me
                result.push_back(i);
                q.push(i);
            }
        }

        while(!q.empty()){
            int u=q.front();
            q.pop();

            for(int &v:adj[u]){
                indegree[v]--;

                if(indegree[v] == 0){
                    result.push_back(v);
                    count++;
                    q.push(v);
                }
            }
        }
        if(count ==n){//able to visit all nodes
            return result;
        }
        return {};//means there was a cycle and I couldn't complete allcourses
    }
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        unordered_map<int,vector<int>>adj;
        vector<int>indegree(numCourses,0);

        for(auto &vec:prerequisites){
            int a=vec[0], b=vec[1];
            //pehle b fir a b-->a
            adj[b].push_back(a);
            indegree[a]++;//arrow a me ja rha he to ise inc. kr do
        }
        return topologicalSortCheck(adj,numCourses,indegree);
    }
};