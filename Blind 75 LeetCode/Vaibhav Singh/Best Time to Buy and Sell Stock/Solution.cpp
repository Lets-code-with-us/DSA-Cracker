class Solution {
public:
    int maxProfit(vector<int>& p) {
        int n= p.size();
        int ltn=p[0], mxdif=0;
        for(int i=1;i<n;i++)
        {
            if(p[i] < ltn)
                ltn= p[i];
            else
            {
                int dif= p[i]-ltn;
                mxdif= max(mxdif, dif);
            }
        }
        return mxdif;
    }
};
