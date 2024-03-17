class Solution {
    public int getSum(int a, int b) {
       // Iterate until there is no carry
        while (b != 0) {
            // Carry holds common set bits of a and b
            int carry = a & b;
            
            // Sum of bits of a and b where at least one of the bits is not set
            a = a ^ b;
            
            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
}
}