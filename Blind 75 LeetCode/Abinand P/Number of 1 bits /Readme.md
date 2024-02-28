# Hamming Weight Calculation

## Class: Solution

This class contains a method `hammingWeight()` to calculate the Hamming weight of a 32-bit unsigned integer.

### Method: `hammingWeight`

Calculates the Hamming weight of a 32-bit unsigned integer.

#### Parameters

- `n`: A 32-bit unsigned integer for which the Hamming weight needs to be calculated.

#### Returns

An integer representing the number of set bits (1s) in the binary representation of the input number.

### Approach

The `hammingWeight()` method calculates the Hamming weight of a 32-bit unsigned integer using bitwise operations.

1. **Initialization:**
   - Initialize a bitmask `bitMask` with the value 1 to check each bit of the input number.
   - Initialize a counter `count` to store the number of set bits.

2. **Bitwise Operation:**
   - Iterate 32 times (for a 32-bit integer):
     - Check if the least significant bit of `n` is set by performing a bitwise AND operation with `bitMask`.
     - If the bit is set, increment the `count`.
     - Right shift the input number `n` by one position to check the next bit.

3. **Return Result:**
   - Return the `count`, which represents the number of set bits in the input number.

The approach efficiently counts the number of set bits in the binary representation of a 32-bit unsigned integer using bitwise operations.
