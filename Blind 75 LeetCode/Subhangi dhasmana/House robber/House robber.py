class Solution:
    def rob(self, nums: List[int]) -> int:
        n = len(nums)
        prev1=nums[0]
        prev2= 0
        curr = prev1+prev2
        if n == 0:
            return nums[n]
        if n<0:
            return 0
        
        for i in range(1,n):
            pick = nums[i]
            if i>1:
                pick += prev2
            notPick = prev1
            curr = max(pick, notPick)
            prev2 = prev1
            prev1 = curr
        return prev1