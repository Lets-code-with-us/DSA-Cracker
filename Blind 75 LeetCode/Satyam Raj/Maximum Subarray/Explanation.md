#Problem Name : 53. Maximum Subarray

#Problem Link : [Link](https://leetcode.com/problems/maximum-subarray/)

#Example

Example 1:

		Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
		Output: 6
		Explanation: The subarray [4,-1,2,1] has the largest sum 6.
		
Example 2:

		Input: nums = [1]
		Output: 1
		Explanation: The subarray [1] has the largest sum 1.
		
Example 3:

		Input: nums = [5,4,-1,7,8]
		Output: 23
		Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
	 
#Constraints:

		1 <= nums.length <= 105
		-104 <= nums[i] <= 104	
	
	
#Approach

	Step 1 : Initialize a maxSum variable to store the maxSum and currSum to store the currSum.
	Step 2 : Iterate through the array and add the nums[i] to currSum
	Step 3 : Store maxSum as Max(currSum, maxSum)
			if currSum goes negative then reset it to zero.
			
			return the maxSum at the end as answer..
			
			
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