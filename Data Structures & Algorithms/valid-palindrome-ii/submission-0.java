class Solution {
    public boolean validPalindrome(String s) {
        if(palindrome(s)) return true;
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            sb.deleteCharAt(i);
            if(palindrome(sb.toString())) return true;
            sb.insert(i,s.charAt(i));
        }
        return false;
    }
    private boolean palindrome(String s){
        if(s.length()==0 || s.length()==1) return true;
        int i=0,j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}