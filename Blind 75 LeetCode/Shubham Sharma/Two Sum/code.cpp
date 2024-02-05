#include<vector>
#include<iostream>
#include<map>
using namespace std;


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
    
        std::map<int,int> mp;

        for(int i=0;i<nums.size();i++){

            int sum = target - nums[i];
            auto it = mp.find (sum);
            
            //if found
            if(it != mp.end ())
            {
                return {it-> second, i};
            }

            mp[nums[i]] = i;
        }
        return {};
    }
};