class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int low=maxF(weights);
        int high=sum(weights);
        int ans=high+1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int tdays=0;
            int sum=0;
            for(int num:weights){
                sum+=num;
                if(sum>mid){
                    tdays++;
                    sum=num;
                }else if(sum==mid){
                    tdays++;
                    sum=0;
                }
            }
            if(sum>0) tdays++;
            if(tdays<=days){
                ans=Math.min(ans,mid);
                high=mid-1;
            }else{
                low=mid+1;
            }
        }
        return ans;
    }
    private int maxF(int[] nums){
        int max=-1;
        for(int num:nums) max=Math.max(max,num);
        return max;
    }
    private int sum(int[] nums){
        int sum=0;
        for(int num:nums) sum+=num;
        return sum;
    }
}