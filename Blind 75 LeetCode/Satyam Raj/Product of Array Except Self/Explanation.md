#Problem Name : 238. Product of Array Except Self

#Problem Link : [Link](https://leetcode.com/problems/product-of-array-except-self/)

#Example

Example 1:

		Input: nums = [1,2,3,4]
		Output: [24,12,8,6]
		
Example 2:

		Input: nums = [-1,1,0,-3,3]
		Output: [0,0,9,0,0]
	 
#Constraints:

		2 <= nums.length <= 105
		-30 <= nums[i] <= 30
		The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
		
		Follow up: Can you solve the problem in O(1) extra space complexity? 
		(The output array does not count as extra space for space complexity analysis.)
	
	
#Approach

	Step 1 : create a result array for storing the result and returning it.
	Step 2 : initialize the 0th index of result array to be 1, i.e res[0] = 1.
	Step 3 : iterate to the array and calculate the left product
			 iterate to the array and calculate the right product
			 
			 return result array.
			
			
		class Solution {
			public int[] productExceptSelf(int[] nums) {
				int n = nums.length;
				// result array to store the result
				int[] res = new int[n];
				// initialize the first index to be 1
				res[0] = 1;
				// loop to the nums array and calculate the left product
				for (int i = 1; i < n; i++) {
					res[i] = res[i - 1] * nums[i - 1];
				}
				int right = 1;
				// loop to nums array and calculate the right product
				for (int i = n - 1; i >= 0; i--) {
					res[i] *= right;
					right *= nums[i];
				}
				return res;
			}
		}