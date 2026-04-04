class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(allNeg(nums)){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }
        int cs=0,ms=0;
        for(int num:nums){
            cs+=num;
            if(cs<0) cs=0;
            ms=Math.max(ms,cs);
        }
        return ms;
    }
    public boolean allNeg(int[] nums){
        for(int num:nums){
            if(num>=0) return false;
        }
        return true;
    }
}
