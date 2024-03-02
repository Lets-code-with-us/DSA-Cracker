# Max Profit Calculation in Stock Prices

## Problem Description
Given an array of stock prices representing the value of a stock on different days, the task is to find the maximum profit that can be obtained by buying and selling the stock. The buy and sell operations can only occur once.

## Solution Explanation

### Approach
The solution utilizes a single-pass algorithm to find the maximum profit by keeping track of the minimum stock price encountered so far and calculating the profit at each step.

### Algorithm
1. Initialize `maxProfit` and `currMin` to 0 and `Integer.MAX_VALUE`, respectively.
2. Iterate through the array of stock prices.
   - Update `currMin` by taking the minimum of the current minimum and the current stock price.
   - Calculate the profit that can be obtained by selling the stock on the current day (`prices[i] - currMin`).
   - Update `maxProfit` by taking the maximum of the current profit and the maximum profit so far.
3. Return the calculated `maxProfit`, representing the maximum profit achievable.