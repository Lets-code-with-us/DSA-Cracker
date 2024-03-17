# Product of Array Except Self

## Class: Solution

This class contains a method to compute the product of every element in an array except for the current element.

### Method: `productExceptSelf`

Computes the product of every element in an array except for the current element.

#### Parameters

- `nums`: A vector of integers.

#### Returns

A vector of integers representing the product of every element in the array except for the current element.

### Approach

The `productExceptSelf` method computes the product of every element in the input array except for the current element using three passes through the array.

1. **Left Array Initialization:**
   - Initialize an empty vector `left` of the same size as the input vector `nums`.
   - Set the first element of the `left` array to 1.
   - Iterate from the second element to the last element of the input vector `nums`.
      - Calculate the product of all elements to the left of the current element and store it in the `left` array.

2. **Right Array Initialization:**
   - Initialize an empty vector `right` of the same size as the input vector `nums`.
   - Set the last element of the `right` array to 1.
   - Iterate from the second last element to the first element of the input vector `nums`.
      - Calculate the product of all elements to the right of the current element and store it in the `right` array.

3. **Calculate Result:**
   - Initialize an empty vector `result` of the same size as the input vector `nums`.
   - Iterate through each element of the input vector `nums`.
      - Calculate the product of the corresponding elements from the `left` and `right` arrays and store it in the `result` array.

4. **Result:**
   - Return the `result` vector, which represents the product of every element in the array except for the current element.

The approach efficiently computes the product of every element in the array except for the current element using three passes through the array, avoiding division operations to handle zero elements in the input array.
