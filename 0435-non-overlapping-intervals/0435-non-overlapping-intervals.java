class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        if(intervals.length ==0) return 0;

        Arrays.sort(intervals , (a,b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int lastEnd = intervals[0][1];


        for(int i = 0;i<intervals.length;i++){
            if(intervals[i][0] >= lastEnd){
                count++;
                lastEnd  = intervals[i][1];
            }

        }
        return intervals.length-count; // retunr 1;

    }
}