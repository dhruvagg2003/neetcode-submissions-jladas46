class Solution {
    public boolean lemonadeChange(int[] bills) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int bill:bills){
            map.put(bill,map.getOrDefault(bill,0)+1);
            if(bill==10){
                if(map.containsKey(5) && map.get(5)>0){
                    map.put(5,map.get(5)-1);
                }else return false;
            }else if(bill==20){
                if(map.containsKey(5) && map.get(5)>=3){
                    map.put(5,map.get(5)-3);
                }
                else if(map.containsKey(10) && map.containsKey(5) && map.get(5)>0 && map.get(10)>0){
                    map.put(5,map.get(5)-1);
                    map.put(10,map.get(10)-1);
                }else return false;
            }
        }
        return true;
    }
}