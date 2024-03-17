class Solution:
    def combSum(self, i, lst, temp, ans, totSum, k):
            if totSum == k:
                ans.append(temp[:])
                return
            elif totSum > k:
                return
            for j in range(i, len(lst)):
                temp.append(lst[j])
                totSum+=lst[j]
                self.combSum(j, lst, temp, ans, totSum, k)
                temp.pop()
                totSum -= lst[j]
    def combinationSum(self, candidates: List[int], target: int) -> List[List[int]]:
        ans = []
        self.combSum(0, candidates, [], ans, 0, target)
        return ans