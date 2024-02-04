/*Example
        Input: nums = [2,7,11,15], target = 9 

        Explanation:
        1st iteration:
        For i=0 and j=0 but j is not less than i so i++ .
        2nd iteration:
        For i=1 and j=0 ,i=1,j<i(true) so nums[i]+nums[j]=nums[1]+nums[0]=7+2=9 which is equal to the target value 9 so
        we assign sol[0]=j and j=0 and sol[1]=i and i=1 and 
        we return [0, 1].
        So Output: [0,1].
