#Problem Name : 152. Maximum Product Subarray

#Problem Link : [Link](https://leetcode.com/problems/maximum-product-subarray/)

#Example

Example 1:

		Input: nums = [2,3,-2,4]
		Output: 6
		Explanation: [2,3] has the largest product 6.
		
Example 2:

		Input: nums = [-2,0,-1]
		Output: 0
		Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
	 
#Constraints:

		1 <= nums.length <= 2 * 104
		-10 <= nums[i] <= 10
		The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
	
	
#Approach

	Step 1 : Initialize a max variable to store the maxProduct and initialise it with -Infinity.
	Step 2 : Initialize prefix and suffix variable to store the product from starting and from ending.
	Step 3 : Iterate to nums array
				if anytime prefix and suffix becomes zero then reinitialize it with one.
				calculate prefix as  	prefix *= nums[i]
				calculate suffix as 	suffix *= nums[n-i-1]
				
				then store max as 
					max = Max(max, prefix, suffix)
					
			return the max at the end as answer..
			
			
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