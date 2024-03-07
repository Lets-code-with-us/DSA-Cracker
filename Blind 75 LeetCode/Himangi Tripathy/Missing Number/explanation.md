class Solution {
    public int missingNumber(int[] nums) {
        int ans=nums.length;//we initialized ans to length of nums array
        for(int i=0;i<nums.length;i++){//we traverse the nums array
            ans ^= i^nums[i];//we find the missing numbers and store it in array ans
        }
        return ans;//we return the ans
    }
}