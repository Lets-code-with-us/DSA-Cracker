# Spiral Order Traversal of a Matrix

## Problem Statement:
Given a matrix of integers, return the elements of the matrix in spiral order.

## Explanation:
The problem requires traversing the matrix in a spiral order, starting from the top-left corner and moving towards the right, then down, left, and up, continuing until all elements are visited.

## Intuition:
To traverse the matrix in a spiral order, we need to keep track of four boundaries: top, bottom, left, and right. We iteratively move along these boundaries while adding elements to the result vector.

## Step-by-Step Approach:
1. Initialize four variables: `left`, `right`, `top`, and `bottom` to keep track of the boundaries.
2. Initialize an empty vector `ans` to store the result.
3. Iterate until `top` is less than or equal to `bottom` and `left` is less than or equal to `right`.
4. Traverse from left to right along the top boundary and add elements to `ans`.
5. Increment `top`.
6. Traverse from top to bottom along the right boundary and add elements to `ans`.
7. Decrement `right`.
8. Check if `top` is less than or equal to `bottom`, then traverse from right to left along the bottom boundary and add elements to `ans`.
9. Decrement `bottom`.
10. Check if `right` is greater than or equal to `left`, then traverse from bottom to top along the left boundary and add elements to `ans`.
11. Increment `left`.
12. Repeat steps 3-11 until all elements are visited.
13. Return `ans`.

## Complexity Analysis:
- Time Complexity: O(m*n), where m is the number of rows and n is the number of columns in the matrix. We visit each element once.
- Space Complexity: O(1) excluding the output vector. The output vector is O(m*n) since it stores all elements of the matrix in spiral order.
