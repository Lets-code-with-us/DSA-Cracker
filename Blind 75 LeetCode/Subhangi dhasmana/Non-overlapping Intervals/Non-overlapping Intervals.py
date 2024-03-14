class Solution:
    def eraseOverlapIntervals(self, intervals: List[List[int]]) -> int:
        intervals = sorted(intervals, key = lambda x:x[1])
        remove = 0
        end = -100000
        for i in intervals:
            if i[0] >= end:
                end = i[1]
            else:
                remove += 1
        return remove