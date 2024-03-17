# Missing Number in Sorted Array

## Class: Solution

This class contains a method `missingNumber()` to find the missing number in a sorted array of integers.

### Method: `missingNumber`

Finds the missing number in a sorted array of integers.

#### Parameters

- `nums`: A sorted vector of integers.

#### Returns

An integer representing the missing number in the array.

### Approach

The `missingNumber()` method sorts the input array and then iterates through it to find the missing number.

1. **Array Sorting:**
   - Sort the input array `nums` in ascending order using the `sort()` function.

2. **Iterative Search:**
   - Iterate through the sorted array `nums`:
     - Compare the index `i` with the value at index `i` in the array.
     - If they are not equal, return `i`, which represents the missing number.
   
3. **Return Result:**
   - If no missing number is found during the iteration, return `i`, which is the size of the array, indicating that the missing number is at the end of the array.

The approach efficiently finds the missing number in a sorted array by iterating through the array once after sorting it.
