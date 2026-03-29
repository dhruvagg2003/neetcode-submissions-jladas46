class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int num:nums) set.add(num);
        int count=1,max=0;;
        for(int num:nums){
            count=1;
            if(!set.contains(num-1)){
                //num= 1st element
                while(set.contains(num+1)){
                    count++;
                    num=num+1;
                }
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
