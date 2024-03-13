# Counting Bits

## Class: Solution

This class contains a method to count the number of set bits (1s) in the binary representation of integers from 0 to n.

### Method: `countBits`

Counts the number of set bits (1s) in the binary representation of integers from 0 to n.

#### Parameters

- `n`: An integer representing the upper limit.

#### Returns

A vector of integers representing the count of set bits (1s) for each integer from 0 to n.

### Approach

The `countBits` method counts the number of set bits (1s) in the binary representation of integers from 0 to n.

1. **Bit Counting Function:**
   - Define a helper function `bit` that counts the number of set bits (1s) in the binary representation of an integer.
   - Initialize a variable `res` to store the count of set bits.
   - Iterate until the number becomes zero:
      - Add the least significant bit (LSB) of the number to the result `res` by performing modulo operation with 2.
      - Right shift the number by 1 bit to discard the LSB.

2. **Result Generation:**
   - Initialize an empty vector `resul` to store the results.
   - Iterate from 0 to `n`:
      - For each integer `i`, call the `bit` function to count the set bits in its binary representation.
      - Push the count of set bits for `i` into the vector `resul`.

3. **Result:**
   - After the loop completes, return the vector `resul`, which contains the count of set bits for each integer from 0 to n.

The approach efficiently counts the number of set bits (1s) in the binary representation of integers from 0 to n by iterating through the integers and using a helper function to perform the bit counting.
