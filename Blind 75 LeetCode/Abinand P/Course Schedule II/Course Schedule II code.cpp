class Solution {
public:
    vector<int> findOrder(int numCourses, vector<vector<int>>& prerequisites) {
        vector<list<int>> adjacents(numCourses);
        vector<int> frequencies(numCourses);
        int count = numCourses - 1;

        for(const auto& prerequisite : prerequisites) {
            if(adjacents[prerequisite[0]].empty())
                adjacents[prerequisite[0]] = list<int>();
            
            adjacents[prerequisite[0]].push_back(prerequisite[1]);
            frequencies[prerequisite[1]]++;
        }

        queue<int> queue;
        vector<int> result(numCourses);

        for(int i = 0; i < numCourses; ++i) {
            if(frequencies[i] == 0) {
                result[count--] = i;
                queue.push(i);
            }
        }

        while(!queue.empty()) {
            int i = queue.front();
            queue.pop();

            for(int p : adjacents[i]) {
                frequencies[p]--;

                if(frequencies[p] == 0) {
                    result[count--] = p;
                    queue.push(p);
                }
            }
        }

        return count == -1 ? result : vector<int>();
    }
};
