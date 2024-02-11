# Maximum Product Subarray

## Class: Solution

This class contains a method to find the maximum product of a contiguous subarray within a given array of integers.

### Method: `maxProduct`

Finds the maximum product of a contiguous subarray within the given array of integers.

#### Parameters

- `nums`: A vector of integers representing the input array.

#### Returns

An integer representing the maximum product of a contiguous subarray.

### Approach

The `maxProduct` method iterates through the input array to find the maximum product of contiguous subarrays.

1. **Initialization:**
   - Initialize variables `maxi` and `prod` to store the maximum product and the current product of contiguous subarrays respectively. Initialize `maxi` with the minimum integer value.

2. **Forward Pass:**
   - Iterate through the input array `nums` from left to right.
   - For each element `nums[i]`:
      - Update the current product `prod` by multiplying it with `nums[i]`.
      - Update the maximum product `maxi` by taking the maximum of the current product and `maxi`.
      - If the current product becomes zero, reset it to 1 as zero product will not contribute to the maximum product of contiguous subarrays.

3. **Backward Pass:**
   - Reset the current product `prod` to 1.
   - Iterate through the input array `nums` from right to left.
   - For each element `nums[i]`:
      - Update the current product `prod` by multiplying it with `nums[i]`.
      - Update the maximum product `maxi` by taking the maximum of the current product and `maxi`.
      - If the current product becomes zero, reset it to 1 as zero product will not contribute to the maximum product of contiguous subarrays.

4. **Result:**
   - Return `maxi`, which represents the maximum product of a contiguous subarray.

The approach efficiently computes the maximum product of contiguous subarrays by iterating through the input array from left to right and from right to left, maintaining the current product and updating the maximum product accordingly.
