# Code Explanation: Merge Intervals - Python Solution

## Explanation:

- The function sorts the intervals based on the start time.
- It initializes an empty list merged to store the merged intervals.
- It sets the prev variable to the first interval in the sorted list.
- It iterates through the sorted intervals, checking for overlap with prev.
- If there's an overlap, it merges the intervals by updating the end time of prev.
- If there's no overlap, it appends the current prev interval to the merged list and updates prev to the current interval.
- Finally, it appends the last prev interval to the merged list.
Returns the merged list of intervals.

## Complexity:
- Time Complexity: O(nlogn)
- Space Complexity: O(n)