public class Solution {
    public int[] countBits(int n) {
        int[] result = new int[n + 1]; // Initialize result array to store counts

        // Base case: 0 has 0 set bits
        result[0] = 0;

        // Build result using dynamic programming
        for (int i = 1; i <= n; i++) {
            // Get the set bits count of the previous even number
            int prevEven = result[i / 2];
            // If the current number is odd, add 1 to the previous even number's count
            result[i] = prevEven + (i & 1);
        }

        return result;
    }
}
