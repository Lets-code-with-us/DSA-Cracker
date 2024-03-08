class Solution {
public:
    int longestConsecutive(vector<int>& nums) {
        if (nums.empty()) return 0;
        
        unordered_set<int> numsSet(nums.begin(), nums.end()); 
        
        int maxSeq = 0;
        for (int num : numsSet) {
            if (!numsSet.count(num - 1)) {
                int currentNum = num;
                int lengthSeq = 1;
                while (numsSet.count(currentNum + 1)) {
                    currentNum++;
                    lengthSeq++;
                }
                maxSeq = max(maxSeq, lengthSeq);
            }
        }
        return maxSeq;
    }
};
