class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Approach 2 : 
        int n = nums.length;
        // result array to store the result
        int[] res = new int[n];
        // initialize the first index to be 1
        res[0] = 1;
        // loop to the nums array and calculate the left product
        for (int i = 1; i < n; i++) {
            res[i] = res[i - 1] * nums[i - 1];
        }
        int right = 1;
        // loop to nums array and calculate the right product
        for (int i = n - 1; i >= 0; i--) {
            res[i] *= right;
            right *= nums[i];
        }
        return res;
	}
}