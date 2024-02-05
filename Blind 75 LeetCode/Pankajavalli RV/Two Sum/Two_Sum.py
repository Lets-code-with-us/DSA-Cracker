class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        a = {} # store the ber and its corresponding index in the dictionary
        # adding the number and its index in the dictionary 'a'
        for i, n in enumerate(nums):
            a[n] = i 
        
        for i, n in enumerate(nums):
            diff = target - n # subtracting number 'n' from the 'target' gives you the other number 'diff'
            if diff in a and a[diff] != i: # check if the number 'diff' is present in 'a' and the 'diff' is not the number itself
                return[i, a[diff]] # return the indeces of both the numbers
        return [] # return empty array if no two numbers sum up to 'target'
