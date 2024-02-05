#Problem Name : 1. Two Sum

#Problem Link : [Link](https://leetcode.com/problems/two-sum/)

#Example

Example 1:

		Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
		Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
		
Example 2:

		Input: nums = [3,2,4], target = 6
		Output: [1,2]
		
Example 3:

		Input: nums = [3,3], target = 6
		Output: [0,1]
	 
#Constraints:

	2 <= nums.length <= 104
	-109 <= nums[i] <= 109
	-109 <= target <= 109
	Only one valid answer exists.
	
	
	
#Approach

	Step 1 : Create a map of (Integer, Integer) to store the number as well as index of that number.
	Step 2 : Iterate through the array and check is   (target - nums[i]) is present or not
			if not present then add the current number and index to the map.
			if present then return the index of current element and the found element index from map.
			
			
		class Solution {
			public int[] twoSum(int[] nums, int target) {
				// create a map to store the index with the number
				Map<Integer, Integer> map = new HashMap<>();

				// loop till end of array
				for(int i=0; i<nums.length; i++) {

					// we are searching for the number  ---> (target - nums[i])
					if(map.containsKey(target - nums[i])) {
						// returning the index of matched element from map and current index
						return new int[] {map.get(target - nums[i]), i};
					}
					// put the current number with index
					map.put(nums[i], i);
				}
				return new int[] {-1};
			}
		}