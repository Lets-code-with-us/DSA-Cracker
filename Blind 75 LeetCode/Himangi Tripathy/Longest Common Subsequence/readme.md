class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        final int m= text1.length();//we initialize m to the final value of text1 length
        final int n = text2.length();//we initialize n to the final value of text2 length 
        int [][] dp=new int[m+1][n+1];//dp array is initialized to a matrix of m+1 x n+1
        for(int i=0;i<m;i++){//we traverse till m-1
            for(int j=0;j<n;j++){// we traverse till n-1
                dp[i+1][j+1]=text1.charAt(i)==text2.charAt(j)? 1+dp[i][j]:Math.max(dp[i][j+1],dp[i+1][j]);//here we initialize i+1th, j+1 th index to character that is same in both the texts else element in dp of ith and jth index +1 is assigned the maximum value of dp matrix's ith and j+1th element and dp's i+1th and jth element
            }
        }
        return dp[m][n];//we return the dp element of  index m and n
    }
}