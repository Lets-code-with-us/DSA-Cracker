class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums)<=3:
            return max(nums)
        def rec(nums):
            r1,r2= 0,0
            for i in nums:
                temp = max(i + r1,r2)
                r1 = r2
                r2 = temp
            return max(r1,r2)
        a = rec(nums[1:])
        b = rec(nums[:-1])
        return max(a,b)