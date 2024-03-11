Explanation:-Insert Intervals

**Detailed Approach**

1.Non Overlapping intervals before given newInterval -> push into the ans vector

2.Overlapping of intervals and newInterval update new interval

3.Starting point of newInterval will be min of the interval starting point
or starting point of newInterval

4.Ending point will be the max of interval ending point or newInterval end point.

5.Non overlapping intervals after the newintervals have been merged -> push ito ans vector

**Complexity**

Time complexity - O(N)
space complexity - O(1)