class Solution {
    public boolean canJump(int[] nums) {
        int i=0;//we set i to 0
        for(int reach=0;i<nums.length && i<=reach;i++){//we traverse the array from reach =0  to nums.length and i<= reach with i++
            reach=Math.max(reach,i+nums[i]);//reach value is the maximum value of reach and i+nums[i]
        }
        return i==nums.length;//we return i which is equal to the length of the nums array
        
    }
}