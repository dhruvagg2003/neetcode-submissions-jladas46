class Solution {
    public int mySqrt(int x) {
        int low=1,high=x;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid>x/mid){
                high=mid-1;
            }else{
                low=mid+1;
                result=mid;
            }
        }
        return result;
    }
}