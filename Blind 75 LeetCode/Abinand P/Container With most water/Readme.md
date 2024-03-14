# Container With Most Water

## Class: Solution

This class contains a method to find the maximum area of water that can be trapped between vertical lines represented by an array.

### Method: `maxArea`

Finds the maximum area of water that can be trapped between vertical lines represented by an array.

#### Parameters

- `height`: A vector of integers representing the heights of the vertical lines.

#### Returns

An integer representing the maximum area of water that can be trapped between the vertical lines.

### Approach

The `maxArea` method finds the maximum area of water that can be trapped between vertical lines using the two-pointer technique.

1. **Initialization:**
   - Initialize two pointers `start` and `end` at the beginning and end of the array respectively.
   - Initialize a variable `maxArea` to store the maximum area, initially set to 0.

2. **Main Loop:**
   - While the `start` pointer is less than the `end` pointer:
      - Calculate the current area using the formula: `min(height[start], height[end]) * (end - start)`.
      - Update `maxArea` with the maximum value between `maxArea` and the current area.
      - Move the pointer with the smaller height towards the other pointer:
         - If `height[start]` is less than `height[end]`, increment `start`.
         - Otherwise, decrement `end`.

3. **Result:**
   - After the loop completes, return the `maxArea`, which represents the maximum area of water that can be trapped between the vertical lines.

The approach efficiently finds the maximum area of water that can be trapped between vertical lines by using the two-pointer technique to explore all possible combinations.
