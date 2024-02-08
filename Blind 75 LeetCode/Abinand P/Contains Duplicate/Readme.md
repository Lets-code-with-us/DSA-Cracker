# Duplicate Elements Check

## Class: Solution

This class contains a method to check if a given vector contains any duplicate elements.

### Method: `containsDuplicate`

Checks if the given vector contains any duplicate elements.

#### Parameters

- `nums`: A vector of integers.

#### Returns

A boolean value:
- `true` if the vector contains duplicate elements.
- `false` otherwise.

### Approach

The `containsDuplicate` method utilizes an unordered map to efficiently check for duplicate elements in the vector.

1. **Initialization:**
   - Initialize an unordered map (`mp`) to store the frequency of each element in the vector.

2. **Iteration Through Elements:**
   - Iterate through each element (`x`) in the vector `nums`.
   - Increment the frequency count of `x` in the map `mp`.

3. **Duplicate Check:**
   - During each iteration, check if the frequency count of the current element `x` in the map `mp` is greater than 1.
   - If the count is greater than 1, return `true` indicating the presence of duplicates.

4. **Result:**
   - After iterating through all elements, return `false`, indicating no duplicates were found.

The approach efficiently checks for duplicate elements by using an unordered map to store the frequency of each element. If any element's frequency count exceeds 1 during the iteration, it returns `true`, indicating the presence of duplicates; otherwise, it returns `false`.
