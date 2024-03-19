class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length<=1){
            return intervals;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int index=0;
        for(int i=0;i<intervals.length;i++){
            if(intervals[index][1]>=intervals[i][0]){
                intervals[index][1]=Math.max(intervals[index][1],intervals[i][1]);
            }
            else{
                index++;
                intervals[index]=intervals[i];
            }
        }
        return Arrays.copyOfRange(intervals,0,index+1);
    }
}
