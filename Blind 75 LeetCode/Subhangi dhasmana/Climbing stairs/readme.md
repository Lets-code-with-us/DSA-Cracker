# Code Explanation: Climbing Stairs - Python Solution

## Explanation:

- This is a dynamic programming solution to the "Climbing Stairs" problem, where you can climb either 1 or 2 steps at a time.
- The function climbStairs takes an integer n as input, representing the total number of steps to climb.
- It initializes a list dp of size n+1 to store the number of ways to reach each step.
- Base cases are handled for n=1 and n=2, where there is only 1 way to climb 1 step and 2 ways to climb 2 steps.
- For steps beyond 2, the number of ways to reach step i is the sum of the ways to reach steps i-1 and i-2.
- The loop calculates and stores these values in the dp list.
- Finally, it returns the number of ways to reach step n.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(n)