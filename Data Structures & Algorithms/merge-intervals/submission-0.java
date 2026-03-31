class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->(Integer.compare(a[0],b[0])));
        ArrayList<int[]> list=new ArrayList<>();
        int prev_start=intervals[0][0];
        int prev_end=intervals[0][1];
        for(int i=1;i<intervals.length;i++){
            int curr_start=intervals[i][0];
            int curr_end=intervals[i][1];
            if(prev_end>=curr_start){
                //merge
                prev_end=Math.max(prev_end,curr_end);
            }else{
                list.add(new int[]{prev_start,prev_end});
                prev_start=curr_start;
                prev_end=curr_end;
            }
        }
        list.add(new int[]{prev_start,prev_end});
        return list_to_arr(list);
    }
    private int[][] list_to_arr(ArrayList<int[]> list){
        int[][] result=new int[list.size()][2];
        for(int i=0;i<list.size();i++){
            result[i]=list.get(i);
        }
        return result;
    }
    private int[][] add_element(int[][] arr, int[] element) {
        int[][] result = new int[arr.length + 1][];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[i];
        }
        result[arr.length] = element;
        return result;
    }   
}
