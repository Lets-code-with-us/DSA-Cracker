Explanation:-Longest Increasing Subsequence

Approach:-DP approach use memoization to store result and send  maximum increasing length of subarray


Deatiled Approach

*Initialize one array with length of n(size of array) initialize it with 1 means atleast longest subsequence have size 1
*Loop 1 to n
	*Loop 0 to i
		*Now we have to check that if we find greater element then ele. at nums[i] means nums[i]>nums[j]
			*Check that if  dp[j+1] > dp[i]
				then update dp[i] with d[j]+1

*At last find maximum element from dp and return it


Complexity

Space:-O(n),for storing result in array dp

Time:-O(n^2),for traversing each element to finding next gratest element from array
