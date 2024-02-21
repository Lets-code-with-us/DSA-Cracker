# Climbing Stairs

## Class: Solution

This class contains a method `climbStairs()` to calculate the number of distinct ways to climb to the top of a staircase with `n` steps.

### Method: `climbStairs`

Calculates the number of distinct ways to climb to the top of a staircase with `n` steps.

#### Parameters

- `n`: An integer representing the number of steps in the staircase.

#### Returns

An integer representing the number of distinct ways to climb to the top of the staircase with `n` steps.

### Approach

The `climbStairs()` method uses dynamic programming to calculate the number of distinct ways to climb the staircase.

1. **Base Cases:**
   - If `n` is 0 or 1, there is only one way to climb the staircase (return 1).

2. **Dynamic Programming:**
   - Initialize two variables `prev` and `current` to track the number of ways to climb the staircase with `0` and `1` steps, respectively (both initially set to 1).
   - Iterate from `2` to `n`:
     - Calculate the current number of ways to climb the staircase with `i` steps by adding the previous two values (`prev` and `current`).
     - Update `prev` to store the previous value of `current`.
     - Update `current` to store the current calculated value.

3. **Return Result:**
   - After the iteration, the value of `current` represents the total number of distinct ways to climb to the top of the staircase with `n` steps. Return this value.

The approach efficiently calculates the number of distinct ways to climb to the top of a staircase with `n` steps using dynamic programming to avoid redundant calculations.
