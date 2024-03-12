# Length of Longest Increasing Subsequence

## Class: Solution

This class contains a method `lengthOfLIS()` to find the length of the longest increasing subsequence (LIS) in a given array of integers.

### Method: `lengthOfLIS`

Finds the length of the longest increasing subsequence (LIS) in the given array using the dynamic programming approach with binary search.

#### Parameters

- `nums`: A vector of integers representing the input array.

#### Returns

An integer representing the length of the longest increasing subsequence (LIS) in the input array.

### Approach

The `lengthOfLIS()` method utilizes the dynamic programming approach with binary search to efficiently find the length of the longest increasing subsequence (LIS).

1. **Initialization:**
   - Initialize an empty vector `tails` of the same size as the input array `nums` to store the tails of the increasing subsequences.
   - Initialize a variable `size` to 0 to represent the current size of the LIS.

2. **Binary Search and Update:**
   - Iterate through each element `x` in the input array `nums`.
   - For each element `x`, perform a binary search on the `tails` vector to find the position `i` where `x` can be inserted while maintaining the increasing order.
     - Initialize two pointers `i` and `j` to 0 and `size`, respectively.
     - While `i` is not equal to `j`, calculate the middle index `m` as `(i + j) / 2`.
     - If the value at `tails[m]` is less than `x`, update `i` to `m + 1`. Otherwise, update `j` to `m`.
   - Update the value at index `i` of the `tails` vector to `x`.
   - If `i` is equal to `size`, increment `size` by 1, indicating the insertion of a new element in the LIS.

3. **Result:**
   - After processing all elements in the input array, the variable `size` represents the length of the longest increasing subsequence (LIS). Return `size` as the result.

The approach efficiently finds the length of the longest increasing subsequence (LIS) in the given array using dynamic programming with binary search, resulting in a time complexity of O(n log n).
