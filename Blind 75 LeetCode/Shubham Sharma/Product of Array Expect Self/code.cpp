#include<vector>
#include<iostream>

using namespace std;

class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int> prifixProductStart(n,0);
        vector<int> prifixProductEnd(n,0);
        vector<int> result(n,0);
        int product=1;
        for(int i=0; i<n; i++)
        {
            product*=nums[i];
            prifixProductStart[i]= product;
        }

        product=1;
        for(int i=n-1; i>=0; i--)
        {
            product*=nums[i];
            prifixProductEnd[i]=product;
        }
         
         for(int i=0; i<n; i++)
         {
             if(i==0)
             {
                 result[i] = prifixProductEnd[i+1];
             }

             else if(i==n-1)
             {
                 result[i] = prifixProductStart[i-1];
             }
             else
             {
                 result[i] = prifixProductStart[i-1]*prifixProductEnd[i+1];
             }
         }
         return result;
    }
};