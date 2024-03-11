class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        ans = []
        nums.sort()
        for i in range(len(nums)):
            if i>0 and nums[i]==nums[i-1]: continue
            j=i+1
            k=len(nums)-1
            while(j<k):
                totSum = nums[i]+nums[j]+nums[k]
                if totSum<0:
                    j+=1
                elif totSum>0:
                    k-=1
                else:
                    temp = [nums[i], nums[j], nums[k]]
                    ans.append(temp)
                    j+=1
                    k-=1
                    while nums[j]==nums[j-1] and j<k:
                        j+=1
                    while nums[k]==nums[k+1] and j<k:
                        k-=1
        return ans