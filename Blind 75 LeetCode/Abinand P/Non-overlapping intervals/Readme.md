## Class: Solution

This class contains a method `eraseOverlapIntervals()` to determine the minimum number of intervals to remove to make the remaining intervals non-overlapping.

### Method: `eraseOverlapIntervals`

Determines the minimum number of intervals to remove to make the remaining intervals non-overlapping.

#### Parameters

- `arr`: A vector of vectors of integers representing the intervals. Each interval is represented by a vector `[start, end]`, where `start` is the start point of the interval and `end` is the end point of the interval.

#### Returns

An integer representing the minimum number of intervals to remove to make the remaining intervals non-overlapping.

#### Approach

1. **Sort Intervals by End Points:**
   - Sort the intervals in ascending order based on their end points.

2. **Initialize Variables:**
   - Initialize `ans` to 1 to account for the first interval.
   - Initialize `range` to the end point of the first interval.

3. **Traverse Intervals:**
   - Iterate through the sorted intervals starting from the second interval.
   - If the start point of the current interval is greater than or equal to the `range`:
     - Update `range` to the end point of the current interval.
     - Increment `ans`.

4. **Return Result:**
   - Return the difference between the total number of intervals and `ans`.

### Time Complexity
- The time complexity of this method is \(O(n \log n)\), where \(n\) is the number of intervals in the input array `arr`. The sorting step dominates the time complexity.

### Space Complexity
- The space complexity of this method is \(O(1)\), as it uses only a constant amount of extra space.
