class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ml=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int j=i+1,k=nums.length-1;
            while(j<k){
                int sum=nums[i]+nums[j]+nums[k];
                if(sum<0){
                    j++;
                }else if(sum>0){
                    k--;
                }else{
                    List<Integer> list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    if(!ml.contains(list)) ml.add(list);
                    j++;
                    k--;
                }
            }
        }
        return ml;
    }
}



// -4,-1,-1,0,1,2
//     i  j     k
//  sum= -1-1+2= 0
//  j++