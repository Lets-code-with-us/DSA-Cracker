class Solution:
    def isAnagram(self,a,b):
        
        if (len(a) != len(b)):
            return False
        else:
            alpha = "abcdefghijklmnopqrstuvwxyz"
            wordsa = {}
            wordsb = {}
            for ch in alpha:
                count1 = 0
                for letter in a:
                    if (ch == letter):
                        count1 += 1
                if (ch not in wordsa):
                    wordsa[ch] = count1
                    
                count2 = 0
                for letter in b:
                    if (ch == letter):
                        count2 += 1
                if (ch not in wordsb):
                    wordsb[ch] = count2
                    
            if (wordsa == wordsb):
                return True
            else:
                return False