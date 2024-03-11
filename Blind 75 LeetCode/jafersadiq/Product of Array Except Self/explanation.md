# Product Except Self

## Introduction

The given algorithm calculates the product of an array except for the element at each index efficiently. It utilizes a two-pass approach to calculate the left and right products for each element separately.

## Approach

1. **Left Product Pass:**
   - Initialize the `output` array to store the final result.
   - Use a variable `left` to keep track of the product of elements to the left of the current index.
   - Iterate through the array from left to right.
   - At each index `i`, store the product of elements to the left in the `output` array and update `left`.

2. **Right Product Pass:**
   - Use a variable `right` to keep track of the product of elements to the right of the current index.
   - Iterate through the array from right to left.
   - At each index `j`, update the `output` array by multiplying the stored left product with the product of elements to the right and update `right`.

3. **Result:**
   - The `output` array now contains the product of all elements except for the element at each index.

## Time Complexity

The algorithm has a time complexity of O(n), where n is the length of the input array. It achieves this efficiency by using two passes to calculate left and right products separately.

## Space Complexity

The space complexity is O(n), where n is the length of the input array. This is because the algorithm uses an additional array (`output`) to store the final result.

## Usage

This algorithm is useful when there is a need to efficiently calculate the product of an array except for the element at each index. It provides a space-efficient solution with linear time complexity.
