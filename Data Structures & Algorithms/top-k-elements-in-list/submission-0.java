class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] arr= new int[k];
        HashMap<Integer,Integer> map=new HashMap<>();//num,freq
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        // [11,22,22,33,33,33]
        // 11->1
        // 22->2
        // 33->3
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int key:map.keySet()){
            pq.offer(key);
            if(pq.size()>k) pq.poll();
        }
        int i=0;
        while(!pq.isEmpty()){
            arr[i]=pq.peek();
            pq.poll();
            i++;
        }
        return arr;
    }
}
