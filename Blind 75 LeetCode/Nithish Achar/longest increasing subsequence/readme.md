## Longest Increasing Subsequence (LIS) - Dynamic Programming

This code implements a dynamic programming solution to find the length of the Longest Increasing Subsequence (LIS) in an array of numbers (`nums`).

**Explanation:**

1. **Base Case:**
   - Checks if the input array `nums` is null or empty. If so, returns 0 (no increasing subsequence possible).

2. **`dp` Array:**
   - Creates an array `dp` of the same length as `nums`.
   - Initializes all elements in `dp` to 1. `dp[i]` will represent the length of the LIS ending at index `i`.

3. **Dynamic Programming:**
   - Uses nested loops to iterate through the array:
     - Outer loop (`i`): iterates through each element in `nums`.
     - Inner loop (`j`): iterates through elements before `i` (0 to `i-1`).
     - Checks if the current element (`nums[i]`) is greater than the element at the inner loop index (`nums[j]`).
       - If true, it means a potential increasing subsequence exists.
       - Updates `dp[i]` with the maximum between its current value (`dp[i]`) and the length of the LIS ending at `j` (from `dp[j]`) plus 1 (accounting for the current element).

4. **Finding Maximum LIS Length:**
   - Initializes `maxLIS` to 1 (minimum possible LIS length).
   - Iterates through the `dp` array.
   - Updates `maxLIS` with the maximum value between itself and the current element in `dp`. This ensures we find the longest subsequence.

5. **Return Result:**
   - Returns the final value of `maxLIS`, which represents the length of the LIS in the input array.

**Main Function:**

- Creates an instance of `Solution`.
- Defines a sample array of numbers (`nums`).
- Calls `lengthOfLIS` to find the LIS length.
- Prints the result.

**Complexity:**

- Time Complexity: O(n^2) due to nested loops iterating through all possible pairs of elements.
- Space Complexity: O(n) for the `dp` array.
