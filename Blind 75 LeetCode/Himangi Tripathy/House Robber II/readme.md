class Solution {
    public int rob(int[] nums) {
        if(nums.length==0){//if the length of nums array is 0 then
            return 0;//return 0
        }
        if(nums.length==1){//if  the length of nums array is 1 then
            return nums[0];//return the 1st element of nums array
        }
        return Math.max(rob(nums,0,nums.length-2),rob(nums,1,nums.length-1));//else return maximum value of the method rob which contains nums array with index starting index and ending with the length of nums array -2
    }
    private int rob(int[]nums ,int l,int r){
        int prev1=0;//we set prev1 to 0
        int prev2=0;//we set prev2 to 0
        for(int i=l;i<=r;i++){//we start traversing from lth index to rth index element 
            final int dp = Math.max(prev1,prev2+nums[i]);//we set the final value of dp array to the maximum value of prev1,and addition of prev2 and nums ith element   
            prev2=prev1;//prev2 is set to the value of prev1
            prev1=dp;//prev1 is set to the value  dp 
        }
        return prev1;//we return prev1
    }
}