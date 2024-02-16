class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int max = Integer.MIN_VALUE;
        int suffix = 1;
        int prefix = 1;
        for(int i = 0;i<n;i++){
            if(suffix==0){
                suffix = 1;
            }
            if(prefix==0){
                prefix = 1;
            }
            suffix *= nums[n-i-1];
            prefix *= nums[i];
            max = Math.max(max,Math.max(suffix,prefix));
        }
        return max;
    }
}