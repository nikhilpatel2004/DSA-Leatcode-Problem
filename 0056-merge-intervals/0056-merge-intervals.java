class Solution {
    public int[][] merge(int[][] intervals) {
        if(intervals.length <=1) return intervals;

       
                Arrays.sort(intervals, Comparator.comparingInt(i -> i[0]));

        List<int []> res = new ArrayList<>();

        int [] newIntervals = intervals[0];
        res.add(newIntervals);


        for(int [] interval :intervals){
            if(interval[0] <= newIntervals[1]){
                newIntervals[1]= Math.max(newIntervals[1] , interval[1]);
            }else{
                newIntervals= interval;
                res.add(newIntervals);
            }
        }
        return res.toArray(new int[res.size()][]);

        }
    
}