class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n=nums.size();
        vector<int>left(n,1);
        vector<int>right(n,1);

        int leftproduct=1;
        for(int i=1;i<n;i++){
            leftproduct=leftproduct*nums[i-1];
            left[i]=leftproduct;
        }

        int rightproduct=1;
        for(int i=n-2;i>=0;i--){
            rightproduct=rightproduct*nums[i+1];
            right[i]=rightproduct;
        }

        vector<int>result;
        for(int i=0;i<n;i++){
            result.push_back(left[i] * right[i]);
        }
        return result;
    }
};
