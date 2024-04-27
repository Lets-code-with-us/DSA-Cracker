
1. Initialization:
   - We initialize `cp` (buying price) and `sp` (selling price) with the first price in the `prices` list because at the start, we assume the first price is both the lowest and highest we've seen so far. We also initialize `max_profit` to 0 because initially, we haven't made any profit.

2. Iterating through prices:
   - We iterate through each price in the `prices` list.
   
3. Updating buying and selling prices:
   - Inside the loop, we check if the current price is lower than `cp`. If it is, we update `cp` to the current price because it means we can potentially buy at a lower price.
   - If the current price is higher than `sp`, we update `sp` to the current price because it means we can potentially sell at a higher price.
   
4. Calculating maximum profit:
   - We calculate the profit (`sp - cp`) at each iteration and update `max_profit` if the current profit is higher than the previous maximum profit.

5. Returning the result:
   - After iterating through all prices, we return the `max_profit` which represents the maximum profit achievable by buying and selling the stocks.

This algorithm has a time complexity of O(n), where n is the number of prices in the list, because it only requires a single pass through the list to find the maximum profit.
