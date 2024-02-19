
### Explanation:

- `left` and `right` are initialized to the start and end indices of the array `nums`.
- Binary search is performed using a `while` loop until `left` is less than `right`.
  - In each iteration, the middle index `mid` is calculated.
  - If `nums[mid]` is less than `nums[right]`, it implies that the minimum element is in the left half or at `mid`. So, `right` is updated to `mid`.
  - Otherwise, the minimum element is in the right half (from `mid + 1` to `right`), so `left` is updated to `mid + 1`.
- When the loop terminates, `left` points to the minimum element, and `nums[left]` is returned.
- This algorithm has a time complexity of O(log n) because it halves the search space in each iteration of the while loop.
