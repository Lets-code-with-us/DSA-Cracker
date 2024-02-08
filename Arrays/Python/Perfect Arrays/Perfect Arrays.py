class Solution:
    def IsPerfect(self,arr,n):
        rev_arr = [ele for ele in arr[::-1]]
        if (rev_arr == arr):
            return True
        else:
            return False