## Best Time to Buy and Sell Stock: Maximum Profit

This code implements a solution in Java to find the maximum profit achievable by buying and selling a single stock once within a given price array.

**Problem Statement:**

Given an array `prices` where `prices[i]` represents the price of a stock on day `i`, find the maximum profit you can make by buying and selling the stock on different days. You are allowed to complete at most one transaction (buy one and sell one share of the stock).

**Solution Approach:**

This solution iterates through the `prices` array and tracks two key variables:

1. **`minPrice`:** Represents the minimum price encountered so far.
2. **`maxProfit`:** Tracks the maximum potential profit based on the current price and previously observed minimum price.

**Steps:**

1. **Iterating Through Prices:**
   - We iterate through each `price` in the `prices` array.

2. **Updating Minimum Price:**
   - For each `price`, we compare it to the current `minPrice`.
   - If the current `price` is lower than `minPrice`, it represents a potential buying opportunity, so we update `minPrice` with the lower value.

3. **Calculating Potential Profit:**
   - We calculate the potential profit for the current `price` by subtracting the `minPrice` from it. This represents the profit if we were to buy at the minimum price and sell at the current price.

4. **Updating Maximum Profit:**
   - We compare the calculated potential profit with the current `maxProfit`.
   - If the potential profit is greater than `maxProfit`, it signifies a better selling opportunity, so we update `maxProfit` with the higher value.

5. **Return Maximum Profit:**
   - After iterating through the entire array, the `maxProfit` variable holds the maximum achievable profit from any buy-sell transaction within the given prices. We return this value.

**Time and Space Complexity:**

- Time complexity: O(n), where n is the length of the `prices` array, due to the single iteration.
- Space complexity: O(1), as it uses constant extra space for variables.

**Additional Notes:**

- This solution assumes you can only buy and sell the stock once.
- It finds the maximum potential profit, not necessarily the optimal buy and sell days.
