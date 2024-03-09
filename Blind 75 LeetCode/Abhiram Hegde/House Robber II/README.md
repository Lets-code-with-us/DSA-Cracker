# House Robber Problem Solution Explanation

## `class Solution`

- This class encapsulates the solution for the House Robber problem.

## `public int rob(int[] nums)`

- This method takes an integer array `nums` representing the amount of money in each house and returns the maximum amount of money you can rob without alerting the police.
- If there is only one house, it directly returns the money in that house.
- Otherwise, it calculates the maximum amount of money if robbing from the first house to the second-to-last house (`max1`) and from the second house to the last house (`max2`). Then, it returns the maximum of the two.

## `private int robHelper(int[] nums, int start, int end)`

- This helper method calculates the maximum amount of money that can be robbed within a range of houses specified by `start` and `end`.
- It iterates over the houses in the specified range and maintains two variables `prevMax` and `currMax`.
- `prevMax` stores the maximum amount of money that can be robbed up to the previous house.
- `currMax` stores the maximum amount of money that can be robbed up to the current house.
- At each step, it updates `currMax` by considering whether it is better to rob the current house or skip it.
- Finally, it returns the maximum amount of money that can be robbed within the specified range.

This solution effectively handles the circular arrangement of houses by dividing the problem into two separate cases and using dynamic programming to find the optimal solution.
