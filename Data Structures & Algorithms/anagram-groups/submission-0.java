class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map=new HashMap<>();
        List<List<String>> ml=new ArrayList<>();
        for(String str: strs){
            char[] arr=str.toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            if(!map.containsKey(sorted)){
                List<String> list=new ArrayList<>();
                list.add(str);
                map.put(sorted,list);
            }else{
                List<String> list= map.get(sorted);
                list.add(str);
                map.put(sorted,list);
            }
        }
        for(String key:map.keySet()){
            ml.add(map.get(key));
        }
        return ml;
    }
}
