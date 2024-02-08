#Problem Name : 217. Contains Duplicate

#Problem Link : [Link](https://leetcode.com/problems/contains-duplicate/)

#Example

Example 1:

		Input: nums = [1,2,3,1]
		Output: true
		
Example 2:

		Input: nums = [1,2,3,4]
		Output: false
		
Example 3:

		Input: nums = [1,1,1,3,3,4,3,2,4,2]
		Output: true
	 
#Constraints:

	1 <= nums.length <= 105
	-109 <= nums[i] <= 109
	
	
	
#Approach

	Step 1 : Create a map of (Integer, Integer) to store the number that exists previously.
	Step 2 : Iterate through the array and check is if currEl is present or not in map
			if present then return the number.
			
	Step 3:	if after iterating in the array, not found the number then return false.
			
		
		class Solution {
			public boolean containsDuplicate(int[] nums) {
				// HashMap to store the value and its freq 
				HashMap<Integer, Integer> map = new HashMap<>();
				int val = 1;
				// loop to nums array
				for(int i : nums) {
					// if i already exists in nums array
					if(map.containsKey(i)) {
						return true;
					}
					map.put(i, val);
				}
				// if not then return false
				return false;
			}
		}