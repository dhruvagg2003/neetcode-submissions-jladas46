class Solution {
    // -1,0,1,2,3
    public int[] productExceptSelf(int[] nums) {
        int[] result=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            result[i]= left(nums,i)*right(nums,i);
        }
        return result;
    }
    private int left(int[] nums,int idx){
        int prd=1;
        for(int i=0;i<idx;i++){
            prd*=nums[i];
        }
        return prd;
    }
    private int right(int[] nums,int idx){
        int prd=1;
        for(int i=idx+1;i<nums.length;i++){
            prd*=nums[i];
        }
        return prd;
    }
}  
