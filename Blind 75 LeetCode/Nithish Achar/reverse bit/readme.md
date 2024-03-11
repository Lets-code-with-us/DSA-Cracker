## Reverse Bits LeetCode Problem

This Java code solves the LeetCode problem of reversing bits in an integer.

```java
public class Solution {
    // You need to treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;

        for (int i = 0; i < 32; i++) {
            result = (result << 1) | (n & 1);
            n >>>= 1; // Unsigned right shift
        }

        return result;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 43261596; // You can replace this with the input for testing
        int reversed = solution.reverseBits(n);
        System.out.println("Reversed bits: " + reversed);
    }
}
