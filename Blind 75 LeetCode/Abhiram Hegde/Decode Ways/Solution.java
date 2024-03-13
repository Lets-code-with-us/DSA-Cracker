class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==0||s.charAt(0)=='0'){
            return 0;
        }
        int[] dp=new int [n+1];
        dp[0]=1;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            char first=s.charAt(i-1);
            char second=s.charAt(i-2);
            if(first>'0'){
                dp[i]+=dp[i-1];
            }
            if(second=='1'||(second=='2' && first<='6')){
                dp[i]+=dp[i-2];
            }
        }
        return dp[n];
    }
}
