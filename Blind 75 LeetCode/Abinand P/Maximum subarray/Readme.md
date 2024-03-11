# Maximum Subarray Sum

## Class: Solution

This class contains a method to find the maximum subarray sum in a given vector of integers.

### Method: `maxSubArray`

Finds the maximum subarray sum in the given vector of integers.

#### Parameters

- `nums`: A vector of integers representing the input array.

#### Returns

An integer representing the maximum subarray sum.

### Approach

The `maxSubArray` method utilizes dynamic programming to find the maximum subarray sum efficiently.

1. **Dynamic Programming Initialization:**
   - Initialize a 2D vector `dp` of size 2xN, where N is the size of the input vector `nums`.
   - Initialize the first row and first column of the `dp` matrix with the values from the input vector `nums`.

2. **Dynamic Programming Iteration:**
   - Iterate through each element of the input vector `nums`, starting from the second element.
   - For each element at index `i`:
      - Calculate the maximum sum ending at index `i` (denoted as `dp[1][i]`) by taking the maximum of the current element and the sum of the current element and the maximum sum ending at the previous index (`dp[1][i-1]`).
      - Calculate the maximum subarray sum up to index `i` (denoted as `dp[0][i]`) by taking the maximum of the maximum subarray sum up to the previous index (`dp[0][i-1]`) and the maximum sum ending at index `i` (`dp[1][i]`).

3. **Result:**
   - Return the last element of the first row of the `dp` matrix, which represents the maximum subarray sum.

The approach efficiently computes the maximum subarray sum by iteratively updating the maximum sum ending at each index and the maximum subarray sum up to each index using dynamic programming.
