# Code Explanation: Best time to buy and sell stock - java Solution

## Explanation:


Initialize a variable "minPrice" to the first element of the array "prices"

Initialize a variable "maxProfit" to 0

Iterate through the array starting from the second element

For each element in the array, check if it is less than the current "minPrice"

If it is, update "minPrice" with the current element

Else, check if the difference between the current element and "minPrice" is greater than "maxProfit". If it is, update "maxProfit" with the difference.

Return "maxProfit"

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)
