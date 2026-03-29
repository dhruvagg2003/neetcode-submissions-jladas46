class Solution {
    public void rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(0,nums.length-1,nums);
        reverse(0,k-1,nums);
        reverse(k,nums.length-1,nums);
    }
    private void reverse(int start,int end,int[] nums){
        int i=start,j=end;
        while(i<=j){
            swap(i,j,nums);
            i++;
            j--;
        }
    }
    private void swap(int i,int j,int[] nums){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}