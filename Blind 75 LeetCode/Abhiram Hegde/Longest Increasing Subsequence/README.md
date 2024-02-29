### Explanation of Longest Increasing Subsequence Algorithm

#### Class Definition:
- The `Solution` class encapsulates the algorithm to find the length of the longest increasing subsequence.

#### Method `lengthOfLIS`:
- This method takes an integer array `nums` as input and returns an integer representing the length of the longest increasing subsequence.
- It checks if the input array is null or empty. If so, it returns 0 as there can be no increasing subsequence in such cases.

#### Dynamic Programming Approach:
1. **Initialization**:
   - The algorithm initializes an array `dp` of size `n`, where `n` is the length of the input array `nums`. This array stores the length of the longest increasing subsequence ending at each index.
   - Each element of `dp` is initially set to 1, representing the minimum length of the subsequence for each single element.

2. **Dynamic Programming Iteration**:
   - It iterates over the input array `nums` starting from the second element.
   - For each element at index `i`, it compares it with all previous elements at indices `[0, i - 1]`.
   - If `nums[i]` is greater than `nums[j]` (where `j` ranges from `0` to `i - 1`), it means `nums[i]` can be part of the increasing subsequence ending at index `i`.
   - It updates the value of `dp[i]` to be the maximum of its current value and `dp[j] + 1`, where `dp[j]` represents the length of the LIS ending at index `j`.

3. **Maximum Length Calculation**:
   - During each iteration, it also keeps track of the maximum length found so far in the variable `maxLen`.

4. **Final Result**:
   - After iterating over all elements, it returns the maximum length found (`maxLen`) as the result.

#### Time Complexity:
- The time complexity of this algorithm is O(n^2), where n is the length of the input array `nums`, due to the nested loops used for dynamic programming.

#### Space Complexity:
- The space complexity is O(n) as additional space is required to store the `dp` array of length `n`.
