class Solution {
public:
    bool containsDuplicate(vector<int>& nums) {
        set<int>unique;
        int n=nums.size();
        for(int i=0;i<n;i++){
            if(unique.find(nums[i]) != unique.end()){
                return true;
            }
            else{
                unique.insert(nums[i]);
            }
        }
        return false;
    }
};
