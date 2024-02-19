# Code Explanation: Sum of two integers - Python Solution

## Explanation:

- mask = 0xffffffff: This line creates a mask with all bits set to 1, ensuring that only the lower 32 bits are considered. This is because Python uses a 32-bit signed integer representation.

- while (b & mask) > 0: This loop continues until there are no more carries left. It checks if there is a carry in the addition of a and b by bitwise ANDing b with the mask.

- Inside the loop:
temp = (a & b) << 1: Calculate the carry by bitwise ANDing a and b, then left-shifting the result by 1 position.
a = a ^ b: Update a by performing bitwise XOR with b. This operation represents the sum without considering the carry.
b = temp: Update b with the carry value.

- return (a & mask) if b > 0 else a: Return the final sum, considering the mask if there is still a carry.

## Complexity:
- Time Complexity: O(1)
- Space Complexity: O(1)