class Solution {
public:
    bool canJump(vector<int>& nums) {
        int check=0;
        for(int i=0;i<nums.size();i++){
            if(check<0) return false;
            else if (nums[i]>check) check = nums[i];
            check--;
        }
        return true;
    }
};
