class Solution {
public:
//Complexity O(n)
    vector<int> twoSum(vector<int>& nums, int target) {
        map<int, int> m;
       for(int i=0;i<nums.size();i++){
           //target ko array ke pehle element se minus kr do and vo element find kro jo target ka addition ho
           int element=target-nums[i];//9-2=7 find 7 from array
           if(m.find(element) != m.end()){
               return {m[element],i};
           }
            m[nums[i]]=i;
       }
        return{};
    }
};