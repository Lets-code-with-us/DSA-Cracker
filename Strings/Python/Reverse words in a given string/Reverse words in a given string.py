class Solution:
    def reverseWords(self,S):
        words = s.split(".")
        words = words[::-1]
        rev_str = ".".join(words)
        return rev_str