public class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            minPrice = Math.min(minPrice, price); // Update minimum price seen so far
            maxProfit = Math.max(maxProfit, price - minPrice); // Calculate potential profit for current price
        }

        return maxProfit;
    }
}
