class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minCap=maxF(weights);
        int maxCap=sum(weights);

        for(int i=minCap;i<=maxCap;i++){
            int tdays=0;
            int sum=0;
            for(int num:weights){
                sum+=num;
                if(sum>i){
                    tdays++;
                    sum=num;
                }else if(sum==i){
                    tdays++;
                    sum=0;
                }
            }
            if(sum>0) tdays++;
            if(tdays<=days) return i;
        }
        return -1;
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