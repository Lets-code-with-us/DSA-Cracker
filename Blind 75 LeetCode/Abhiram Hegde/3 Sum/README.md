# 3 Sum Problem Solution

## Approach:

- Sort the given array to easily identify duplicates and to use the two-pointer technique.
- Iterate through the array using a loop.
- For each element `nums[i]`, use two pointers (`left` and `right`) to find the remaining two elements that sum up to `-nums[i]`.
- Skip duplicates to avoid duplicate triplets.
- Add valid triplets to the result list.

## Java Code Explanation:

1. **Sort the array**: Sort the input array to easily identify duplicates and to use the two-pointer technique efficiently.

2. **Iterate through the array**:
   - Start a loop from index `i = 0` up to `nums.length - 2`.
   - Check if `i == 0` or if the current element is different from the previous one to avoid duplicate triplets.

3. **Two-pointer approach**:
   - Initialize two pointers `left = i + 1` and `right = nums.length - 1`.
   - Calculate the target sum as `-nums[i]`.

4. **Inner loop**:
   - While `left` pointer is less than `right` pointer:
     - If the sum of elements at `nums[left]` and `nums[right]` is equal to the target:
       - Add the triplet `[nums[i], nums[left], nums[right]]` to the result list.
       - Move both pointers inward.
       - Skip duplicates to avoid duplicate triplets.
     - If the sum is less than the target, move the `left` pointer to the right to increase the sum.
     - If the sum is greater than the target, move the `right` pointer to the left to decrease the sum.

5. **Return the result**: Return the list of unique triplets that sum up to zero.

## Time Complexity:
- The time complexity of this solution is O(n^2) because we have two nested loops.
- Sorting the array takes O(nlogn) time, and the two-pointer technique takes O(n) time inside the nested loops.
- Overall, the time complexity is dominated by the sorting step.
