class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:

        merge_array = [0] * (m + n)

        for i in range(m + n):
            if (i < m):
                merge_array[i] = nums1[i]
            else:
                merge_array[i] = nums2[i - m]

        for i in range(n+m):
            for j in range(i+1, n+m):
                if (merge_array[j] < merge_array[i]):
                    temp = merge_array[j]
                    merge_array[j] = merge_array[i]
                    merge_array[i] = temp

        for i in range(m + n):
            nums1[i] = merge_array[i]