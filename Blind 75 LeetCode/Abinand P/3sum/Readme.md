# Three Sum

## Class: Solution

This class contains a method to find all unique triplets in the array which gives the sum of zero.

### Method: `threeSum`

Finds all unique triplets in the array that sum up to zero.

#### Parameters

- `nums`: A vector of integers representing the input array.

#### Returns

A vector of vectors of integers representing the unique triplets that sum up to zero.

### Approach

The `threeSum` method finds all unique triplets in the array that sum up to zero using the two-pointer technique.

1. **Sorting:**
   - Sort the input array `nums` in non-decreasing order.

2. **Triplets Generation:**
   - Iterate through each element `nums[i]` in the array up to the second-to-last element:
      - Initialize two pointers `j` and `k`, where `j` is set to `i + 1` and `k` is set to `n - 1`, where `n` is the size of the array.
      - If `i` is not the first element and `nums[i]` is equal to the previous element `nums[i - 1]`, skip to the next iteration to avoid duplicates.
      - While `j` is less than `k`:
         - Calculate the sum `sum` as `nums[i] + nums[j] + nums[k]`.
         - If `sum` is greater than zero, decrement `k`.
         - If `sum` is less than zero, increment `j`.
         - If `sum` equals zero:
            - Add the triplet `[nums[i], nums[j], nums[k]]` to the result vector `ans`.
            - Increment `j` and decrement `k`.
            - Skip duplicate elements by incrementing `j` while `nums[j]` is equal to `nums[j - 1]`, and decrementing `k` while `nums[k]` is equal to `nums[k + 1]`.

3. **Result:**
   - Return the result vector `ans`, which contains all unique triplets that sum up to zero.

The approach efficiently finds all unique triplets in the array that sum up to zero by using the two-pointer technique to explore all possible combinations.
