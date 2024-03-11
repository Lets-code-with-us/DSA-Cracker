## Climbing Stairs: Dynamic Programming Solution

This code implements dynamic programming to efficiently calculate the number of distinct ways to climb `n` stairs in Java.

**Problem Statement:**

Given a non-negative integer `n` representing the number of stairs, find the number of distinct ways to reach the top. You can either climb 1 or 2 stairs at a time.

**Solution Approach:**

This solution employs dynamic programming, a technique that breaks down the problem into smaller subproblems and stores their solutions for reuse, improving efficiency.

**Base Cases:**

- If `n` is 1, there's only 1 way to climb (1 step).
- If `n` is 2, there are 2 ways to climb (1 step twice or 2 steps once).

**Dynamic Programming Table:**

- We create a table `dp` of size `n + 1` to store the number of ways to climb `i` stairs (0 to `n`).

**Recursive Relation:**

The number of ways to climb `n` stairs is the sum of the number of ways to climb `n-1` stairs and `n-2` stairs.
This is because to reach the `n`th stair, you can either:

- Climb to the `(n-1)`th stair in one way and then climb the last stair (1 step).
- Climb to the `(n-2)`th stair in one way and then climb the last two stairs (2 steps).

**Iterative Table Filling:**

- We iterate through the `dp` table, starting from 3 (`n = 3`) and fill it using the base cases and the recursive relation:

```java
dp[i] = dp[i - 1] + dp[i - 2];
