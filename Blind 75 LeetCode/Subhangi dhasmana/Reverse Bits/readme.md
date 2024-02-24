# Code Explanation: Reverse bits - Python Solution

## Explanation:

- The function reverseBits calls an inner function f recursively to reverse the bits of the input integer.
- The inner function f shifts the bits of n to the right (n>>1) and shifts the accumulated result r to the left (r<<1), simultaneously accumulating the least significant bit of n into r.
- The recursion continues until n becomes less than 1, at which point the function returns the reversed result shifted left by the remaining number of bits (32 - count).

## Complexity:
- Time Complexity: O(1)
- Space Complexity: O(1)