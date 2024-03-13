class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length==0){//if nums array length is 0 then
            return 0;//return 0
        }
        int []dp = new int [nums.length];//we initialize a new array dp
        Arrays.fill(dp,1);//we add 1 to dp array
        for(int i=1;i<nums.length;i++){//we traverse from 2nd element of dp array
            for(int j=0;j<i;j++){//we traverse from 1st element of dp array if j<i
                if(nums[j]<nums[i]){//if jth index element is less than ith index element of nums array then
                    dp[i]=Math.max(dp[i],dp[j]+1);//ith index of dp array is maximum element of dp of ith index and jth index +1 
                }
            }
        }
        return Arrays.stream(dp).max().getAsInt();//we return the length of the longest strictly increasing subsequence
    }
} 