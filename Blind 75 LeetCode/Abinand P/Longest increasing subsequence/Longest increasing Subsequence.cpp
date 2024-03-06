class Solution {
public:
    int lengthOfLIS(vector<int>& nums) {
       vector<int> tails(nums.size(),0);
       int size =0;
       for(int x : nums){
           int i =0,j=size;
           while(i!=j){
               int m =(i+j)/2;
               if(tails[m]<x) i=m+1;
               else j=m;
           }
           tails[i]=x;
           if( i == size) ++size;
       }
       return size;
    }
};
