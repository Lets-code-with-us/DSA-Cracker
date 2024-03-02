class Solution:
	def valueEqualToIndex(self,arr, n):
		indices = [arr[i] for i in range(n) if ((i+1) == arr[i])]
	    return indices