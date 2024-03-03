class Solution {
    public int maxProduct(int[] nums) {
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        // HERE WE HAVE USED THE KADANE'S ALGORITHM TO OPTIMISED THE CODE
        for (int i = 1; i < nums.length; ++i) {
            maxCurrent = Math.max(nums[i], maxCurrent * nums[i]);
            if (maxCurrent > maxGlobal) {
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }
}
