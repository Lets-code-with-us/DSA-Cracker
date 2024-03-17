package missing_number;

import java.util.*;
// import java.lang.*;

// class Solution {
//     public int missingNumber(int[] nums) {
//         int xor = 0;
//         for (int i = 0; i < nums.length; i++) {
//             xor ^= i ^ nums[i];
//         }
//         return xor ^ nums.length;
//     }
// }

// code with O(nlogn) time complexity
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == i)
                continue;
            else {
                return i;

            }
        }

        return nums[nums.length - 1] + 1;
    }
}

// code with O(n) time complexity

// class Solution {
// public int missingNumber(int[] nums) {
// int expectedSum = nums.length*(nums.length + 1)/2;
// int actualSum = 0;
// for (int num : nums) {
// actualSum += num;
// }
// return expectedSum - actualSum;
// }
// }
