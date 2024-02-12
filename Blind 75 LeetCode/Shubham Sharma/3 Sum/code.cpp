class Solution {
public:
    vector<vector<int>> ans;
    void twosum(vector<int>& nums, int target, int i, int j){

        while(i<j){

            if(nums[i]+nums[j] > target) j--;
            else if(nums[i]+nums[j] < target) i++;

            else{                 
                ans.push_back({-target, nums[i], nums[j]});
                while(i<j && nums[i] == nums[i+1]) i++;
                while(i<j && nums[j] == nums[j-1]) j--;

                i++;
                j--;
            }
        }

    }

    vector<vector<int>> threeSum(vector<int>& nums) {
        
        if(nums.size() < 3) return {};
        sort(nums.begin(), nums.end());
        int n=nums.size()-1;

        for(int i=0; i < n; i++){

            if(i>0 && nums[i]==nums[i-1]) continue;

            int target = -nums[i];

            twosum(nums, target, i+1, n);
        }
        return ans;
    }
};