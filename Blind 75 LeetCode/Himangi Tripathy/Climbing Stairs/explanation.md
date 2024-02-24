class Solution {
    public int climbStairs(int n) {
        int [] dp=new int[n+1];//dp is a new array initialized with index n+1
        dp[0]=1;//1st element of dp is 1
        dp[1]=1;//2nd element of dp is 1
        for(int i=2;i<=n;i++){//we traverse the array from the third element of the array
            dp[i]=dp[i-1]+dp[i-2];//we set the index of the array equal to the difference of its previous 2 indexes
        }
        return dp[n];//return the array
    }
}