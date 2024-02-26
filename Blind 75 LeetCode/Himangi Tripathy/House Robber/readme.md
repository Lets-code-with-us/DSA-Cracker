class Solution {
    public int rob(int[] nums) {
        final int n= nums.length;//we set the final value of n as the length of nums array
        if(n==0){//if n is 0 then
            return 0;we return 0
        }
        if(n==1){//if n is 1
            return nums[0];//then return the first element of nums array
        }
        int []dp = new int[n];//we create a new dp array of length n
        dp[0]=nums[0];//we set the 1st element of dp array as the 1st element of nums array
        dp[1]=Math.max(nums[0],nums[1]);//the second element of dp array is maximum value of 1st and 2nd element of the nums array 
        for(int i=2;i<n;i++){//we traverse the array from 3rd element
            dp[i]=Math.max(dp[i-1],dp[i-2]+nums[i]);//we set the elements in dp array to maximum value of dp array of i-1th element and addition of i-2th element and nums array ith element 
        }
        return dp[n-1];//we return the value of n-1th element of dp array
    }
}