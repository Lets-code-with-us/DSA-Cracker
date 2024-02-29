class Solution {
public:
    int rob(vector<int>& nums) {
        int n= nums.size();
        int includ1=0;
        int exclud1=0;
        int includ2=0;
        int exclud2=0;
        if(n==1) return nums[0];
        for(int i=0;i<n-1;i++){
            int x = exclud1 + nums[i];
            exclud1 = max(exclud1,includ1);
            includ1=x;
            int x2 = exclud2 + nums[i+1];
            exclud2 = max(exclud2,includ2);
            includ2 = x2;
        }   
       return max(max(includ1,includ2),max(exclud1,exclud2));
    }
};
