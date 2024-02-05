#include<vector>
#include<iostream>
using namespace std;

class Solution {
public:
    int maxProfit(vector<int>& p) {
        int minPrice = INT_MAX;
        int profit =0;
        for(int i=0; i<p.size(); i++)
        {
            minPrice = min(p[i], minPrice);
            profit = max(profit, p[i]-minPrice);
        }
        return profit;
    }
};