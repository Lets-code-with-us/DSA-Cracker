# Code Explanation: Coin change - Python Solution

## Explanation:

- This code defines a class Solution with a method coinChange that takes a list of coin denominations coins and an integer amount as input.
- It initializes a dynamic programming array dp with length amount + 1. The array is initialized with 0 at index 0 and float('inf') elsewhere.
- It iterates from 1 to amount, and for each value i, it iterates through each coin denomination coin in coins.
- For each coin denomination coin, if the coin denomination is less than or equal to the current amount i, it updates the dp[i] value to the minimum of its current value and dp[i - coin] + 1.
- Finally, if dp[-1] (the value at the last index of dp) is still float('inf'), it means it's impossible to make the amount with the given coins, so it returns -1.
- Otherwise, it returns dp[-1], which represents the minimum number of coins needed to make up the amount.

## Complexity:
- Time Complexity: O(amount * n)
- Space Complexity: O(amount)