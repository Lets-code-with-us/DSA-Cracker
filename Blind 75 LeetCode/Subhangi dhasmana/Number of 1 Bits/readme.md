# Code Explanation: Number of 1 Bits - Python Solution

## Explanation:

- This Python class defines a method hammingWeight that calculates the number of bits set to 1 in the binary representation of a given integer n.
- It does this using the bitwise AND operation & with (n - 1) to clear the least significant bit and incrementing a count until n becomes zero.

## Complexity:
- Time Complexity: O(log n)
- Space Complexity: O(1)