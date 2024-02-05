# Solution Explanation - Best Time to Buy and Sell Stock (Python3)

## Step 1 : Initialization

`lptr` is the left pointer that has been set to 0 (represents buying at the first day's price)

`profit` is set to 0 i.e initializing the maximum profit

## Step 2 : Iteration

`for rptr in range(1, len(prices)):` iterates through the price list using `rptr` (right pointer) from index 1 to the end of the array `prices`


```
if prices[lptr] < prices[rptr]:
        profit = max(profit, prices[rptr] — prices[lptr])
```


If the price at `rptr` is higher than the price at `lptr`, it calculates the potential profit by subtracting the buying price from the selling price and updates `profit` if the calculated profit is higher than the current maximum

```
else:
  left_ptr = right_ptr
```

If the price at rptr is not higher (no potential profit), update the left pointer `lptr` to right pointer `rptr` to move the buying point forward

## Step 3 : Return the maximum profit

After the iteration, return the final `profit` value representing the maximum achievable profit

## NOTE

Time complexity - O(n)

Space Complexity - O(1)
