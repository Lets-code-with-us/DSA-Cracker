class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;// at the beginning the profit is zero
        int buyPrice=prices[0];// at the beginning the minimum price is first price
        for(int i=1;i<prices.length;i++){
            // if current price is less than buy price we will update
            if(prices[i]<buyPrice){
                buyPrice=prices[i];
            }
            else{
                int currPrice=prices[i]-buyPrice;
                profit=Math.max(currPrice,profit);
            }
        }
        return profit;

        
    }
}
