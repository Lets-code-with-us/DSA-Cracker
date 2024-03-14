## Class: Solution

This class contains a method `insert()` to insert a new interval into a list of non-overlapping intervals.

### Method: `insert`

Inserts a new interval into a list of non-overlapping intervals.

#### Parameters

- `intervals`: A vector of vectors representing non-overlapping intervals, where each inner vector contains two integers representing the start and end of an interval.
- `newInterval`: A vector representing the new interval to be inserted, where the first integer represents the start and the second integer represents the end of the interval.

#### Returns

A vector of vectors representing the updated list of non-overlapping intervals after inserting the new interval.

#### Helper Functions

1. **`mergeInter`**:
   - Merges two intervals represented by `i1` and `i2` and returns the merged interval.

2. **`intervalIsLess`**:
   - Checks if interval `i2` is less than interval `i1`, i.e., the end of `i2` is less than the start of `i1`.

3. **`intervalIsLarger`**:
   - Checks if interval `i2` is larger than interval `i1`, i.e., the start of `i2` is greater than the end of `i1`.

#### Approach

1. **Initialize Result Vector and Merge Flag:**
   - Initialize an empty result vector.
   - Initialize a boolean variable `merged` to track whether the new interval has been merged with existing intervals.

2. **Edge Case Handling:**
   - If the `intervals` vector is empty, add the `newInterval` to the result and return.
   
3. **Iterate Over Intervals:**
   - Iterate through each interval in the `intervals` vector.
   
4. **Insert New Interval:**
   - If the current interval is less than the `newInterval`, add it to the result.
   - If the current interval is larger than the `newInterval`, add it to the result.
   - If there is an overlap between the current interval and the `newInterval`, merge them using the `mergeInter` function.

5. **Finalize Insertion:**
   - If the `newInterval` has not been merged with any existing intervals, add it to the result.

6. **Return Result:**
   - Return the updated result vector.

#### Time Complexity
- The time complexity of this method is \(O(n)\), where \(n\) is the number of intervals in the `intervals` vector.

#### Space Complexity
- The space complexity of this method is \(O(1)\), as it only requires a constant amount of extra space for storing intermediate variables.
