public class Solution {
    public static int hammingWeight(int n) {
        // Initialize a count variable to store the number of set bits
        int count = 0;

        // Iterate through each bit of the integer using the bitwise AND operator (&)
        // and the right shift operator (>>)
        while (n != 0) {
            // Check if the least significant bit (LSB) is 1 using the AND operator
            if ((n & 1) == 1) {
                // Increment the count if the LSB is 1
                count++;
            }

            // Right shift the integer by 1 bit to move to the next bit
            n >>>= 1;
        }

        // Return the total count of set bits
        return count;
    }

    public static void main(String[] args) {
        // Example usage
        int number = 11; // Binary representation: 00000000000000000000000000001011
        int numOnes = hammingWeight(number);
        System.out.println("Number of 1 bits in " + number + ": " + numOnes); // Output: 3
    }
}

