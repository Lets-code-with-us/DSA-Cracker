# Code Explanation: Container with most water - Python Solution

## Explanation:

- We start by initializing a variable maxi to hold the maximum area. We set its initial value to the minimum possible integer value.
- We also initialize a variable area to hold the current area and set it to 1.
- We set two pointers, i and j, to the start and end indices of the height list respectively.
- We then enter a while loop that continues as long as i is less than j.
- Inside the loop, we calculate the width w as the difference between j and i.
- We calculate the height h as the minimum value between the heights at indices i and j.
- We calculate the area by multiplying the width and height.
- We update maxi by taking the maximum between the current value of maxi and area.
- If the height at index i is less than or equal to the height at index j, we increment i by 1. This means we move the pointer i towards the right.
- If the height at index i is greater than the height at index j, we decrement j by 1. This means we move the pointer j towards the left.
- After the loop ends, we return the maximum area stored in maxi.

## Complexity:
- Time Complexity: O(n)
- Space Complexity: O(1)