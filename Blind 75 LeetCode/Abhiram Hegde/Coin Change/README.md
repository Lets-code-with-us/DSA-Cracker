
This code implements the `coinChange` method in the `Solution` class, which takes an array of coin denominations (`coins`) and an integer amount (`amount`). Here's a breakdown of the implementation:

- Initialize an array `dp` to store the minimum number of coins needed for each amount from 0 to `amount`.
- Fill the `dp` array with initial values, setting them to `amount + 1`, representing an invalid value initially.
- Set the base case `dp[0] = 0`, indicating that zero coins are needed to make up an amount of zero.
- Iterate through all amounts from 1 to `amount`.
- For each amount, iterate through all coin denominations.
- If the current coin denomination is less than or equal to the current amount, update `dp[i]` by taking the minimum of the current value of `dp[i]` and `1` (for the current coin) plus `dp[i - coin]`.
- Finally, return `dp[amount]` if it is less than or equal to `amount`, otherwise return `-1` indicating that no combination of coins can make up the amount.
