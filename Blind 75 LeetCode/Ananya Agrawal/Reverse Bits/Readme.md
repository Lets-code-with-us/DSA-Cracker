# Code Explanation: Reverse Bits - Java Solution

## Explanation:

Intuition

The task is like flipping the order of 0s and 1s in a binary number. To do this, we'll examine each bit (0 or 1) in the input number and construct the reversed number step by step.

Approach

We start with an answer variable set to 0. Write a for loop that will run 32 times (once for each bit). In the loop we will:

Move the answer's bits to the left.
ans <<= 1;
Check if the current bit is 1 and add it to the answer if it is.
ans |= (n & 1);
Move to the next bit in the given number.
n >>= 1;
After this process, the answer will have the reversed bits.

Complexity

Time complexity: O(1)

Space complexity: O(1)
