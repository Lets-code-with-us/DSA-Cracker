## Longest Common Subsequence

### Algorithm Overview:

1. Define a 2D array `dp` to store the lengths of longest common subsequences.
2. Iterate over each character in `text1` and `text2`.
3. If the characters at the current positions match, increment the length of the LCS by 1.
4. If the characters don't match, take the maximum of the previous LCS lengths.
5. Return the length of the LCS.

### Code Explanation:

- `int m = text1.length();` and `int n = text2.length();`: Get the lengths of the input strings.
- `int[][] dp = new int[m + 1][n + 1];`: Initialize a 2D array `dp` to store the lengths of LCS.
- Nested loops iterate over each character in `text1` and `text2`.
  - If characters match (`text1.charAt(i - 1) == text2.charAt(j - 1)`), increment the LCS length by 1.
  - If characters don't match, take the maximum of previous LCS lengths.
- Finally, return `dp[m][n]`, which contains the length of the LCS.

### Time Complexity:

The time complexity of this algorithm is O(m * n), where m and n are the lengths of `text1` and `text2` respectively.

### Space Complexity:

The space complexity is also O(m * n) due to the usage of the 2D array `dp`.
