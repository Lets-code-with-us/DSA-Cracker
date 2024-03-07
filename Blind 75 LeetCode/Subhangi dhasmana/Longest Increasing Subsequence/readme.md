# Code Explanation: Longest Increasing Subsequence - Python Solution

## Explanation:

- The function lengthOfLIS takes a list of integers nums as input and returns the length of the longest increasing subsequence.
- It initializes an array dp of length n, where n is the length of the input list nums. Each element in dp represents the length of the LIS ending at that index.
- It iterates through each element of nums and for each element, iterates through the elements before it to check if there exists a longer increasing subsequence that can be appended to it.
- If nums[i] is greater than nums[j], where j ranges from 0 to i-1, it means nums[i] can be appended to the LIS ending at nums[j] to form a longer increasing subsequence. In this case, the length of the LIS ending at nums[i] is updated to dp[j] + 1.
- Finally, the maximum value in the dp array gives the length of the longest increasing subsequence in nums.

## Complexity:
- Time Complexity: O(n^2)
- Space Complexity: O(n)