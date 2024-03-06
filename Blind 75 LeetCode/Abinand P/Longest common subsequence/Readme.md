# Longest Common Subsequence

## Class: Solution

This class contains a method `longestCommonSubsequence()` to find the length of the longest common subsequence between two strings.

### Method: `longestCommonSubsequence`

Finds the length of the longest common subsequence between two strings using dynamic programming.

#### Parameters

- `text1`: A string representing the first text.
- `text2`: A string representing the second text.

#### Returns

An integer representing the length of the longest common subsequence between `text1` and `text2`.

### Approach

The `longestCommonSubsequence()` method uses dynamic programming to find the length of the longest common subsequence between two strings.

1. **Initialization:**
   - Initialize a 2D array `dp` of size `(n1+1) x (n2+1)` to store the lengths of the longest common subsequences between prefixes of `text1` and `text2`. Initialize all elements of `dp` to 0.

2. **Dynamic Programming:**
   - Iterate through each character of `text1` and `text2` using nested loops:
     - If the characters at the current positions (`i` and `j`) are equal:
       - Update `dp[i][j]` to be one more than the length of the longest common subsequence without these characters, i.e., `dp[i-1][j-1] + 1`.
     - If the characters are not equal:
       - Update `dp[i][j]` to be the maximum of the lengths of the longest common subsequences obtained by excluding either the current character of `text1` or `text2`, i.e., `max(dp[i-1][j], dp[i][j-1])`.

3. **Result:**
   - The length of the longest common subsequence between `text1` and `text2` is stored in `dp[n1][n2]`, where `n1` and `n2` are the lengths of `text1` and `text2`, respectively. Return this value as the result.

The approach efficiently finds the length of the longest common subsequence between two strings using dynamic programming with a time complexity of O(n1 * n2), where n1 and n2 are the lengths of `text1` and `text2`, respectively.
