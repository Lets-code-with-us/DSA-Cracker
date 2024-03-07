## Code Explanation: `findMin` Function

**Problem:**

Find the minimum element in a rotated sorted array.

**Algorithm:**

1. **Handle Edge Cases:**

   - If the array is empty (`nums.length == 0`), return -1 (no minimum).
   - If the array has only one element (`nums.length == 1`), return the element itself (it's the only option).

2. **Binary Search Setup:**

   - Initialize `left` to 0 and `right` to the last index (`nums.length - 1`). This defines the initial search range for the minimum value.

3. **Iterative Search:**

   - While `left` is less than `right`:
     - Calculate the `midpoint` as the average of `left` and `right`, rounded down using integer division (`(left + right) / 2`).
     - Check three conditions:
       - **Minimum Found:** If `midpoint > 0` and `nums[midpoint] < nums[midpoint - 1]`, this means the minimum is at `midpoint` because it's smaller than the previous element and the array is sorted before the rotation point. Return `nums[midpoint]`.
       - **Search Right:** If `nums[left] <= nums[midpoint] && nums[midpoint] > nums[right]`, this means the minimum is likely in the right half because the left half seems sorted (uphill) and the minimum must be before the downward slope starts. So, update `left = midpoint + 1` to narrow the search to the right half.
       - **Search Left:** Otherwise, update `right = midpoint - 1` to narrow the search to the left half because the minimum might be before the current `midpoint`.

4. **Return Result:**

   - After the loop exits (when `left >= right`), `left` and `right` will point to the same element. Since the loop ensures the element at `left` is smaller than its right neighbor, return `nums[left]` as the minimum value.

**Key Points:**

- Uses binary search to efficiently find the minimum in a rotated sorted array.
- Handles edge cases (empty and single-element arrays).
- Time complexity: O(log n) due to the binary search approach.
- Space complexity: O(1) as it uses constant extra space.

**Example:**

Given `nums = [4, 5, 1, 2, 3]`, the minimum element is 1.

**Additional Notes:**

- Consider adding a visualization (e.g., diagram) to illustrate the search process.
- Mention alternative approaches (e.g., linear search) and their trade-offs.

I hope this is helpful!
