class Solution {
public:
    bool topologicalSortCheck(unordered_map<int,vector<int>>&adj,int n,vector<int>&indegree){
        queue<int>q;
        int count=0;//kitne node visit kr liye
        for(int i=0;i<n;i++){
            if(indegree[i] == 0 ){
                count++;//kitne nodes mene visit kr liye use add kr diya queue me
                q.push(i);
            }
        }

        while(!q.empty()){
            int u=q.front();
            q.pop();

            for(int &v:adj[u]){
                indegree[v]--;

                if(indegree[v] == 0){
                    count++;
                    q.push(v);
                }
            }
        }
        if(count ==n){//able to visit all nodes
            return true;
        }
        return false;//means there was a cycle and I couldn't complete allcourses
    }
    bool canFinish(int numCourses, vector<vector<int>>& prerequisites) {
        //Just to find that is there any cycle in graph then no topological sort will be created so in thta wayy we tackel this problem
        //Just to check Cycle detection in graph
         
         unordered_map<int,vector<int>>adj;
         vector<int>indegree(numCourses,0);//kahn's algorithm

         for(auto &vec:prerequisites){
             int a=vec[0];
             int b=vec[1];

             //pehle b fir  a b-->a
             adj[b].push_back(a);

             //arrow b se a me ja rha he
             indegree[a]++;
         }
         //if cycle is present,not possible
        return topologicalSortCheck(adj,numCourses,indegree);
    }
};