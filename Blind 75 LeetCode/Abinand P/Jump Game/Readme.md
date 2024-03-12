## Class: Solution

This class contains a method `canJump()` to determine if you can reach the last index in a list by jumping from index to index based on the values in the list.

### Method: `canJump`

Determines if you can reach the last index in a list by jumping from index to index based on the values in the list.

#### Parameters

- `nums`: A vector of integers representing the maximum jump length at each position in the list.

#### Returns

- A boolean value indicating whether it is possible to reach the last index in the list.

#### Approach

1. **Initialization:**
   - Initialize a variable `check` to keep track of the furthest position you can reach.

2. **Iterate Through the List:**
   - Iterate through the elements of the `nums` vector.
   - For each index `i`, check if `check` is less than 0. If so, return false as it is not possible to reach the last index.
   - Otherwise, update `check` to be the maximum value between its current value and the maximum jump length `nums[i]`.

3. **Update `check`:**
   - After updating `check`, decrement its value by 1 to represent moving one step forward.

4. **Return Result:**
   - After iterating through the entire list, return true, indicating that it is possible to reach the last index.

#### Time Complexity
- The time complexity of this method is O(n), where n is the length of the `nums` vector. We iterate through the entire list once to determine if it is possible to reach the last index.

#### Space Complexity
- The space complexity of this method is O(1) since we use only a constant amount of extra space regardless of the size of the input list.
