class Solution:
	def swapKth(self,arr, n, k):
		arr[k-1], arr[-k] = arr[-k], arr[k-1]