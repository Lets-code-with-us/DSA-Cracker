class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] output = new int[n];
        int left = 1;
        for(int i = 0;i<n;i++){
            output[i] = left;
            left *= nums[i];
            
        }
        int right = 1;
        for(int j=n-1;j>=0;j--){
            output[j] *= right;
            right *= nums[j];
            
        }

        return output;
    }
}