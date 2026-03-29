class Solution {
    public int maxArea(int[] heights) {
        int i=0,j=heights.length-1,max=0;
        while(i<j){
            int width= j-i;
            int height=Math.min(heights[i],heights[j]);
            max=Math.max(max,width*height);
            if(heights[i]<heights[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}
