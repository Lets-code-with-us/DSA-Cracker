class Solution:
    def search(self, nums: List[int], target: int) -> int:
        low, high = 0, len(nums) - 1

        while low <= high:
            mid = (low + high) // 2
            if nums[mid] == target:
                return mid

            if nums[mid] >= nums[low]:
                if nums[low] <= target < nums[mid] or nums[mid] < nums[low]:
                    high = mid - 1
                else:
                    low = mid + 1
            else:
                if nums[mid] < target <= nums[high] or nums[mid] > nums[high]:
                    low = mid + 1
                else:
                    high = mid - 1

        return -1
