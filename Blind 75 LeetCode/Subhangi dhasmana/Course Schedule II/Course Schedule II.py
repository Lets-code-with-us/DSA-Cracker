class Solution:
    def findOrder(self, numCourses: int, prerequisites: List[List[int]]) -> List[int]:
        res,visited = [],{}
        graph = defaultdict(list)

        for a,b in prerequisites:
            graph[a].append(b)

        def dfs(node):
            if node in visited:
                return visited[node]

            visited[node]=True

            for nei in graph[node]:
                if dfs(nei):
                    return True

            visited[node]=False
            res.append(node)


        for i in range(numCourses):
            if dfs(i):
                return []
        
        return res