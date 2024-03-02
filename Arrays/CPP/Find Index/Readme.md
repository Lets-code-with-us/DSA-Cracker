# Find Index of Element

## Class: Solution

This class contains a method to find the indices of a given key in an array.

### Method: `findIndex`

Finds the indices of a given key in an array.

#### Parameters

- `a[]`: An array of integers.
- `n`: An integer representing the number of elements in the array.
- `key`: An integer representing the target key to find.

#### Returns

A vector of integers containing the indices of the target key:
- If the key is found once, both indices will be the same.
- If the key is found multiple times, the first index will be the position of the first occurrence, and the second index will be the position of the last occurrence.
- If the key is not found, both indices will be -1.

### Approach

The `findIndex` method iterates through the array to find the indices of the target key.

1. **Initialization:**
   - Initialize a vector `vect` of size 2 with initial values of 0.
   - Set both elements of `vect` to -1 to indicate that the key has not been found yet.

2. **Iteration:**
   - Iterate through each element of the array from index 0 to `n-1`.
   - If the current element equals the target key:
      - If the first index in `vect` is still -1, set it to the current index.
      - If the first index in `vect` has already been set, update the second index in `vect` to the current index.

3. **Handling Missing Second Index:**
   - If the second index in `vect` is still -1 after iteration, set it to the first index to indicate that only one occurrence of the key has been found.

4. **Result:**
   - Return the `vect` vector, which contains the indices of the target key.

The approach efficiently finds the indices of the target key in the array by iterating through the array and updating the indices in a vector. It handles cases where the key is found once, multiple times, or not found at all.
