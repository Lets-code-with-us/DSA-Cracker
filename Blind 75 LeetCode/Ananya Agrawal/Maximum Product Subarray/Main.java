class Solution {
    public int maxProduct(int[] nums) {
        int left=1;
        int right=1;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(left==0){
                left=1;
            }
            if(right==0){
                right=1;
            }
            left=left*nums[i];
            right=right*nums[nums.length-1-i];
            ans=Math.max(ans,Math.max(left,right));
        }
        return ans;
    }
}
        
