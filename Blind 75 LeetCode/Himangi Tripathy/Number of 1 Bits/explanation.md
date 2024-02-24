public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        return Integer.bitCount(n);//we use an inbuilt method bitCount of Integer class to return the number of one-bits in the two's complement binary representation of n
        
    }
}