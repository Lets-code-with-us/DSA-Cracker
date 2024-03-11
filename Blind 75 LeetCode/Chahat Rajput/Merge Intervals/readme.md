Explanation:-Merge Intervals

**Detailed Approach**

1. First sort the array

2. If the list of merged intervals is empty or if the current then interval does not overlap with the previous, simply append it.

3. Otherwise, there is overlap, so we merge the current and previous intervals.

4. Atlast return the resultant array v

Complexity

Time:-O(m*n),where n is rows and m is column in array,to merge the intervals
Space:-O(m*n),for storing result 