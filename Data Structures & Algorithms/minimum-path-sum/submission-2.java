class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m+1][n+1];
        for(int i=0;i<m+1;i++){
            dp[i][n]=(int)1e9;
        }
        for(int i=0;i<n+1;i++){
            dp[m][i]=(int)1e9;
        }
        dp[m-1][n-1]=grid[m-1][n-1];
        for(int i=m-1;i>=0;i--){
            for(int j=n-1;j>=0;j--){
                if(i==m-1 && j==n-1) continue;
                dp[i][j]=Math.min(grid[i][j]+dp[i+1][j],grid[i][j]+dp[i][j+1]);
           
            }
        }
        return dp[0][0];
    }
}