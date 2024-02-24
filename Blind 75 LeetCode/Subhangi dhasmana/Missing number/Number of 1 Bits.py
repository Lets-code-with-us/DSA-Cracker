class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        n = len(nums)
        totSum = (n*(n+1))//2
        numSum = 0
        for i in range(n):
            numSum += nums[i]

        return totSum-numSum