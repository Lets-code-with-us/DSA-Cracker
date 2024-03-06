# Code Explanation: Climbing Stairs- java Solution

Intuition

The "Climbing Stairs" problem can be solved using dynamic programming. The intuition behind the solution is that to reach the ith step, you can either come from (i-1)th step by taking one step, or from (i-2)th step by taking two steps. Therefore, the total number of ways to reach the ith step is the sum of the ways to reach (i-1)th step and (i-2)th step.

Approach

The function climbStairs takes an integer n as its parameter, representing the total number of steps in the staircase.

An array dp of size n+1 is created to store the number of ways to reach each step. dp[i] will represent the number of ways to reach the ith step.

The base cases are initialized: dp[0] and dp[1] are both set to 1, as there is one way to reach the 0th and 1st steps (i.e., not taking any step or taking one step).

A loop runs from i = 2 to n, and for each step i, the number of ways to reach it is calculated as the sum of the ways to reach (i-1)th and (i-2)th steps: dp[i] = dp[i-1] + dp[i-2].

The final result is dp[n], which represents the number of distinct ways to reach the top of the staircase with n steps.

Complexity

Time complexity:

The time complexity of this approach is O(n), where n is the total number of steps in the staircase. This is because the loop runs for n iterations, and each iteration involves constant time operations.

Space complexity:

The space complexity is O(n+1), which simplifies to O(n). This is due to the array dp of size n+1 used to store intermediate results for each step in the staircase.
