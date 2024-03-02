# Two Sum Problem - Approach

## Approach Overview

This solution employs a HashMap to efficiently find a pair of elements in an array that sum up to a target value. The approach involves a single pass through the array, utilizing the HashMap for constant-time lookups.

## Detailed Steps

1. **HashMap for Efficient Lookup:**
   - Use a `HashMap<Integer, Integer>` to store the elements from the array along with their indices.
   - This allows for constant-time lookup to check if a complement exists in the array.

2. **Iterate Through the Array:**
   - Traverse through the given array, considering each element as a potential part of the solution.

3. **Calculate Complement:**
   - For each element, calculate the complement by subtracting it from the target.

4. **Check for Complement in HashMap:**
   - Check if the complement exists in the HashMap.
   - If found, it means there is a pair of elements whose sum is equal to the target.

5. **Return the Result:**
   - If a pair is found, return an array containing the indices of the two numbers.
   - If no solution is found after iterating through the entire array, return an empty array.

## Complexity Analysis

- **Time Complexity:**
   - O(n) - The algorithm iterates through the array once.

- **Space Complexity:**
   - O(n) - In the worst case, the HashMap stores all elements of the array.

