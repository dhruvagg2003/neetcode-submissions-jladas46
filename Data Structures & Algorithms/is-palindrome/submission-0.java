class Solution {
    public boolean isPalindrome(String s) {
        String str= s.trim().replaceAll("\\s+","").replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] arr= str.toCharArray();
        int i=0,j=arr.length-1;
        while(i<=j){
            if(arr[i]!=arr[j]) return false;
            i++;
            j--;
        }
        return true;
    }
}
// 0123456
// racecar
// 0123
// abab