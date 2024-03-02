class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        lptr, profit = 0, 0
        for rptr in range(1, len(prices)):
            if prices[lptr] < prices[rptr]:
               profit = max(profit, prices[rptr] - prices[lptr])
            else:
                lptr = rptr
        return profit
