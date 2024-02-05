class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res;
        unordered_map<int, int> m;
        
        for(int i = 0; i < nums.size(); i++) {
            int toFind = target - nums[i];
            if(m.count(toFind) && m[toFind] != i) {
                res.push_back(i);
                res.push_back(m[toFind]);
                return res;
            }
            m[nums[i]] = i;
        }
        
        return res;
            
    }
};