class Solution {
public:
    int maxProfit(vector<int>& prices) {
    int MaxProfit = 0, MinSoFar = prices[0], Profit = 0;
    for (int i = 0; i < prices.size(); i++)
    {
        Profit = prices[i] - MinSoFar;
        if (MinSoFar >= prices[i])
        {
            MinSoFar = prices[i];
        }
        else if (Profit > MaxProfit)
        {
            MaxProfit = Profit;
        }
    }
    return MaxProfit;
    }
};