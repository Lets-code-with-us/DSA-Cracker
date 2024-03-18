## Decoding Encoded Messages

This code implements a solution to the problem of decoding an encoded message consisting of digits. Each digit represents a letter (A-Z), and the task is to find the number of possible ways to decode the message.

**Problem:**

Given a string `s` where each character is a digit between '1' and '9', find the number of ways to decode `s` into a sequence of letters.

**Constraints:**

- The encoded string may contain leading zeros.
- A single digit can represent a letter (1-9).
- Two digits together can represent a letter (10-26).

**Solution Approach:**

This code uses dynamic programming (DP) to efficiently solve this problem. DP involves storing solutions to subproblems and using them to solve larger problems.

**Explanation:**

1. **Base Cases:**
   - If the string `s` is empty or starts with '0', there are no valid decodings (return 0).

2. **Dynamic Programming Table (dp):**
   - An array `dp` of size `n + 1` is created, where `n` is the length of the string `s`.
   - `dp[i]` will store the number of ways to decode the substring of `s` ending at index `i`.

3. **Initialization:**
   - `dp[0]` is set to 1, representing one way to decode an empty string (empty string itself).
   - `dp[1]` is set to either 1 (if the first character is not '0') or 0 (if it's '0'), indicating the decoding possibilities for a single-digit substring.

4. **Iterating through the String:**
   - The code iterates through the string `s` starting from index `i = 2` (second character).
   - For each character `s.charAt(i - 1)`:
     - **Single-Digit Decoding:**
       - If the character is not '0' (valid single digit), `dp[i]` is incremented by `dp[i - 1]`. This adds the number of decodings for the previous substring (single-digit decoding).
     - **Double-Digit Decoding:**
       - A two-digit integer `twoDigits` is formed using the previous two characters (`s.substring(i - 2, i)`). 
       - If `twoDigits` is between 10 and 26 (valid double digit), `dp[i]` is incremented by `dp[i - 2]`. This adds the number of decodings for the substring ending two digits ago (double-digit decoding possibility).

5. **Final Result:**
   - After iterating through the entire string, `dp[n]` holds the total number of ways to decode the entire string `s`. This value is returned as the final result.

**Example:**

Consider the input string `s = "12"`. It can be decoded as "AB" (1 -> A, 2 -> B) or "L" (12 -> L). The code will correctly calculate that there are 2 possible decodings for "12".
