#Problem Name : 121. Best Time to Buy and Sell Stock

#Problem Link : [Link](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)

#Example

Example 1:

		Input: prices = [7,1,5,3,6,4]
		Output: 5
		
		Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
		Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

Example 2:

		Input: prices = [7,6,4,3,1]
		Output: 0
		
		Explanation: In this case, no transactions are done and the max profit = 0.

	 
#Constraints:

	1 <= prices.length <= 105
	0 <= prices[i] <= 104
	
	
	
#Approach

	Step 1 : initialize buyPrice to prices[0], maxProfit to 0 initially,
	Step 2 : Iterate through the array and check if 
			if : buyPrice < currPrice
				then calculate profit and store the max of currProfit and profitTillNow
			else: update the curr buyPrice to the currPrice because it is smaller than prev Buy Price
			
			
		class Solution {
			public int maxProfit(int[] prices) {
				int buyPrice = prices[0];
				int maxProfit = 0;
				// iterate to the prices array
				for(int i=0; i<prices.length; i++) {
					// if buy price is less than curr price
					if(buyPrice < prices[i]) {
						int profit = prices[i] - buyPrice;
						maxProfit = Math.max(profit, maxProfit);
					} else // update buyPrice
						buyPrice = prices[i];
				}
				return maxProfit;
			}
		}