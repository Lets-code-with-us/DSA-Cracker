### Explanation

1. **Base Case Check:**
   - If the length of the `intervals` array is less than or equal to 1, return the `intervals` array as it is already merged.
   
2. **Sorting:**
   - Sort the `intervals` array based on the start of each interval using a custom comparator function. This ensures that intervals are sorted in ascending order of their start times.
   
3. **Merging Intervals:**
   - Initialize an `index` variable to keep track of the position where merged intervals will be stored.
   - Iterate through each interval in the sorted `intervals` array.
   - For each interval:
     - If the end of the current merged interval (indexed by `index`) is greater than or equal to the start of the current interval, it means there is overlap between these intervals. In this case:
       - Update the end of the current merged interval to be the maximum of its current end and the end of the current interval.
     - If there is no overlap:
       - Increment the `index`.
       - Store the current interval at the new index position, effectively starting a new merged interval.
       
4. **Return Merged Intervals:**
   - Return a copy of the `intervals` array containing only the merged intervals from index 0 to `index + 1`. This ensures that only the relevant merged intervals are returned.
