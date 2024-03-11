# Code Explanation: Non-overlapping Intervals - Python Solution

## Explanation:

- Sort the intervals based on their end points in ascending order.
- Initialize a variable remove to keep track of the number of intervals to be removed and end to keep track of the end point of the last non-overlapping interval.
- Iterate through each interval.
- If the start point of the current interval is greater than or equal to the end point of the last non-overlapping interval, update end to the end point of the current interval.
- If the start point of the current interval is less than the end point of the last non-overlapping interval, increment remove.
- Return the value of remove, which represents the minimum number of intervals to be removed.

## Complexity:
- Time Complexity: O(nlogn)
- Space Complexity: O(n)