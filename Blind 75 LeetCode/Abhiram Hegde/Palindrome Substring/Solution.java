class Solution{
    public int countSubstrings(String s){
        int n=s.length();
        int count=0;
        boolean[][] dp=new boolean[n][n];
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            count++;
        }
        for(int i=0;i<n-1;i++){
            if(s.charAt(i)==s.charAt(i+1)){
                dp[i][i+1]=true;
                count++;
            }
        }
        for(int k=2;k<n;k++){
            for(int i=0;i<n-k;i++){
                int j=i+k;
                if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]){
                    dp[i][j]=true;
                    count++;
                }
            }
        }
        return count;
    }
}
