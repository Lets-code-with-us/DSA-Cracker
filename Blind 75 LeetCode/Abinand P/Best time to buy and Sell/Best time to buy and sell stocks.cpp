class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int least =INT_MAX;
        int op =0;
        int pist =0;
        for(int i=0;i<prices.size();i++){
            if(prices[i]<least){
                least = prices[i];
            }
            pist = prices[i] -least;
            if(op < pist){
                op = pist;
            }
        }
        return op;
    }
};
