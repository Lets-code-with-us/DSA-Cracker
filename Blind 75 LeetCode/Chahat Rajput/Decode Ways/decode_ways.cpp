class Solution {
public:
    int dp[101];
    int solve(int i,string s,int n){
        if(dp[i] != -1){return dp[i];}
        
        if(i == n){
            return dp[i]=1;
        }

        if(s[i] == '0'){return dp[i]=0;}

        int ith_char=solve(i+1,s,n);

        if(i+1 < n){
            if(s[i] == '1' ||(s[i] == '2' && s[i+1] <='6')){
                ith_char+=solve(i+2,s,n);
            }
        }
        return  dp[i]=ith_char;
    }
    int numDecodings(string s) {
        int n=s.length();
        memset(dp,-1,sizeof(dp));
        return solve(0,s,n);
    }
};