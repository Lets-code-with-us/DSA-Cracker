class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int,int>mpp;
        int n=nums.size();
        for(int i=0;i<n;i++){
            int complement=target-nums[i];
            //checking if complement present in hashmap
            if(mpp.find(complement) != mpp.end()){
                return{mpp[complement],i};
            }
            //if complement not found then adding the current element and its index to the hashmap
            mpp[nums[i]] = i;
        }
        // If no solution is found
        return {};
    }
};
