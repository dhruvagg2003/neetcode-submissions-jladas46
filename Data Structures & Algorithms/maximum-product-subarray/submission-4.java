class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int[] mindp=new int[nums.length];
        int[] maxdp=new int[nums.length];
        mindp[0]=nums[0];
        maxdp[0]=nums[0];
        int max=0;
        for(int i=1;i<nums.length;i++){
            mindp[i]=Math.min(nums[i], Math.min(nums[i]*mindp[i-1], nums[i]*maxdp[i-1]));
            maxdp[i]=Math.max(nums[i], Math.max(nums[i]*mindp[i-1], nums[i]*maxdp[i-1]));
            max=Math.max(max,maxdp[i]);
        }
        return max;
    }
}
