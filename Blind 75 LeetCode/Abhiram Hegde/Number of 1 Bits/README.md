
### Explanation:

- The `hammingWeight` method calculates the Hamming weight of an integer `n` treated as an unsigned value.
- It initializes a `count` variable to store the number of '1' bits encountered.
- The method iterates through each bit of the 32-bit integer (since `int` is 32 bits in Java).
- Inside the loop, it checks if the current bit is set to '1' by performing a bitwise AND operation between `n` and a bitmask with only the `i`-th bit set (1 << i).
- If the result of the bitwise AND operation is not zero, it means the `i`-th bit is set in `n`, so the count is incremented.
- After iterating through all 32 bits, the method returns the count, which represents the number of '1' bits in the integer `n`.
- This approach effectively counts the number of set bits (bits equal to '1') in the binary representation of the integer `n`.
