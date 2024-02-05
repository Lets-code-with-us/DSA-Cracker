class Solution:
    def isPalindrome(self, S):
        if (S == S[::-1]):
            return 1
        else:
            return 0