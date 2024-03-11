# Find Minimum in Rotated Sorted Array

## Class: Solution

This class contains a method to find the minimum element in a rotated sorted array.

### Method: `findMin`

Finds the minimum element in the rotated sorted array using binary search.

#### Parameters

- `nums`: A vector of integers representing the rotated sorted array.

#### Returns

An integer representing the minimum element in the rotated sorted array.

### Approach

The `findMin` method utilizes binary search to find the minimum element in the rotated sorted array efficiently.

1. **Initialization:**
   - Initialize variables `low` and `high` to represent the range of indices in the array.
   - Initialize a variable `ans` to store the minimum element, initially set to the maximum integer value `INT_MAX`.

2. **Binary Search:**
   - While the range represented by `low` and `high` is valid (`low <= high`):
      - Calculate the middle index `mid` as `(low + high) / 2`.
      - Check if the element at index `low` is less than or equal to the element at index `high`.
         - If true, the array is not rotated, so return the minimum element between the element at index `low` and the current value of `ans`.
      - Otherwise, check if the element at index `low` is less than or equal to the element at index `mid`.
         - If true, update `ans` with the minimum value between the element at index `low` and the current value of `ans`, and update `low` to `mid + 1`.
         - If false, update `ans` with the minimum value between the element at index `mid` and the current value of `ans`, and update `high` to `mid - 1`.

3. **Result:**
   - After the binary search completes, return the value of `ans`, which represents the minimum element in the rotated sorted array.

The approach efficiently finds the minimum element in the rotated sorted array by using binary search to narrow down the search range based on the rotation point.
