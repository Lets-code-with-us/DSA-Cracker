class Solution {
public:
    vector<int> countBits(int n) {
        vector<int>v(n+1);
        v[0]=0;
        for(int i=1;i<=n;i++)
            v[i]=v[i/2]+i%2;
        return v;   
    }
};