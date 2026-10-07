class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int start = newInterval[0];
        int end = newInterval[1];

        boolean added = false;

        List<int []> result = new ArrayList<>();

        for(int i=0 ; i<intervals.length ; i++){
            int newStart = intervals[i][0];
            int newEnd = intervals[i][1];

            if(newEnd < start){
                result.add(intervals[i]);
            }else if(newEnd >= start && end >= newStart){
                start = Math.min(start,newStart);
                end = Math.max(end,newEnd);
            }else{

                if(!added){
                    result.add(new int[]{start,end});
                    added = true;
                }

                result.add(intervals[i]);
            }
        }

        if(!added){
            result.add(new int[]{start,end});
        }

        return result.toArray(new int[result.size()][]);
    }
}