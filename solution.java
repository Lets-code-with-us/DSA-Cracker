class Solution {
    public int findMin(int[] nums) {
        int minele=nums[0];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<minele){
                minele=nums[i];
            }
        }
        return minele;
        
    }
}