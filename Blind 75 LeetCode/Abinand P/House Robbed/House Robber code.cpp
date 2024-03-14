class Solution {
public:
    int rob(vector<int>& nums) {
        int rob = 0;
        int norob = 0;
        for(int i =0;i<nums.size();i++){
            int nr = norob+nums[i];
            int nrob = max(norob,rob);
            rob = nr;
            norob = nrob;
        }
        return max(rob,norob);
        
    }
};
