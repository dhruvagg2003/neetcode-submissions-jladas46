class Solution {
    // 2  1
    // 5 3 4 5
    //   l   r
    // alice 5
    // bob 
    public boolean stoneGame(int[] piles) {
        int l=0;
        int r=piles.length-1;
        int alice=0,bob=0;
        while(l<r){
            if(piles[l]>=piles[r]){
                alice+=piles[l];
                l++;
                bob+=piles[r];
                r--;
            }else{
                alice+=piles[r];
                r--;
                bob+=piles[l];
                l++;
            }
        }
        return alice>bob;
    }
}