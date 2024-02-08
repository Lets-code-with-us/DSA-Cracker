# Maximum Profit from Stock Prices

## Class: Solution

This class contains a method to find the maximum profit that can be achieved by buying and selling a stock at the right times.

### Method: `maxProfit`

Calculates the maximum profit that can be achieved by buying and selling a stock at the right times.

#### Parameters

- `prices`: A vector of integers representing the prices of the stock on consecutive days.

#### Returns

An integer representing the maximum profit that can be achieved.

### Approach

The `maxProfit` method calculates the maximum profit that can be achieved by buying and selling a stock at the right times.

1. **Initialization:**
   - Initialize variables `least` to store the minimum price encountered so far, `op` to store the maximum profit, and `pist` to store the potential profit in the current iteration.

2. **Iterating Through Prices:**
   - Iterate through the prices vector.
   - For each price:
      - If the current price is less than the stored `least`, update `least` to the current price.
      - Calculate the potential profit (`pist`) by subtracting the current price from `least`.
      - If the potential profit (`pist`) is greater than the stored `op`, update `op` to the potential profit.

3. **Result:**
   - After iterating through all prices, return the maximum profit (`op`) that can be achieved.

The approach efficiently iterates through the prices vector to find the maximum profit by considering each price as a potential selling price and updating the minimum buying price (`least`) accordingly. The maximum profit is updated whenever a higher potential profit (`pist`) is found.
