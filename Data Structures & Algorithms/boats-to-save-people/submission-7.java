class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int l=0,r=people.length-1,boat=0;
        Arrays.sort(people);
        while(l<=r){
            if(people[l]+people[r]<=limit){
                boat++;
                l++;
                r--;
            }else if(people[l]+people[r]>limit){
                r--;
                boat++;
            }
        }
        return boat;
    }
}