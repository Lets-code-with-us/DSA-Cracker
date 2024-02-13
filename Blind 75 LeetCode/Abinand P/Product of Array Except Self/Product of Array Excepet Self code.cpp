class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
       int n = nums.size();
        vector<int> left(n), right(n), result(n);
        
        // Initialize left array
        left[0] = 1;
        for (int i = 1; i < n; ++i) {
            left[i] = left[i - 1] * nums[i - 1];
        }
        
        // Initialize right array
        right[n - 1] = 1;
        for (int i = n - 2; i >= 0; --i) {
            right[i] = right[i + 1] * nums[i + 1];
        }
        
        // Calculate result
        for (int i = 0; i < n; ++i) {
            result[i] = left[i] * right[i];
        }
        
        return result;
    }
};
