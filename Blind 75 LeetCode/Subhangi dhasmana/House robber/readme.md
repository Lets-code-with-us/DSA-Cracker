# Code Explanation: House robber - Python Solution

## Explanation:

- prev1 and prev2 are initialized to track the maximum amount that can be robbed if the previous house was robbed and if the house before that was robbed, respectively.
- curr is initialized as the sum of the first two houses' values.
- If the number of houses is 0, it returns 0.
- A loop iterates over the remaining houses starting from the second house.
- For each house, it calculates two possibilities:
pick: If the current house is picked, the amount would be the value of the current house plus the maximum amount that can be robbed from two houses ago (prev2).
notPick: If the current house is not picked, the amount would be the maximum amount that can be robbed from the previous house (prev1).
- curr is updated to the maximum of pick and notPick.
- prev2 is updated to the value of prev1, and prev1 is updated to the value of curr.
- Finally, it returns the maximum amount that can be robbed (prev1).

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)