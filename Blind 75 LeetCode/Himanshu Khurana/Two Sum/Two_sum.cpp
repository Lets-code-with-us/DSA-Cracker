class Solution
{
public:
    vector<int> twoSum(vector<int> &nums, int target)
    {
        int l = nums.size(), sum = 0;
        vector<int> twoSum;
        for (int i = 0; i < l; i++)
            for (int j = i + 1; j < l; j++)
            {
                sum = nums[i] + nums[j];
                if (sum == target)
                {
                    twoSum.emplace_back(i);
                    twoSum.emplace_back(j);
                }
                else
                    continue;
            }
        return twoSum;
    }
};