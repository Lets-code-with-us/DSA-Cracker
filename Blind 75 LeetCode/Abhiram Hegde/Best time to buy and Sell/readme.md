Explanation:
- The maxProfit method takes an array of prices as input and returns the maximum profit achievable from buying and selling stocks.
- It first checks if the prices array is null or empty. If it is, it returns 0, as no profit can be achieved in this case.
- It initializes two variables: minPrice to keep track of the minimum price seen so far, and maxProfit to store the maximum profit achieved.
- Then, it iterates through the prices array starting from the second element (i = 1) because we need at least two prices to make a profit.
 -Inside the loop:
 - It updates minPrice to be the minimum of the current minPrice and the current price prices[i].
 - It updates maxProfit to be the maximum of the current maxProfit and the difference between the current price prices[i] and minPrice, representing the profit if selling at the current price.
 - After iterating through the entire array, it returns the maxProfit, which represents the maximum profit achievable by buying and selling the stock.

Complexity:
- The time complexity of this solution is O(n), where n is the length of the prices array, as it iterates through the array only once.
- The space complexity of the provided solution is O(1), which means it uses constant space.
