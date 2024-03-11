class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 0) {
            return -1; // Handle empty array case
        }

        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int midpoint = left + (right - left) / 2;

            if (nums[midpoint] == target) {
                return midpoint; // Target found
            }

            // Determine if the left or right half is sorted and proceed accordingly
            if (nums[left] <= nums[midpoint]) {
                if (target >= nums[left] && target < nums[midpoint]) {
                    right = midpoint - 1; // Target lies in sorted left half
                } else {
                    left = midpoint + 1; // Target lies in unsorted right half
                }
            } else {
                if (target > nums[midpoint] && target <= nums[right]) {
                    left = midpoint + 1; // Target lies in sorted right half
                } else {
                    right = midpoint - 1; // Target lies in unsorted left half
                }
            }
        }

        return -1; // Target not found
    }
}
