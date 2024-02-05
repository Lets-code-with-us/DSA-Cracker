# Code Explanation: Best time to buy and sell stock - Python Solution

## Explanation:

- min_price = 2**31-1: Initializes min_price to a very large value, representing positive infinity. This is done to ensure that the first encountered price will be set as the minimum.

- max_profit = 0: Initializes max_profit to zero, as there is no profit initially.

- Iterates through each price in the given list using a for loop.

- Inside the loop: Checks if the current price (prices[i]) is less than the current minimum price (min_price).
- If true, updates min_price to the current price.
- If false, calculates the profit by subtracting the minimum price from the current price (prices[i] - min_price) and updates max_profit with the maximum value between the current max_profit and the calculated profit.

- Finally, the function returns the maximum profit.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)