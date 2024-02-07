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