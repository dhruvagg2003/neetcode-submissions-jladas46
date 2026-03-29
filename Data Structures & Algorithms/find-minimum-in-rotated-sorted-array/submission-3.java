class Solution {
    public int findMin(int[] nums) {
        if(nums[0]<nums[nums.length-1]) return nums[0];
        int l=0,h=nums.length-1;
        int ans=Integer.MAX_VALUE;
        while(l<=h){
            int mid=l+(h-l)/2;
            if(nums[l]<=nums[mid]){
                ans=Math.min(ans,nums[l]);
                l=mid+1;
            }else{
                h=mid-1;
                ans=Math.min(ans,nums[mid]);
            }
        }
        return ans;
    }
}
