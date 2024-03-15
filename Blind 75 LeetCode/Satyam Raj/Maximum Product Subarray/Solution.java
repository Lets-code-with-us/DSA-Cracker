class Solution {
	public int maxSubArray(int[] nums) {
		// to store the maximum product
		int max = Integer.MIN_VALUE;
		// prefix to store the product from starting
		// prefix to store the product from ending
		int prefix = 1, suffix = 1;
		int n = nums.length;

		// loop to the array
		for(int i=0; i<n; i++) {
			// if prefix or suffix becomes zero at any moment then reset it to one
			if(prefix == 0) prefix = 1;
			if(suffix == 0) suffix = 1;

			// calculating the prefix
			prefix *= nums[i];
			// calculating the suffix
			suffix *= nums[n-i-1];

			// store the max of prefix and suffix and maxTillNow
			max = Math.max(max, Math.max(prefix, suffix));
		}
		return max;
	}
}