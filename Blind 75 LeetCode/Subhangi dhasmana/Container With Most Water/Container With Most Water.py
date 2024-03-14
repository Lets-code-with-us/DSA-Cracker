class Solution:
    def maxArea(self, height: List[int]) -> int:
        maxi = -(2**31-1)
        area = 1
        i = 0
        j = len(height)-1
        while i<j:
            w = j-i
            h = min(height[i], height[j])
            area = w*h
            maxi = max(maxi, area)
            if height[i]<=height[j]:
                i+=1
            else:
                j-=1
        return maxi