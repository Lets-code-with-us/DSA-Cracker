class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        a_set = set()
        for n in nums:
            if n in a_set:
                return True
            a_set.add(n)
        return False
