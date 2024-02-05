## steps:

 int maxProfit(vector<int>& p) {
        int minPrice = INT_MAX;
        int profit =0;
        for(int i=0; i<p.size(); i++)
        {
            minPrice = min(p[i], minPrice);
            profit = max(profit, p[i]-minPrice);
        }
        return profit;

* first, create a variableto store the minimum price of the stock, and initialize the profit with 0.
* traverse the loop and find the minimum price by comparing the previous value to the current value of the array,
* alongwith this also check the profit by comparing the previous profit value to the (currentValue - minimumPrice).

