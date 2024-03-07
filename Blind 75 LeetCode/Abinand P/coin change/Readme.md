# Coin Change

## Class: Solution

This class contains a method `coinChange()` to find the minimum number of coins required to make up a given amount.

### Method: `coinChange`

Finds the minimum number of coins required to make up a given amount using dynamic programming.

#### Parameters

- `coins`: A vector of integers representing the denominations of coins available.
- `amount`: An integer representing the target amount to make up using the given coins.

#### Returns

An integer representing the minimum number of coins required to make up the target amount. Returns `-1` if it is impossible to make up the amount using the given coins.

### Helper Method: `helper`

A recursive helper method used by `coinChange()` to calculate the minimum number of coins required for a given amount.

#### Parameters

- `coins`: A vector of integers representing the denominations of coins available.
- `amount`: An integer representing the target amount to make up using the given coins.
- `dp`: A vector representing the dynamic programming table to store previously calculated results.

#### Returns

An integer representing the minimum number of coins required to make up the target amount. Returns `INT_MAX` if it is impossible to make up the amount using the given coins.

### Approach

The `coinChange()` method uses dynamic programming to solve the problem.

1. **Dynamic Programming Setup:**
   - Initialize a vector `dp` of size `amount + 1` with initial values `-1`. This vector will store the minimum number of coins required to make up each amount from `0` to `amount`.

2. **Recursive Helper Method: `helper`**
   - The `helper()` method is used to recursively calculate the minimum number of coins required for a given amount.
   - Base cases:
     - If `amount` is `0`, return `0` (no coins needed).
     - If `amount` becomes negative, return `INT_MAX` (indicating it's not possible to make up the amount using the given coins).
     - If the result for `amount` is already calculated and stored in `dp`, return the stored result.
   - Iterate through each coin denomination in `coins`:
     - Recursively call `helper()` to calculate the minimum number of coins required for the remaining amount after subtracting the current coin denomination.
     - Update `steps` (minimum number of coins) if a valid result is obtained from the recursive call.
   - Store the minimum number of coins required for the current `amount` in the `dp` table.
   - Return the calculated minimum number of coins for the current `amount`.

3. **Return Result:**
   - If the result is `INT_MAX`, indicating it's impossible to make up the amount using the given coins, return `-1`. Otherwise, return the minimum number of coins required for the target amount.

The approach efficiently calculates the minimum number of coins required to make up the target amount using dynamic programming and recursion to handle different coin denominations.
