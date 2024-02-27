public class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length; // Get the length of the array
        int expectedSum = n * (n + 1) / 2; // Calculate the expected sum of all numbers from 0 to n

        int actualSum = 0; // Initialize a variable to store the actual sum of the elements in the array
        for (int num : nums) {
            actualSum += num; // Add each element to the actual sum
        }

        return expectedSum - actualSum; // Return the missing number as the difference between expected and actual sums
    }
}
