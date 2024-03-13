# Code Explanation: Find MInimum in Rotated Sorted Array- java Solution

## Explanation:


Intuition

The problem asks to find the minimum element in a rotated sorted array. The idea is to use binary search to efficiently find the minimum element. The key observation is that the minimum element will always be on the side where the rotation occurred. By comparing the middle element with the end element, we can determine which side to search.

Approach

The approach is to use binary search to iteratively narrow down the search space. We maintain two pointers, start and end, representing the current search range. In each iteration, we calculate the middle index (mid) and compare the value at mid with the value at end.

If nums[mid] > nums[end], it means the minimum element is on the right side of mid, so we update start = mid + 1.

If nums[mid] <= nums[end], it means the minimum element is on the left side of mid or could be mid itself, so we update end = mid.

We continue this process until start is equal to end, and at that point, we have found the minimum element.

Complexity

Time complexity: O(log⁡n)O(\log n)O(logn) - Binary search is used, which halves the search space in each iteration.

Space complexity: O(1)O(1)O(1) - Constant space is used as we only have a few variables.
