### Explanation of Binary Search Algorithm for Rotated Sorted Array

1. **Initialization**:
   - Initialize two pointers, `left` and `right`, to the start and end of the array, respectively.
   
2. **Binary Search**:
   - Use a while loop to perform binary search.
   - At each step, calculate the `mid` index using the formula: `mid = left + (right - left) / 2`.

3. **Check if Target Found**:
   - If the element at `mid` is equal to the target, return the `mid` index.

4. **Check if Left or Right Half is Sorted**:
   - If the left half is sorted:
     - Check if the target is within the range of the left half.
     - If yes, update `right` to `mid - 1`.
     - Otherwise, update `left` to `mid + 1`.
   - If the right half is sorted:
     - Check if the target is within the range of the right half.
     - If yes, update `left` to `mid + 1`.
     - Otherwise, update `right` to `mid - 1`.

5. **Repeat Until Target Found**:
   - Repeat the process until `left` is greater than `right`, indicating that the target is not found.

6. **Return -1 if Target Not Found**:
   - If the loop exits without finding the target, return -1 to indicate that the target is not present in the array.

### Time Complexity
- The time complexity of this algorithm is O(log n) because at each step, the search space is divided by 2.
