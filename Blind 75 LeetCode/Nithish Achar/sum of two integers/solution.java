class Solution {
    public int getSum(int a, int b) {
        // Handle overflow using bitwise XOR and left shift
        while (b != 0) {
            // Get the carry
            int carry = a & b;

            // Add without overflow
            a = a ^ b;

            // Left shift the carry for the next iteration
            b = carry << 1;
        }

        return a;
    }
}
