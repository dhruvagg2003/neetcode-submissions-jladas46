class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        int n=intervals.length;
        if(n==0 || n==1) return 0;
        int count=0;
        int ps=intervals[0][0];
        int pe=intervals[0][1];
        // int cs=intervals[1][0];
        // int ce=intervals[1][1];
        for(int i=1;i<n;i++){
            int cs=intervals[i][0];
            int ce=intervals[i][1];
            if(cs<pe){
                pe=Math.min(pe,ce);
                count++;
            }else{
                pe=Math.max(pe,ce);
            }
        }
        return count;
    }
    // private boolean overlapping(int[] int1,int[] int2){
    //     if(int2[0]<int1[1]) return false;
    //     return true;
    // }
        
}
