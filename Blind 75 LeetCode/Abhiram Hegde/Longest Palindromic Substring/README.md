**Class Solution**

This class finds the longest palindromic substring in a given string. 

**Function longestPalindrome**

This function finds the longest palindromic substring in a string using dynamic programming.

* **Input**
    * `s` - The input string

* **Output**
    * The longest palindromic substring in the string.

**Steps**

1. **Initialization**
    * Create a boolean DP table `dp` of size `n x n` to store palindrome substrings. 
    * Initialize all values in `dp` to `False`.
    * Set the base case: single character strings are palindromes by setting `dp[i][i] = True` for all `i`.
    * Initialize `maxLength` to 1 and `start` to 0 to track the longest palindrome found so far. 

2. **Check for palindromes of length 2**
    * Iterate through the string `s` from index 0 to `n-2` (because we are checking for substrings of length 2).
    * If the characters at `i` and `i+1` are equal, set the corresponding entry in the DP table `dp[i][i+1]` to `True`. This indicates that the substring `s[i]s[i+1]` is a palindrome.
    * Update `maxLength` to 2 and `start` to `i` if this is the first palindrome found or if the current palindrome is longer than the previously found palindrome.

3. **Check for palindromes of length 3 or more**
    * Use a nested loop to iterate through all possible substrings of length `k` (from 3 to `n`).
        * The outer loop iterates from `k = 3` to `n`.
        * The inner loop iterates from `i = 0` to `n-k+1`.
    * For each substring `s[i:i+k]`, check if it is a palindrome using the following conditions:
        * The substring `s[i+1:j-1]` (excluding the first and last characters) is already a palindrome according to the DP table `dp[i+1][j-1]`.
        * The first and last characters of the substring `s[i]` and `s[j]` are equal.
    * If both conditions are met, set the corresponding entry in the DP table `dp[i][j]` to `True` to indicate that the substring `s[i:j]` is a palindrome.
    * Update `maxLength` and `start` if the current palindrome is longer than the previously found palindrome.

4. **Return the longest palindrome**
    * After iterating through all possible substrings, the DP table `dp` will contain information about all palindromic substrings in the string `s`.
    * Use the `maxLength` and `start` values to retrieve the longest palindromic substring from the string `s` and return it.

### Time Complexity:
- The time complexity of this solution is O(n^2) where n is the length of the input string `s`.
- This is because there are two nested loops, each iterating over the string of length `n`.

### Space Complexity:
- The space complexity is also O(n^2) because of the 2D boolean array `dp`, which has dimensions `n x n`.
- Additionally, other variables used in the function have constant space requirements, so they do not contribute to the overall space complexity in terms of the input size.
