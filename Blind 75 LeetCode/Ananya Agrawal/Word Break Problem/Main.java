class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        var dp=new boolean[s.length()+1];
        dp[s.length()]=true;
        var dictionary=new HashSet<>(wordDict);

        for(int i=s.length()-1;i>=0;i--){
            for(int j=i+1;j<=s.length();j++){
                if(dp[j] && dictionary.contains(s.substring(i,j))){
                    dp[i]=true;
                    break;
                }
            }
        }
        return dp[0];
    }
}
