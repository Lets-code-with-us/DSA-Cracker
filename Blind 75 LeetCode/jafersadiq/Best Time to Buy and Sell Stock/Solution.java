class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int currmin = Integer.MAX_VALUE;
       
    for(int i = 0;i<prices.length;i++){
        currmin = Math.min(currmin,prices[i]);
        int profit = prices[i] - currmin;
        maxProfit = Math.max(profit,maxProfit);
    }
    return maxProfit;
    }

}