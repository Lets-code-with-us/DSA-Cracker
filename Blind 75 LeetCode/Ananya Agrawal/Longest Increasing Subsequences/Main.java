class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        if(n <=1) return n;

        int []dp=new int[n];

        Arrays.fill(dp,1);
        int maxlength=0;
        for(int i=1;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
            maxlength=Math.max(maxlength,dp[i]);
        }
        return maxlength;
    }
}
