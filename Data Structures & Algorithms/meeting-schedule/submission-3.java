/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        if(intervals.size()==0 || intervals.size()==1) return true;
        Collections.sort(intervals,(a,b)->(Integer.compare(a.start,b.start)));
        int prev_start=intervals.get(0).start;
        int prev_end=intervals.get(0).end;
        for(int i=1;i<intervals.size();i++){
            int curr_start=intervals.get(i).start;
            int curr_end=intervals.get(i).end;
            if(prev_end>curr_start){
                return false;
            }else{
                prev_start=Math.max(prev_start,curr_start);
                prev_end=Math.max(prev_end,curr_end);
            }
        }
        return true;
    }
}
