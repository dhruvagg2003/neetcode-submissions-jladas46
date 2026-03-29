class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        StringBuilder w1=new StringBuilder(word1);
        StringBuilder w2=new StringBuilder(word2);
        int len= Math.min(word1.length(),word2.length());
        for(int i=0;i<len;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
            w1.deleteCharAt(0);
            w2.deleteCharAt(0);
        }
        StringBuilder rem= (w1.length()==0)?w2:w1;
        sb.append(rem);
        return sb.toString();
    }
}