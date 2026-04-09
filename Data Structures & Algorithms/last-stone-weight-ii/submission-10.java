class Solution {
    public int lastStoneWeightII(int[] stones) {
        int sum=0;
        for(int stone:stones) sum+=stone;
        int target=sum/2;
        int half=0;
        boolean[][] dp=new boolean[stones.length+1][target+1];

        for(int i=0;i<=stones.length;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=stones.length;i++){
            for(int j=1;j<target+1;j++){
                if(j>=stones[i-1]){
                    dp[i][j]= dp[i-1][j] || dp[i-1][j-stones[i-1]];
                }else{
                    dp[i][j]= dp[i-1][j];
                }
            }
        }
        for(int j=target;j>=0;j--){
            if(dp[stones.length][j]){
                 half=j;
                 break;
            }
            
        }
        return sum-2*half;
    }
}