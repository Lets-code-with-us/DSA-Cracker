class Solution {
    public int findMin(int[] nums) {
        // ***COMPLEXITY IS O(n)***

        // int min=nums[0];
        // for(int i=0; i<nums.length; i++) {
        // if(nums[i]<min) {
        // min = nums[i];
        // break;
        // }
        // }
        // return min ;
        // }

        // ***COMPLEXITY IS O(logn)***

        int left = 0, right = nums.length - 1;

        // Binary search
        while (left < right) {
            int mid = left + (right - left) / 2;

            // Check if mid element is greater than the last element
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            }
            // Check if mid element is smaller than the last element
            else if (nums[mid] < nums[right]) {
                right = mid;
            }
            // If mid element is same as the last element, move the right pointer to the
            // left
            else {
                right--;
            }
        }

        // At this point, left and right pointers will be converged to the minimum
        // element
        return nums[left];
    }
}