Initialize an array dp to store the maximum profit at each day.
Set the initial minimum stock price mi to the first element of the prices vector.
Set dp[0] to 0 since there is no profit initially.
Iterate through the prices starting from the second element.
If the current price is greater than the minimum price (mi), update dp[i] to be the maximum of the previous day's profit and the profit obtained by selling at the current price (prices[i] - mi).
If the current price is not greater than mi, update mi to be the minimum of the current price and the previous minimum.
Continue the loop until all prices are processed.
Return the maximum profit calculated at the last day, which is stored in dp[prices.size()-1].
