# Code Explanation: Decode ways - Python Solution

## Explanation:

- The function iterates through the string from index 2 to n, where n is the length of the string.
- For each index i, it considers two possibilities:
1. If the current digit is not '0', it can be decoded as a single-digit number, so dp[i] is incremented by dp[i-1].
2. If the previous two digits form a number between 10 and 26 (inclusive), it can be decoded as a two-digit number, so dp[i] is incremented by dp[i-2].
- The function calculates the number of ways to decode the entire string by summing up the values in the dp array at index n, which represents the total number of valid decodings.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)