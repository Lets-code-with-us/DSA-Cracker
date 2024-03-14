class Solution {
    public int coinChange(int[] coins, int amount) {
        int max=amount+1;//max is initialized to amount+1
        int [] dp= new int[amount+1];//dp is an array initialized with index amount+1
        Arrays.fill(dp,max);//we fill the array ap with max
        dp[0]=0;//we initialize 1st element of dp to 0
        for(int i=1;i<=amount;i++){//we traverse the array from 2nd element
            for(int j=0;j<coins.length;j++){//we traverse the array coins  
                if(coins[j]<=i){//we compare the elements in coins with amount
                    dp[i]=Math.min(dp[i],1+dp[i-coins[j]]);//we assign the minimum element to dp array indexes
                }
            }
        }
        return dp[amount]>amount ?-1 :dp[amount];//we return -1 if elements in dp is greater than amount and element of dp whose index is amount
        
    }
}