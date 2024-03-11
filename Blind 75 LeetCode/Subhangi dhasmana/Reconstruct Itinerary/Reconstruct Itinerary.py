class Solution:
    def findItinerary(self, tickets: List[List[str]]) -> List[str]:
        hashm=defaultdict(list)
        for i in tickets:
            if i[0] in hashm:
                hashm[i[0]].append(i[1])
            else:
                hashm[i[0]]=[i[1]]
        for i in hashm:
            hashm[i]=sorted(hashm[i], reverse=True)
        res=[]
        
        def dfs(i):
            while hashm[i]:
                dfs(hashm[i].pop())
            res.append(i)
            
        dfs('JFK')
        return res[::-1]