## Climbing Stairs Problem Explanation

### Problem Statement:
You are climbing a staircase. It takes `n` steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

### Approach:
We can solve this problem using dynamic programming. We'll use an array `dp` to store the number of distinct ways to reach each step. We initialize `dp[1] = 1` and `dp[2] = 2` since there's only one way to climb 1 step and two ways to climb 2 steps. Then, for each step `i` from 3 to `n`, we calculate `dp[i]` as the sum of `dp[i-1]` and `dp[i-2]`, representing the number of ways to reach step `i` by taking either one step or two steps from the previous steps.

### Detailed Explanation:
1. If `n` is 1, there's only one way to climb to the top, so return 1.
2. Create an array `dp` of size `n + 1` to store the number of distinct ways to reach each step.
3. Initialize `dp[1] = 1` and `dp[2] = 2` since there's only one way to climb 1 step and two ways to climb 2 steps.
4. Iterate from `i = 3` to `n`:
   - Calculate `dp[i]` as the sum of `dp[i-1]` and `dp[i-2]`, representing the number of ways to reach step `i` by taking either one step or two steps from the previous steps.
5. Return `dp[n]`, which represents the number of distinct ways to climb to the top.

### Complexity Analysis:
- Time Complexity: O(n) - We iterate through the steps from 3 to `n` once.
- Space Complexity: O(n) - We use an array `dp` of size `n + 1`.
