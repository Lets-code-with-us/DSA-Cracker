## Longest Common Subsequence (LCS) - Dynamic Programming

This code implements a dynamic programming solution to find the length of the Longest Common Subsequence (LCS) between two strings (`text1` and `text2`).

**Explanation:**

1. **Input:**
   - `text1` and `text2` represent the two strings to compare.
   - `m` and `n` store the lengths of `text1` and `text2`, respectively.

2. **`dp` Array:**
   - A 2D array `dp` is created with dimensions (m + 1) x (n + 1). 
   - `dp[i][j]` will store the length of the LCS for the first `i` characters of `text1` and the first `j` characters of `text2`.

3. **Dynamic Programming Iteration:**
   - Uses nested loops to iterate through `dp`:
     - Outer loop (`i`): iterates through 1 to `m` (length of `text1`).
     - Inner loop (`j`): iterates through 1 to `n` (length of `text2`).
   - Checks if the characters at the current indices (`text1.charAt(i - 1)` and `text2.charAt(j - 1)`) are equal:
     - If equal, the LCS length is the previous LCS length (`dp[i - 1][j - 1]`) plus 1 (considering the matching character).
     - If not equal, the LCS length is the maximum of the LCS lengths for:
       - Considering only the first `i-1` characters of `text1` and all characters of `text2` (`dp[i - 1][j]`).
       - Considering all characters of `text1` and only the first `j-1` characters of `text2` (`dp[i][j - 1]`).
   - This logic builds the `dp` table incrementally, considering all possible substrings of both strings.

4. **Result:**
   - `dp[m][n]` represents the LCS length for the entire `text1` and `text2`.
   - The function returns `dp[m][n]`.

**Main Function:**

- Creates an instance of `Solution`.
- Defines two sample strings (`text1` and `text2`).
- Calls `longestCommonSubsequence` to find the LCS length.
- Prints the result.

**Complexity:**

- Time Complexity: O(m * n) due to nested loops iterating through all possible substrings.
- Space Complexity: O(m * n) for the `dp` array.
