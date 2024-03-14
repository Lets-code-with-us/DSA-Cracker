class Solution {
    public int[] countBits(int n) {
        //declare an array to store our ans where index represent the n elements
   int dp[]=new int[n+1];
   for(int i=0;i<=n;i++)
   {
       // for even number :- no of bits in any number == no of bits in [number/2]
	   //for odd number :- no of bits in any number == no of bits in [number/2]+1
       dp[i]=dp[i/2]+i%2;    //i%2 adding 1 to odd number
   }
    return dp;
    }
}
