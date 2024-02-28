# Reverse Bits of Unsigned Integer

## Class: Solution

This class contains a method `reverseBits()` to reverse the bits of a 32-bit unsigned integer.

### Method: `reverseBits`

Reverses the bits of a 32-bit unsigned integer.

#### Parameters

- `n`: A 32-bit unsigned integer to reverse its bits.

#### Returns

A 32-bit unsigned integer representing the result of reversing the bits of the input integer.

### Approach

The `reverseBits()` method iterates through each bit of the input unsigned integer `n`, reverses its order, and builds the result bit by bit.

1. **Bit Reversal:**
   - Initialize an unsigned integer `ans` to store the reversed bits, initially set to 0.
   - Iterate through each bit of the input unsigned integer `n` (32 iterations):
     - Left shift the `ans` by one position to make space for the next bit.
     - Perform a bitwise OR operation between `ans` and the least significant bit of `n` (obtained using `n & 1`).
     - Right shift the input unsigned integer `n` by one position to process the next bit.

2. **Return Result:**
   - After iterating through all 32 bits, return the final result `ans` containing the reversed bits.

The approach efficiently reverses the bits of a 32-bit unsigned integer by iterating through each bit, left-shifting the result, and then OR-ing with the next bit from the input integer.
