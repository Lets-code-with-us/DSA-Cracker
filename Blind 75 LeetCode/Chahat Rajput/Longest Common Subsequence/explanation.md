Explanation:-Longest Common Subsequence

Deatiled Approach

*Initialize a 2D array dp to store length of common subsequence. The dimensions are (text1.size(),text2.size())

*Iterate through each character of both strings

*If characters match update dp[i][j] by taking diagonal value and do +1.This represents the current size of common subsequence if the current characters are included.

*If characters don't match,update dp[i][j] by taking maximum from left(dp[i-1][j]) or above(dp[i][j-1]).This represents the size of common subsequence without the current characters.

*Last return riht most ele. which contain maximum size of longest common 
subsequence.

Complexity

Space:-O(n*m),for storing result in array dp

Time:-O(n*m),where n and m length of two strings.The nested loop iterates through all characters of both strings.
