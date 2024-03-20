## Erase Overlap Intervals

### Method Signature
- **Method Name:** `eraseOverlapIntervals`
- **Parameters:** `int[][] intervals`
- **Return Type:** `int`

### Code Explanation
1. **Boundary Check:** If the length of the `intervals` array is less than or equal to 1, return 0, indicating that there are no intervals to remove.
2. **Sort Intervals:** Sort the `intervals` array based on the starting points of each interval.
3. **Iterate Through Intervals:**
   - Initialize `end` with the end point of the first interval.
   - Initialize `removals` counter to keep track of the number of intervals to be removed.
   - Iterate through the sorted intervals starting from the second interval.
4. **Check Overlapping Intervals:**
   - If the start of the current interval is less than the `end`, there is an overlap.
     - Increment the `removals` counter.
     - Update `end` to be the minimum of the current interval's end point and the current `end`.
   - If there is no overlap, update `end` to be the end point of the current interval.
5. **Return Removals:** Return the total number of removals needed to erase overlapping intervals.

### Complexity Analysis
- **Time Complexity:** O(n log n), where n is the number of intervals. This is due to the sorting of intervals.
- **Space Complexity:** O(1), as the space usage is independent of the input size.
