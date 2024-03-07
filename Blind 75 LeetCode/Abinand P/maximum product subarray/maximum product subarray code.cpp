class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int maxi =INT_MIN;
        int prod =1;
        for(int i=0;i<nums.size();i++){
            prod *= nums[i];
            maxi = max(prod,maxi);
            if(prod == 0){
                prod =1 ;
            }
        }
        prod = 1;
        for(int i=nums.size()-1;i>=0;i--){
            prod *=nums[i];
            maxi = max( prod,maxi);
            if(prod ==0 ) prod = 1;
        } 
        return maxi;
    }
};
