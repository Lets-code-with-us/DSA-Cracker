public class Solution {
    // you need to treat n as an unsigned value
    public int reverseBits(int n) {
        int reversed = 0;
        for (int i = 0; i < 32; i++) {
            // Extract the least significant bit (LSB)
            int lastBit = n & 1;

            // Shift the reversed bits left by 1 to make space for the new bit
            reversed = reversed << 1;

            // Add the extracted LSB to the reversed bits
            reversed |= lastBit;

            // Right shift n by 1 to remove the processed LSB
            n >>>= 1;
        }

        return reversed;
    }
}
