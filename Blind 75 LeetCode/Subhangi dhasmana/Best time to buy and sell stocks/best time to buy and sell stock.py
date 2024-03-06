class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        min_price = 2**31-1
        max_profit = 0
        for i in range(len(prices)):
            if prices[i]<min_price:
                min_price=prices[i]
            else:
                max_profit=max(max_profit, (prices[i]-min_price))
                
        return max_profit