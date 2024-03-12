public class Solution {
    public int rob(int[] nums) {
        int n = nums.length;

        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return nums[0];
        }

        // Calculate maximum amount without robbing the first house
        int maxWithoutFirst = robLinear(nums, 1, n - 1);

        // Calculate maximum amount without robbing the last house
        int maxWithoutLast = robLinear(nums, 0, n - 2);

        // Return the maximum of the two scenarios
        return Math.max(maxWithoutFirst, maxWithoutLast);
    }

    private int robLinear(int[] nums, int start, int end) {
        int prevMax = 0;
        int currMax = 0;

        for (int i = start; i <= end; i++) {
            int temp = currMax;
            currMax = Math.max(prevMax + nums[i], currMax);
            prevMax = temp;
        }

        return currMax;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        int[] nums1 = {2, 3, 2};
        System.out.println("Maximum amount that can be robbed: " + solution.rob(nums1));

        // Example 2
        int[] nums2 = {1, 2, 3, 1};
        System.out.println("Maximum amount that can be robbed: " + solution.rob(nums2));
    }
}
