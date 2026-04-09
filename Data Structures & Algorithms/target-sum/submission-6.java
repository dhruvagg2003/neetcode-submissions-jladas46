class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int sum=0;
        for(int num: nums) sum+=num;
        
        if((sum+target)%2!=0 || sum<Math.abs(target)) return 0;
        int newT=(sum+target)/2;
        int[][] dp=new int[nums.length+1][newT+1];
        for(int i=0;i<=nums.length;i++){
            dp[i][0]=1;
        }
        for(int i=1;i<=nums.length;i++){
            int num=nums[i-1];
            for(int j=0;j<=newT;j++){
                if(j>=num){
                    dp[i][j]=dp[i-1][j]+dp[i-1][j-num];
                }else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[nums.length][newT];
    }
}
