class Solution {
    public int longestCommonSubsequence(String s1, String s2) {
        // if we write the code using the recursion then it is giving the time limit exceeded
        // so we are writing the aproach using the tabulation
        int n=s1.length();// length of first String
        int m=s2.length();// length of the Second String

        int[][]dp=new int[n+1][m+1];// creatinga  2-D dp array
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)){
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        return dp[n][m];
    }
}
// Time complexity: O(n*m)

// Space complexity: O(n*m)
