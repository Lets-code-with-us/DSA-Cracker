class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int minPrice = INT_MAX;
        int maxProfit = 0;

        int n = prices.size();
        if (n <= 1) {
            return 0; 
        }

        for (int i = 0; i < prices.size(); i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; 
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice; 
            }
        }

        return maxProfit;
    }
};
