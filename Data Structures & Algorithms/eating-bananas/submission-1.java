class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1,high=max_num(piles);
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int time=0;
            for(int banana:piles){
                time+=hours(banana,mid);
            }
            if(time<=h){
                ans=mid;
                high=mid-1;
                
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private int max_num(int[] piles){
        int max=-1;
        for(int num:piles){
            max=Math.max(max,num);
        }
        return max;
    }
    private int hours(int pile,int k){
        int result=0;
        return result=(pile%k==0)?pile/k:(pile/k)+1;
    }
}
