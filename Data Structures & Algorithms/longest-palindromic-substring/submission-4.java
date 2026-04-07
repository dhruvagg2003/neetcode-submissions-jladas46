class Solution {
    public String longestPalindrome(String s) {
        int max=0,start=0;
        boolean[][] dp=new boolean[s.length()][s.length()];
        for(int i=0;i<s.length();i++) dp[i][i]=true;
        for(int i=s.length()-1;i>=0;i--){
            for(int j=i;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                     if(j-i<=2){
                        dp[i][j]=true;
                     }else{
                        dp[i][j]=dp[i+1][j-1];
                     }
                }

                if(dp[i][j]){
                    if(max<j-i+1){
                    max=Math.max(max,j-i+1);
                    start=i;
                    }
                }
            }
        }
        return s.substring(start,start+max);
    }
}
