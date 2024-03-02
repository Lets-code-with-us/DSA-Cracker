
**Code Explanation:**

**1. Initialization:**

- `minPrice`: Set to `Integer.MAX_VALUE` to ensure it's updated with the first price.
- `max_profit`: Set to 0, representing the initial maximum profit.

**2. Iteration:**

- The `for` loop iterates through each price in the `prices` array.

**3. Updating `minPrice`:**

- If the current price `prices[i]` is less than `minPrice`, update `minPrice` to track the lowest price seen so far.

**4. Calculating Potential Profit:**

- Calculate the difference between the current price and `minPrice` (`prices[i] - minPrice`).
- If this difference is greater than `max_profit`, it indicates a potentially more profitable scenario.

**5. Updating `max_profit`:**

- If `prices[i] - minPrice > max_profit`, update `max_profit` to the current difference, storing the maximum potential profit.

**6. Return Value:**

- After iterating through all prices, `max_profit` holds the maximum potential profit.
- The function returns `max_profit`.

**Key Points:**

- The code efficiently finds the maximum profit using a single loop.
- It assumes only one buy and one sell transaction.
- For multiple buy-sell transactions, different algorithms would be needed.
