# Code Explanation: Number of 1bits - java Solution

Approach

It takes an integer n as input.

It initializes a variable c to count the number of set bits (bits with a value of 1) in the binary representation of n.

It enters a while loop that continues until n becomes 0.

Within the loop, it performs the operation n = (n & (n - 1)). This operation effectively clears the least significant bit that is set to 1 in n. This is a bitwise AND operation between n and n-1, which effectively removes the rightmost set bit in n.

After performing this operation, it increments the counter c to keep track of the number of set bits removed.

The loop continues until n becomes 0, meaning all set bits have been cleared.

Finally, it returns the count c, which represents the Hamming weight of the original integer n, i.e., the number of set bits in its binary representation.
