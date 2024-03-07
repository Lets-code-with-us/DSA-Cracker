# Search in Rotated Sorted Array

## Class: Solution

This class contains a method to search for a target element in a rotated sorted array.

### Method: `search`

Searches for the target element in the rotated sorted array using binary search.

#### Parameters

- `nums`: A vector of integers representing the rotated sorted array.
- `target`: An integer representing the target element to search for.

#### Returns

An integer representing the index of the target element if found, or -1 if the target element is not present in the array.

### Approach

The `search` method utilizes binary search to efficiently search for the target element in the rotated sorted array.

1. **Initialization:**
   - Initialize variables `low` and `high` to represent the range of indices in the array.

2. **Binary Search:**
   - While the range represented by `low` and `high` is valid (`low <= high`):
      - Calculate the middle index `mid` as `(low + high) / 2`.
      - If the element at index `mid` equals the target element, return `mid` as the index of the target element.
      - If the element at index `low` is less than or equal to the element at index `mid`:
         - Check if the target element lies within the range `[low, mid)` (i.e., between `low` and `mid-1`).
            - If true, update `high` to `mid-1`.
            - If false, update `low` to `mid+1`.
      - If the element at index `mid` is less than the element at index `high`:
         - Check if the target element lies within the range `(mid, high]` (i.e., between `mid+1` and `high`).
            - If true, update `low` to `mid+1`.
            - If false, update `high` to `mid-1`.

3. **Result:**
   - If the target element is not found after the binary search completes, return -1.

The approach efficiently searches for the target element in the rotated sorted array by utilizing binary search to narrow down the search range based on the rotation point.
