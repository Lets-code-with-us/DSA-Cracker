Explanation:Longest Consecutive Sequence


**Approach**

*Sort the array first
*Make variable cnt(for storing count),last(storing minimum ele)
*Then check for the minimum one 
    if nums[i]-1==last  then increase cnt and put last=nums[i];
    else if nums[i]!=last  then cnt=1 and put last=nums[i]
*At last in "maxi" store   

**Complexity**
Time Complexity : O(N log N),  for sort the array and then traverse it for finding longest sequence

Space Complexity : O(N), Unordered map space.

Solved using Array + Hash Table(Unordered map). Optimize Approach.