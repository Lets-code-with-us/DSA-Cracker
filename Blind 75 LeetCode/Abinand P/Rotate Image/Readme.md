# Problem Statement

Given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

## Intuition

Rotating a matrix by 90 degrees can be achieved by first transposing the matrix (reflecting it over its main diagonal), then reversing each row. This approach swaps the rows and columns and then reverses the order of elements in each row.

## Detailed Approach

1. **Transpose the Matrix**: Iterate through the upper triangle of the matrix (where row <= column) and swap the element at position (row, column) with the element at position (column, row). This effectively transposes the matrix.

2. **Reverse Each Row**: After transposing the matrix, iterate through each row and reverse its elements. This step completes the rotation by flipping each row horizontally.

## Complexity Analysis

- **Time Complexity**: 
  - Transposing the matrix requires O(n^2) operations.
  - Reversing each row requires O(n) operations, and there are n rows.
  - So, the total time complexity is O(n^2 + n) = O(n^2).
- **Space Complexity**: 
  - The algorithm operates in-place, so the space complexity is O(1) as it doesn't use any extra space.

