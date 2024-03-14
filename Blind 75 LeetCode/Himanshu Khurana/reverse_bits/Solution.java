public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1;  // shift the bits of result to the left
            result |= (n & 1);  // append the last bit of n to result
            n >>= 1;  // shift the bits of n to the right
        }
        return result;
    }
}
