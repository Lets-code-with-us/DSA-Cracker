class Solution {
    public int maxProfit(int[] prices) {
        int minbuy=prices[0];
        int profit=0;
        for(int i=0;i<prices.length;i++){
            minbuy=Math.min(minbuy,prices[i]);
            profit=Math.max(profit,prices[i]-minbuy);

            }
        return profit;
    }
}
