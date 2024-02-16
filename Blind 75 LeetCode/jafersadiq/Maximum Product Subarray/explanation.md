## Maximum Product Subarray

Given an array of integers `nums`, the algorithm finds the maximum product of a contiguous subarray within the array.

### Approach

The algorithm uses two variables, `suffix` and `prefix`, to keep track of the product of elements in the suffix and prefix subarrays, respectively. It iterates through the array from left to right, updating `suffix` and `prefix` at each step. At each iteration, it calculates the maximum product of the suffix, prefix, and the previously computed maximum product.

### Variables

- `n`: Length of the input array `nums`.
- `max`: Maximum product of a contiguous subarray.
- `suffix`: Product of elements in the suffix subarray.
- `prefix`: Product of elements in the prefix subarray.

### Algorithm

1. Initialize `max` to `Integer.MIN_VALUE`, `suffix` to `1`, and `prefix` to `1`.
2. Iterate through the array `nums`:
   - Update `suffix` by multiplying it with the current element from the end of the array (`nums[n-i-1]`).
   - Update `prefix` by multiplying it with the current element (`nums[i]`).
   - Update `max` with the maximum value among `max`, `suffix`, and `prefix`.
3. Return `max`, which represents the maximum product of a contiguous subarray.

### Time Complexity

The algorithm has a time complexity of O(n), where n is the length of the input array `nums`. This is because it iterates through the array only once.
