# Two Sum

## Class: Solution

This class contains a method to find two numbers in an array that add up to a given target.

### Method: `twoSum`

Finds and returns the indices of two numbers in the input array that add up to the given target.

#### Parameters

- `nums`: A vector of integers representing the input array.
- `target`: An integer representing the target sum.

#### Returns

A vector of integers containing the indices of the two numbers that add up to the target.

## Approach

The `twoSum` method employs a hash map to efficiently find a pair of numbers in the array that add up to the target sum.

1. **Initialization:**
   - Initialize an empty vector (`result`) to store the indices of the two numbers.
   - Initialize an unordered map (`mapp`) to store the elements of the array along with their indices.

2. **Iterate Through Array:**
   - For each element in the array (`nums`):
      - Calculate the complement needed to achieve the target sum (`target - nums[i]`).
      - Check if the complement is present in the map.
         - If found, push the indices of the two numbers into the `result` vector.
         - Return the `result` vector.

3. **Update Map:**
   - If the complement is not found, add the current element and its index to the map.

4. **Result:**
   - Return the `result` vector containing the indices of the two numbers that add up to the target.

The approach efficiently utilizes a hash map to track elements and their indices, allowing for constant-time lookups. The algorithm iterates through the array, checking for the complement needed to reach the target sum. If found, it returns the indices of the two numbers; otherwise, it updates the map and continues the iteration.
