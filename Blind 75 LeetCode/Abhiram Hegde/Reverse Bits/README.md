
Explanation:
- `public class Solution {`: Defines a class named `Solution`.
- `// you need treat n as an unsigned value`: Indicates that the input `n` should be treated as an unsigned value.
- `public int reverseBits(int n) {`: Defines a method `reverseBits` which takes an integer `n` as input and returns an integer.
- `int result = 0;`: Initializes a variable `result` to store the reversed bits.
- `for (int i = 0; i < 32; i++) {`: Loops 32 times, once for each bit in the integer.
- `result <<= 1;`: Shifts the `result` left by one bit to make space for the next bit.
- `result |= (n & 1);`: Sets the least significant bit of `result` to the least significant bit of `n`.
- `n >>>= 1;`: Shifts `n` right by one bit (unsigned shift).
- `}`: Closes the loop.
- `return result;`: Returns the reversed bits stored in `result`.
