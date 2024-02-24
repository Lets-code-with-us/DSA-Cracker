class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = Integer.MIN_VALUE;
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            max = max + nums[i];
             max = Math.max(max,nums[i]);
             maxsum = Math.max(max,maxsum);
            
            
        }
        return maxsum;
    }
}