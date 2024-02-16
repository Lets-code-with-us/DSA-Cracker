# Code Explanation: Maximum subarray - Python Solution

## Explanation:

- Initialize res to the first element of the nums array. This variable will hold the maximum sum found so far.

- Initialize total to 0. This variable keeps track of the current sum of the subarray being processed.

- Iterate through each element n in the nums array.

- Add n to total.

- Update res to be the maximum of res and total. This captures the maximum sum encountered so far.

- If total becomes negative, it means the current subarray's sum is negative, so reset total to 0. This effectively discards the current subarray and starts considering a new potential subarray.

- Finally, return res, which holds the maximum sum of all contiguous subarrays.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)