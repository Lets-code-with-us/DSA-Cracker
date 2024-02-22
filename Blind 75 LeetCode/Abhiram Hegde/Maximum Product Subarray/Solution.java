class Solution {
    public int maxProduct(int[] nums) {
        if(nums==null||nums.length==0){
            return 0;
        }
        int maxProduct=nums[0];
        int minProduct=nums[0];
        int result=nums[0];
        for(int i=1;i<nums.length;i++){
            int tempMaxProduct=Math.max(nums[i],Math.max(maxProduct*nums[i],minProduct*nums[i]));
            int tempMinProduct=Math.min(nums[i],Math.min(maxProduct*nums[i],minProduct*nums[i]));
            maxProduct=tempMaxProduct;
            minProduct=tempMinProduct;
            result=Math.max(result,maxProduct);
        }
        return result;
    }
}
