### Explanation

#### Main Method (`maximalRectangle`)

1. **Initialization**: Initialize variables for rows, cols, heights array, and maxArea.
2. **Iterate Through Rows**: Iterate through each row of the matrix.
   - Update the `heights` array for each column based on consecutive '1's encountered.
   - Calculate the largest rectangle in histogram for the current row and update `maxArea`.
3. **Return Result**: Return the `maxArea`.

#### Helper Method (`largestRectangleArea`)

1. **Initialization**: Initialize variables for `left` and `right` arrays, and a stack.
2. **Calculate Nearest Smaller Element on Left**: Iterate through each bar and calculate the nearest smaller element on the left using a stack.
3. **Calculate Nearest Smaller Element on Right**: Iterate through each bar and calculate the nearest smaller element on the right using a stack.
4. **Calculate Area for Each Bar**: Iterate through each bar, calculate the area, and update `maxArea`.
5. **Return Result**: Return `maxArea`.

### Time Complexity

- The `maximalRectangle` method iterates through each cell of the matrix once, resulting in O(rows * cols) time complexity.
- The `largestRectangleArea` method has O(cols) time complexity as it iterates through the heights array twice and performs stack operations, which are constant-time operations.
- Overall, the time complexity of the solution is O(rows * cols).

### Space Complexity

- The space complexity is O(cols) for the `heights`, `left`, and `right` arrays, as they store information about each column.
- Additionally, the stack used in the `largestRectangleArea` method can occupy up to O(cols) space in the worst case.
- Therefore, the overall space complexity of the solution is O(cols).
