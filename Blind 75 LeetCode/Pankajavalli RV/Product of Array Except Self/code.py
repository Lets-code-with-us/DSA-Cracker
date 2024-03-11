class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        
        prefix = [1]
        postfix = [1]

        for i in range(0,len(nums) ):
            val = prefix[-1] * nums[i]
            prefix.append(val)
        
        for i in range(len(nums) - 1, -1, -1):                        
            val = nums[i] * postfix[0]
            postfix = [val] + postfix
          
        res = []  
      
        for i in range(0,len(nums)):
            res.append(prefix[i] * postfix[i+1])
        return res
