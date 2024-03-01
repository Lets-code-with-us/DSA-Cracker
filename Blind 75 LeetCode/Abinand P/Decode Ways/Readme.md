## Class: Solution

This class provides a method `numDecodings` to count the number of ways to decode a given string `s` containing digits.

### Method: `numDecodings`

Counts the number of ways to decode the given string `s` containing digits.

#### Parameters

- `s`: A string representing the input containing digits.

#### Returns

An integer representing the number of ways to decode the given string `s`.

#### Approach

1. **Dynamic Programming:**
   - Create a vector `dp` of size `n + 1`, initialized with all zeros.
   - Set `dp[0] = 1` to handle the base case.
   - Iterate over the characters of the string `s` from index 1 to `n`.
   - For each index `i`:
     - Calculate the single-digit number `op1` from the current character `s[i - 1]`.
     - Calculate the two-digit number `op2` from the current and previous characters `s[i - 2]` and `s[i - 1]`.
     - Update `dp[i]` by adding:
       - `dp[i - 1]` if `op1` is in the valid range (1 to 9).
       - `dp[i - 2]` if `op2` is in the valid range (10 to 26).
   - Return `dp[n]`, which represents the total number of ways to decode the string `s`.

#### Time Complexity
- The time complexity of this method is O(n), where n is the length of the input string `s`, as it iterates through the string once.

#### Space Complexity
- The space complexity of this method is O(n), where n is the length of the input string `s`, as it uses extra space to store the dynamic programming array `dp`.
