class Solution {
public:
    int maxSubArray(vector<int>& nums) {
    //add elements of array in "sum" variable and store maxsum in max_sum variable and so on... the at last return max_sum
    
     int n = nums.size(), sum = 0, max_sum = nums[0];
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            max_sum = max(max_sum, sum);
            if (sum < 0) sum = 0;
        }
        return max_sum;
    }
};