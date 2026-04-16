class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;
        if(sum%2!=0) return false;
        int newTarget=sum/2;
        boolean[][] dp=new boolean[nums.length+1][newTarget+1];
        for(int i=0;i<=nums.length;i++) dp[i][0]=true;

        for(int i=1;i<=nums.length;i++){
            int num=nums[i-1];
            for(int j=1;j<=newTarget;j++){
                if(num<=j){
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-num];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][newTarget];
    }
}
