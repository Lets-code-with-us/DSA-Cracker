class Solution {
	public int maxSubArray(int[] nums) {
		// Kadans Algo
		// initialize maxSum to -Infinity, currSum to zero
		int maxSum = Integer.MIN_VALUE, currSum = 0;
		// iterate in nums array
		for(int i : nums) {
			currSum += i;
			maxSum = Math.max(currSum, maxSum);
			// if currSum is negative then resetting it to 0
			if(currSum < 0) {
				currSum = 0;
			}
		}
		return maxSum;
	}
}