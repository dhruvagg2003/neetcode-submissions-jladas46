class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,max=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int r=0;r<s.length();r++){
            char ch=s.charAt(r);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while((r-l+1)-maxF(map)>k){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                l++;
            }
            max=Math.max(max,r-l+1);
        }
        return max;
    }
    private int maxF(HashMap<Character,Integer> map){
        int max=0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            Character key=entry.getKey();
            int value=entry.getValue();
            max=Math.max(max,entry.getValue());
        }
        return max;
    }
    
}
