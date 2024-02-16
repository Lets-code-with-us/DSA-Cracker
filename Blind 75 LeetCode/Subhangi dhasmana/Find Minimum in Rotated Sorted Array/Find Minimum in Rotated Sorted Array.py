class Solution:
    def findMin(self, nums: List[int]) -> int:
        s, e = 0, len(nums)-1
        ans = 2**31-1
        while s<e:
            mid = (s+e)//2
            if nums[s]<=nums[mid]:
                ans = min(ans, nums[s])
                s = mid+1
            else:
                ans = min(ans, nums[mid])
                e = mid-1
        return ans