class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length<=1){
            return 0;
        }
        Arrays.sort(intervals,Comparator.comparingInt(interval->interval[0]));
        int end=intervals[0][1];
        int removals=0;
        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                removals++;
                end=Math.min(intervals[i][1],end);
            }
            else{
                end=intervals[i][1];
            }
        }
        return removals;
    }
}
