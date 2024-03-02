## Explanation of maxSubArray method

1. **Initialize Variables:**
    - `maxSum`: Initialize `maxSum` variable with the value of the first element in the `nums` array.
    - `currentSum`: Initialize `currentSum` variable with the value of the first element in the `nums` array.

2. **Iterate Through Array:**
    - Start iterating from the second element of the `nums` array (index 1) since we already initialized `maxSum` and `currentSum` with the first element.
    - For each element `nums[i]` in the array:
        - Update `currentSum` to be the maximum of either:
            - The current element `nums[i]`.
            - The sum of the current element and the previous `currentSum` value (`currentSum + nums[i]`). This represents extending the previous subarray.
        - Update `maxSum` to be the maximum of either:
            - The current `maxSum` value.
            - The updated `currentSum`. This ensures that `maxSum` always holds the maximum sum encountered so far.

3. **Return Result:**
    - After iterating through the entire array, `maxSum` will hold the maximum sum of a subarray within the `nums` array.
    - Return `maxSum` as the result.

4. **Time Complexity:**
    - The algorithm iterates through the `nums` array once, resulting in a time complexity of O(n), where n is the length of the `nums` array.
