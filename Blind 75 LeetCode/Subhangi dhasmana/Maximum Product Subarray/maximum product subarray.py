class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxi = -(2**31-1)
        prod = 1

        for i in range(len(nums)):
            prod *= nums[i]
            maxi = max(prod, maxi)
            if prod == 0:
                prod = 1
            
        prod = 1
        for i in range(len(nums)-1, 0, -1):
            prod *= nums[i]
            maxi = max(prod, maxi)
            if prod == 0:
                prod = 1
        return maxi