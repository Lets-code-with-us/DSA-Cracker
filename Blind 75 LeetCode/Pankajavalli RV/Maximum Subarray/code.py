class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
      
        maxSum = nums[0]
        currentSum = nums[0]
      
        for n in nums[1:]:
            currentSum = max(n, currentSum + n)
            maxSum = max(maxSum, currentSum)
          
        return maxSum
