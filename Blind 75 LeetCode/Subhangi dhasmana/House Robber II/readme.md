# Code Explanation: House robber 2 - Python Solution

## Explanation:

- The rob method finds the maximum amount of money that can be robbed from a circular row of houses.
- It uses dynamic programming with two separate runs of the rec function, excluding the first and last houses.
- The rec function iterates through the houses, maintaining r1 and r2 as the maximum amount of money that can be robbed up to the ith and i+1th houses.
- For each house i, the maximum amount of money that can be robbed up to that house is calculated as max(i + r1, r2).
- The function returns the maximum amount of money that can be robbed from either run of the rec function.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)