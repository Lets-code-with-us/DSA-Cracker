## Counting Bits (Java)

This document explains how to count the number of set bits (1s) in the binary representation of an integer using Java. Here, we'll explore two efficient solutions:

**1. Looping with Bit Manipulation:**

This approach iterates through each bit of the input integer and checks if it's set.

**Explanation:**

1. Initialize a `count` variable to 0 to store the number of set bits.
2. Loop through each bit of `n` (32 bits for a 32-bit integer):
   - Use the bitwise AND (`&`) operator with 1 to isolate the current bit.
   - If the result is non-zero (meaning the bit is set):
      - Increment the `count` variable.
   - Right shift `n` by 1 bit to move to the next bit.
3. Return the final `count`.

**Code Example:**

```java
public class Solution {
    public int countSetBits(int n) {
        int count = 0;
        while (n != 0) {
            count += (n & 1);
            n >>>= 1;
        }
        return count;
    }
}
