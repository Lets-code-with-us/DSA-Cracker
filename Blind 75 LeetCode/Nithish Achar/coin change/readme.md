## Coin Change (Bottom-up Dynamic Programming)

This code solves the coin change problem using dynamic programming. It finds the minimum number of coins needed to make a given amount (`amount`) using available coin denominations (`coins`).

**Explanation:**

1. **Initialization:**
   - `dp` array is created to store the minimum number of coins needed for each amount from 0 to `amount`.
   - `dp` is initialized with a value greater than the maximum possible amount (`amount + 1`) except for `dp[0]` which is set to 0 (0 coins needed for amount 0).

2. **Iteration:**
   - Loops through each amount (`i`) from 1 to `amount`.
   - For each coin denomination (`coin`) in the `coins` array:
     - If the coin value (`coin`) is less than or equal to the current amount (`i`):
       - Calculate the minimum number of coins needed for the remaining amount (`i - coin`) using the `dp` array.
       - Update `dp[i]` with the minimum between the current value (`dp[i]`) and the calculated minimum for the remaining amount plus 1 (for the current coin). This ensures we choose the path with the fewest coins.

3. **Result:**
   - After iterating through all amounts and coins, `dp[amount]` holds the minimum number of coins needed for the target amount.
   - If `dp[amount]` is greater than the amount itself (meaning no solution exists), return -1. Otherwise, return `dp[amount]`.

**Main Function:**

- Creates an instance of `Solution`.
- Defines sample coin denominations (`coins`) and target amount (`amount`).
- Calls `coinChange` to find the minimum number of coins.
- Prints the result.

**Complexity:**

- Time Complexity: O(amount * coins.length) due to nested loops iterating through all possible combinations of amounts and coins.
- Space Complexity: O(amount) for the `dp` array.
