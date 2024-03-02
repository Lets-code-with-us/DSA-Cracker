class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        mp = {}
        for num in nums:
            mp[num] = mp.get(num, 0)+1
        for val in mp.values():
            if val>1:
                return True
        return False