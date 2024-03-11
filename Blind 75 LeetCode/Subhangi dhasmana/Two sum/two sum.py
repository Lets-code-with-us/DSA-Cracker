class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        # for i in range(len(nums)):
        #     for j in range(i+1, len(nums)):
        #         if nums[i]+nums[j]==target:
        #             return [i, j]
        # return -1
        prevMap = {}
        for i in range(len(nums)):
            rem = target-nums[i]
            if rem in prevMap:
                return {prevMap[rem], i}
            prevMap[nums[i]] = i